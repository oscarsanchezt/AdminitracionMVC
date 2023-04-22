package controller;

import model.Modelo;
import view.Vista;

public class Controlador {

    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        // Agregar listeners para manejar eventos de la interfaz gráfica
    }

    public void iniciar() {
        vista.show();
    }
}
