/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo1;

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.StringTokenizer;

/**
 *
 * @author Fernando Carranza
 */
public class Iniciales {

    public static void main(String[] args) {
        File f = new File("src\\archivo\\archivo.txt");
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(f));
            String linea;
            while (entrada.ready()) {
                linea = entrada.readLine();
                System.out.println("Nombre Completo del txt: " + linea);
                StringTokenizer stPalabras = new StringTokenizer(linea);
                while (stPalabras.hasMoreTokens()) {
                    String sPalabra = stPalabras.nextToken();
                    System.out.println("Iniciales del nombre: " + sPalabra.substring(0,1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
            } catch (IOException e1) {
            }
        }
    }
}
