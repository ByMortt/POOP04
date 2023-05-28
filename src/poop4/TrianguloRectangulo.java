/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class TrianguloRectangulo {
    // Atributos
    public int base;
    public int altura;
    
    // Constructores
    /**
     * Constructor vacío de la clase TrianguloRectangulo.
     * Crea un objeto TrianguloRectangulo sin inicializar sus atributos.
     */
    public TrianguloRectangulo() {
    }

    /**
     * Constructor de la clase TrianguloRectangulo.
     * Crea un objeto TrianguloRectangulo con la base y altura especificadas.
     * 
     * @param base La base del triángulo rectángulo.
     * @param altura La altura del triángulo rectángulo.
     */
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Métodos
    
    /**
     * Método que calcula y muestra el área del triángulo rectángulo.
     * Imprime un mensaje indicando que el triángulo rectángulo tiene un área.
     */
    public void area(){
        System.out.println("Este triángulo rectángulo tiene un área");
    }
    
    /**
     * Método que calcula y muestra el perímetro del triángulo rectángulo.
     * Imprime un mensaje indicando que el triángulo rectángulo tiene un perímetro.
     */
    public void perimetro(){
        System.out.println("Este triángulo rectángulo tiene perímetro");
    }
}

