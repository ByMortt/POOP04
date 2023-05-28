/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Perro {
    // Atributos
    public String nombre;
    public String color;
    public String raza;
    public float peso;
    public float edad;
    
    // Constructores

    /**
     * Constructor vacío de la clase Perro.
     * Crea un objeto Perro sin inicializar sus atributos.
     */
    public Perro() {
    }

    /**
     * Constructor de la clase Perro.
     * Crea un objeto Perro con los atributos especificados.
     * 
     * @param nombre El nombre del perro.
     * @param color El color del perro.
     * @param raza La raza del perro.
     * @param peso El peso del perro en kilogramos.
     * @param edad La edad del perro en años.
     */
    public Perro(String nombre, String color, String raza, float peso, float edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
    
    // Métodos
    
    /**
     * Método que simula el ladrido de un perro.
     * Imprime el sonido "guaf".
     */
    public void ladrar(){
        System.out.println("guaf");
    }
    
    /**
     * Método que simula que el perro está comiendo.
     * Imprime un mensaje indicando que el perro está comiendo croquetas.
     */
    public void comer(){
        System.out.println("El perro come croqueta");
    }
    
    /**
     * Método que simula que el perro está durmiendo.
     * Imprime un mensaje indicando que el perro está durmiendo plácidamente.
     */
    public void dormir(){
        System.out.println("El perro mima a gusto, qué fresco");
    }
    
    /**
     * Método que simula que el perro está jugando.
     * Imprime un mensaje indicando que el perro está jugando con un gato naranja.
     */
    public void jugar(){
        System.out.println("El perro juega con el gato naranja");
    }
    
    /**
     * Método que simula que el perro está descansando.
     * Imprime un mensaje indicando que el perro está descansando en sus aposentos.
     */
    public void descansar(){
        System.out.println("El lomito descansa en sus aposentos");
    }
}

