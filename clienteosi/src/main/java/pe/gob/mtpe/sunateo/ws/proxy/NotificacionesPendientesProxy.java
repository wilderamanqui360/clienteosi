package pe.gob.mtpe.sunateo.ws.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.annotation.Resource;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;

import pe.gob.mtpe.sunateo.ws.Notificacion;
import pe.gob.mtpe.sunateo.ws.ObtenerNotificacionesPendientesResponse;
import pe.gob.mtpe.sunateo.ws.SunateoService;
import pe.gob.mtpe.sunateo.ws.Transaccion;
import pe.gob.mtpe.sunateo.ws.dao.NotificacionDAO;

@Component
public class NotificacionesPendientesProxy implements INotificacionesPendientesProxy {

	@Resource
	@Qualifier("wsNotificaciones")
	private SunateoService  wsNotificaciones;
	
	@Autowired
	private NotificacionDAO notificacionDAO;
	
	public ObtenerNotificacionesPendientesResponse obtenerNotificacionesPendientes(String a) throws IOException{
		
		//WsNotificaciones wsNotificaciones= new WsNotificaciones();
		//WsNotificacionesPortType wsNotificacionesPortType=wsNotificaciones.getWsNotificacionesHttpSoap12Endpoint();
		Transaccion tx=wsNotificaciones.obtenerNotificacionesPendientes(a);
        System.out.println("sizeee:  "+tx.getNotificaciones().size());
        List<Notificacion> notificaciones=tx.getNotificaciones();
        for(Notificacion notificacion:notificaciones){
        	;
        	System.out.println(""+notificacion.getFormxml());
        	byte[] decoded = DatatypeConverter.parseBase64Binary(notificacion.getFormxml());
        	System.out.println("ecncoded value is " + new String(decoded ));
        	notificacionDAO.insertarDato(new String(decoded));
        }
        
		
		
		
		
		
		
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
