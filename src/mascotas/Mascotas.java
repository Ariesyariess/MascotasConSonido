/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotas;
import javax.swing.JOptionPane;
/**
 *
 * @author 37119397
 */
public class Mascotas {
    public static void main(String[] args) {
        // Crear instancias de las clases hijas
        Perro perro = new Perro("Luna", 3);
        Gato gato = new Gato("Michi", 2);
        Pajaro pajaro = new Pajaro("Piolín", 1);

        // Mostrar la información en una ventana emergente
        JOptionPane.showMessageDialog(null, perro.obtenerInfo());
        perro.hacerSonido(); // Reproduce el sonido y muestra el mensaje

        JOptionPane.showMessageDialog(null, gato.obtenerInfo());
        gato.hacerSonido(); // Reproduce el sonido y muestra el mensaje

        JOptionPane.showMessageDialog(null, pajaro.obtenerInfo());
        pajaro.hacerSonido(); // Reproduce el sonido y muestra el mensaje
    }
}