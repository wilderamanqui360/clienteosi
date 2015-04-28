package pe.gob.mtpe.sunateo.ws.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pe.gob.mtpe.sunateo.ws.ObtenerNotificacionesPendientes;
import pe.gob.mtpe.sunateo.ws.ObtenerNotificacionesPendientesResponse;
import pe.gob.mtpe.sunateo.ws.WsNotificacionesPortType;

@Component
public class NotificacionesPendientesProxy implements INotificacionesPendientesProxy {

	@Resource
	@Qualifier("wsNotificaciones")
	private  WsNotificacionesPortType wsNotificaciones;
	
	public ObtenerNotificacionesPendientesResponse obtenerNotificacionesPendientes(ObtenerNotificacionesPendientes obtenerNotificacionesPendientes) throws IOException{
		
		//WsNotificaciones wsNotificaciones= new WsNotificaciones();
		//WsNotificacionesPortType wsNotificacionesPortType=wsNotificaciones.getWsNotificacionesHttpSoap12Endpoint();
		byte[] notificaciones= wsNotificaciones.obtenerNotificacionesPendientes(1);
		System.out.println(notificaciones);
		FileOutputStream fileOutputStream= new FileOutputStream("file.zip");
		fileOutputStream.write(notificaciones);
		fileOutputStream.close();
		unZipIt("file.zip", "files");
		
		
		
		
		
	return null;	
	}
	
	public void unZipIt(String zipFile, String outputFolder){
		 
	     byte[] buffer = new byte[1024];
	 
	     try{
	 
	    	//create output directory is not exists
	    	File folder = new File("files");
	    	if(!folder.exists()){
	    		folder.mkdir();
	    	}
	 
	    	//get the zip file content
	    	ZipInputStream zis = 
	    		new ZipInputStream(new FileInputStream(zipFile));
	    	//get the zipped file list entry
	    	ZipEntry ze = zis.getNextEntry();
	 
	    	while(ze!=null){
	 
	    	   String fileName = ze.getName();
	           File newFile = new File(outputFolder + File.separator + fileName);
	 
	           System.out.println("file unzip : "+ newFile.getAbsoluteFile());
	 
	            //create all non exists folders
	            //else you will hit FileNotFoundException for compressed folder
	            new File(newFile.getParent()).mkdirs();
	 
	            FileOutputStream fos = new FileOutputStream(newFile);             
	 
	            int len;
	            while ((len = zis.read(buffer)) > 0) {
	       		fos.write(buffer, 0, len);
	            }
	 
	            fos.close();   
	            ze = zis.getNextEntry();
	    	}
	 
	        zis.closeEntry();
	    	zis.close();
	 
	    	System.out.println("Done");
	 
	    }catch(IOException ex){
	       ex.printStackTrace(); 
	    }
	   }    
	
}
