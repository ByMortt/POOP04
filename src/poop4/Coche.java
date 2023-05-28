/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un coche.
 * Contiene atributos y métodos relacionados con los coches.
 * 
 * Los atributos de un coche son: marca, modelo, año y color.
 */
public class Coche {
    // Atributos 
    public String marca;
    public String modelo;
    public int anio;
    public String color;
    
    // Constructores 
    public Coche() {
    }

    /**
     * Constructor de la clase Coche.
     * Crea un objeto Coche con los atributos especificados.
     * 
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     * @param anio El año de fabricación del coche.
     * @param color El color del coche.
     */
    public Coche(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }
    
    // Métodos
    /**
     * Método que simula que el coche avanza.
     * Imprime un mensaje indicando que el coche está avanzando.
     */
    public void avanzar(){
        System.out.println("El coche avanza");
    }
    
    /**
     * Método que simula que el coche retrocede.
     * Imprime un mensaje indicando que el coche está retrocediendo.
     */
    public void retroceder(){
        System.out.println("El coche retrocede");
    }
    
    /**
     * Método que simula que el coche frena.
     * Imprime un mensaje indicando que el coche está frenando.
     */
    public void frenar(){
        System.out.println("El coche frena");
    }
    
    /**
     * Método que simula que el coche acelera.
     * Imprime un mensaje indicando que el coche está acelerando.
     */
    public void acelerar(){
        System.out.println("El coche acelera");
    }   
}
