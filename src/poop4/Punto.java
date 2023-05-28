/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Punto {
    // Declaración de atributos
    int x;
    int y;
    
    // Constructores
    
    /**
     * Constructor vacío de la clase Punto.
     * Crea un objeto Punto con las coordenadas (0, 0).
     */
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Constructor de la clase Punto.
     * Crea un objeto Punto con las coordenadas especificadas.
     * 
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     */
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Métodos
    
    /**
     * Método que imprime las coordenadas del punto.
     * Imprime un mensaje con las coordenadas x e y del punto.
     */
    public void imprimirPunto(){
        System.out.println("x = " + x + ", y = " + y);
    }
}
