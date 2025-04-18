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
public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        // Reproducir el sonido en un hilo aparte
        new Thread(() -> {
            reproducirSonido("C:\\Users\\37119397\\Documents\\NetBeansProjects\\Mascotas\\src\\Sonidos\\PerroWAV.wav");
        }).start();

        // Mostrar ventana emergente mientras suena
        String mensaje = nombre + " dice: ¡Guau!";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public String obtenerInfo() {
        return "Información del Perro:\nNombre: " + nombre + "\nEdad: " + edad + " años";
    }
}