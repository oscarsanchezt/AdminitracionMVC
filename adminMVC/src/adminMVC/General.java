package adminMVC;

import java.awt.EventQueue;
import model.Modelo;
import view.Vista;
import controller.Controlador;

public class General {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Crear instancia del modelo
                    Modelo modelo = new Modelo();
                    
                    // Crear instancia de la vista
                    Vista vista = new Vista();
                    
                    // Crear instancia del controlador y pasar el modelo y la vista como parámetros
                    Controlador controlador = new Controlador(modelo, vista);
                    
                    // Inicia la aplicación
                    controlador.iniciar();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
