package utilitarios;

import java.io.*;
import java.util.List;
import java.util.UUID;
import java.util.zip.*;

/**
 * Clase de soporte para la compresi�n y descompresi�n de archivos ZIP
 * @version 1.0
 */
public class ZipHelper {

    /**
     * @return Genera un nombre de archivo temporal utilizando UUID
     */
    public static String GenerateTempFileName()
	{
		return GenerateUUID().concat(".tmp");
	}
    
    /**
     * @return Genera un UUID(Universally Unique Identifier) aleatorio. 
     */
    public static String GenerateUUID()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
    
    /**
     * Convierte un archivo zip contenido en un arreglo de bytes a un stream 
     * @param zipFileBytes bytes conteniendo un archivo zip 
     * @return zipInputStream conteniendo el archivo zip 
     */
    public static ZipInputStream GetZipInputStream(byte[] zipFileBytes)
    {
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(zipFileBytes);
			bout.flush();
			ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
			bout.close();
			ZipInputStream zis = new ZipInputStream(bin);
			bin.close();
			return zis;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
    }
    
    /**
     * Muestra informaci�n de archivo contenido en el zip
	 * @param e
	 */
	public static void print(ZipEntry e) {

		PrintStream err = System.err;
		err.print("added " + e.getName());

		if (e.getMethod() == ZipEntry.DEFLATED) {

		long size = e.getSize();

		if (size > 0) {

		long csize = e.getCompressedSize();
		long ratio = ((size - csize) * 100) / size;
		err.println(" (deflated " + ratio + "%)");
		} else {
		err.println(" (deflated 0%)");
		}
		} else {
		err.println(" (stored 0%)");
		}
	}

	/**
	 * Descomprime un elemento contenido en un archivo zip y lo almacena en un arreglo de bytes
	 * @param zip archivo comprimido zip
	 * @param entry elemento a descomprimir
	 * @return elemento descomprimido
	 */
	public static byte[] UnzipToByteArray(ZipFile zip, ZipEntry entry) {
		try {
			int size = 0;
			BufferedInputStream bis = new BufferedInputStream(zip.getInputStream(entry));
			ByteArrayOutputStream byaos = new ByteArrayOutputStream();
			
			byte[] buffer = new byte[2048];
			BufferedOutputStream bos = new BufferedOutputStream(byaos, buffer.length);
			while ((size = bis.read(buffer, 0, buffer.length)) != -1) {
				bos.write(buffer, 0, size);
			}
			bos.flush();
			bos.close();
			byaos.close();
			bis.close();
			return byaos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Descomprime un elemento contenido en un archivo zip y lo almacena en un arreglo de bytes
	 * @param zis stream conteniendo el archivo comprimido zip
	 * @return elemento descomprimido
	 */
	public static byte[] UnzipToByteArray(ZipInputStream zis) {
		try {
			ByteArrayOutputStream byaos = new ByteArrayOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(byaos);
			for (int c = zis.read(); c != -1; c = zis.read()) {
				bos.write(c);
			}
			bos.flush();
			bos.close();
			byaos.close();
			return byaos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Descomprime un elemento contenido en un archivo zip y escribe en un archivo
	 * @param zis stream conteniendo el archivo comprimido zip
	 * @param fileName nombre del archivo descomprimido
	 * @return true - Si la descompresion fue exitosa.
	 */
	public static boolean UnzipToFile(ZipInputStream zis, String fileName) {
		try {
			FileOutputStream fout = new FileOutputStream(fileName);
			for (int c = zis.read(); c != -1; c = zis.read()) {
				fout.write(c);
			}
			zis.closeEntry();
			fout.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Descomprime un elemento contenido en un archivo zip y lo almacena en un String
     * @param zip archivo comprimido zip
	 * @param entry elemento a descomprimir
     * @return elemento descomprimido
     */
    public static String UnzipToString(ZipFile zip, ZipEntry entry) {
    	String content = "";
		try {
			InputStreamReader isr = new InputStreamReader(zip.getInputStream(entry));
			StringBuffer fileData = new StringBuffer(1000);
	        BufferedReader reader = new BufferedReader(isr);
	        char[] buf = new char[1024];
	        int numRead=0;
	        while((numRead=reader.read(buf)) != -1){
	            String readData = String.valueOf(buf, 0, numRead);
	            fileData.append(readData);
	            buf = new char[1024];
	        }
	        content = fileData.toString();
	        reader.close();			
			isr.close();
			return content;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * Comprime la lista de archivos en un Zip representado en un arreglo de Bytes
	 * @param filesNames lista de nombres de todos los archivos a comprimir
	 * @param files lista de archivos(byte[]) a comprimir
	 * @return arreglo de bytes conteniendo el archivo zip
	 */
	public static byte[] ZipToByteArray(List<String> filesNames, List<byte[]> files) {
		try {
			String tempZipFile = GenerateTempFileName();
			FileOutputStream fout = new FileOutputStream(tempZipFile);
			ZipOutputStream zos = new ZipOutputStream(fout);
			int j = 0;
			
			for(byte[] oneFile : files)
			{
				ZipEntry entry = new ZipEntry(filesNames.get(j));
				zos.putNextEntry(entry);
				zos.write(oneFile);
		        zos.closeEntry();
		        print(entry);
		        j++;
			}
			zos.close();
			fout.close();
			byte[] finalZip = ByteUtil.loadBytesFromFile(tempZipFile);
			new File(tempZipFile).delete();
			return finalZip;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static byte[] ZipToByteArray(String filesName, byte[] file) {
		try {
			String tempZipFile = GenerateTempFileName();
			FileOutputStream fout = new FileOutputStream(tempZipFile);
			ZipOutputStream zos = new ZipOutputStream(fout);
			ZipEntry entry = new ZipEntry(filesName);
			zos.putNextEntry(entry);
			zos.write(file);
	        zos.closeEntry();
	        print(entry);
			zos.close();
			fout.close();
			byte[] finalZip = ByteUtil.loadBytesFromFile(tempZipFile);
			new File(tempZipFile).delete();
			return finalZip;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
