/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Profesor {
    // Atributos
    public String nombre;
    public String apellido;
    public String materia;
    public double numDeCuenta;
    public int edad;
    
    // Constructores
    /**
     * Constructor vacío de la clase Profesor.
     * Crea un objeto Profesor sin inicializar sus atributos.
     */
    public Profesor() {
    }
    
    /**
     * Constructor de la clase Profesor.
     * Crea un objeto Profesor con los atributos especificados.
     * 
     * @param nombre El nombre del profesor.
     * @param apellido El apellido del profesor.
     * @param materia La materia que imparte el profesor.
     * @param numDeCuenta El número de cuenta del profesor.
     * @param edad La edad del profesor.
     */
    public Profesor(String nombre, String apellido, String materia, double numDeCuenta, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.numDeCuenta = numDeCuenta;
        this.edad = edad;
    }
    
    // Métodos
    
    /**
     * Método que simula que el profesor está enseñando.
     * Imprime un mensaje indicando que el profesor está enseñando.
     */
    public void enseniar(){
        System.out.println("El profesor está enseñando");
    } 
    
    /**
     * Método que simula que el profesor está reprobando a los alumnos.
     * Imprime un mensaje indicando que el profesor está reprobando a los alumnos.
     */
    public void reprobar(){
        System.out.println("El profesor está reprobando a los alumnos");
    }
    
    /**
     * Método que simula que el profesor está aprobando a un alumno.
     * Imprime un mensaje indicando que el profesor ha sido benevolente y aprobó al alumno.
     */
    public void aprobar(){
        System.out.println("El profesor es benevolente y aprobó al alumno");
    }
    
    /**
     * Método que simula que el profesor está comiendo.
     * Imprime un mensaje indicando que el profesor está comiendo a gusto.
     */
    public void comer(){
        System.out.println("El profesor está comiendo a gusto, qué fresco");
    }
}

