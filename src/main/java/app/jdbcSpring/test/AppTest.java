package app.jdbcSpring.test;

import app.jdbcSpring.dao.ServicioDao;
import app.jdbctemplate.model.Local;
import app.jdbctemplate.model.Servicio;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {
        
        AppTest.save();
    }

    
    public static void save() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Jdbc_database.xml");
        ServicioDao servicioDAO = (ServicioDao) context.getBean("servicioDAO");

        Servicio servicio = new Servicio();
        servicio.setDescripcion("Servicio Implementado");
        servicio.setCostoHora(5.55);
        servicioDAO.save(servicio);
    }
    
    public static void getServicio(Servicio servicio) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Jdbc_database.xml");

        ServicioDao servicioDAO = (ServicioDao) context.getBean("servicioDAO");
        Servicio servicioFull = servicioDAO.get(servicio);
        System.out.println(servicioFull.getDescripcion() + " " + servicioFull.getCostoHora());
    }
}
