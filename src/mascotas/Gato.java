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
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
     public void hacerSonido() {
        // Ejecutar el sonido en un hilo separado
        new Thread(() -> {
            reproducirSonido("C:\\Users\\37119397\\Documents\\NetBeansProjects\\Mascotas\\src\\Sonidos\\Gato.wav");
        }).start();

        // Mostrar ventana mientras suena
        String mensaje = nombre + " dice: ¡Miau!";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public String obtenerInfo() {
        return "Información del Gato:\nNombre: " + nombre + "\nEdad: " + edad + " años";
    }
}