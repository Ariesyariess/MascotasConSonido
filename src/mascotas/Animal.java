/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido(); // Método abstracto para hacer sonido
    public abstract String obtenerInfo(); // Método para obtener información

    public void reproducirSonido(String ruta) {
        try {
            File archivo = new File(ruta);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
}
