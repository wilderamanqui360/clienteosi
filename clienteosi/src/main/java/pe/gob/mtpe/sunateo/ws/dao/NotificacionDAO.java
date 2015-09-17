package pe.gob.mtpe.sunateo.ws.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotificacionDAO {
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void insertarDato(String dato){
    	int rowCount = this.jdbcTemplate.queryForObject("select count(*) from notificacion", Integer.class);
    	
    	//call procedure
    	
    	//this.jdbcTemplate.update(   	        "call SUPPORT.REFRESH_ACTORS_SUMMARY(?)",    	        Long.valueOf(unionId));
    	
    	this.jdbcTemplate.update(
    	        "insert into notificacion (notificacion_id, datanoti) values (?, ?)",
    	        rowCount+1,dato );
    	
    	
    	
    	System.out.println("rowCount:: "+rowCount);
    };
}
