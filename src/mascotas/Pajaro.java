/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;
import javax.swing.JOptionPane;
/**
 *
 * @author 37119397
 */
public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
     public void hacerSonido() {
        // Reproducir el sonido en un hilo aparte
        new Thread(() -> {
            reproducirSonido("C:\\Users\\37119397\\Documents\\NetBeansProjects\\Mascotas\\src\\Sonidos\\AveWAV.wav");
        }).start();

        // Mostrar ventana emergente mientras suena
        String mensaje = nombre + " dice: ¡Pío!";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public String obtenerInfo() {
        return "Información del Pájaro:\nNombre: " + nombre + "\nEdad: " + edad + " años";
    }
}