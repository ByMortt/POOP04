/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa a un alumno.
 * Contiene atributos y métodos relacionados con los alumnos.
 * 
 * Los atributos de un alumno son: nombre, apellido, número de cuenta, edad y calificación.
 */
public class Alumno {
    // Atributos
    public String nombre;
    public String apellido;
    public double numDeCuenta;
    public int edad;
    public float calificacion;
    
    // Constructores

    /**
     * Constructor vacío de la clase Alumno.
     * Crea un objeto Alumno sin inicializar sus atributos.
     */
    public Alumno() {
    }

    /**
     * Constructor de la clase Alumno.
     * Crea un objeto Alumno con los atributos especificados.
     * 
     * @param nombre El nombre del alumno.
     * @param apellido El apellido del alumno.
     * @param numDeCuenta El número de cuenta del alumno.
     * @param edad La edad del alumno.
     * @param calificacion La calificación del alumno.
     */
    public Alumno(String nombre, String apellido, double numDeCuenta, int edad, float calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDeCuenta = numDeCuenta;
        this.edad = edad;
        this.calificacion = calificacion;
    }
    
    // Métodos
    
    /**
     * Método que simula que el estudiante está estudiando.
     * Imprime un mensaje indicando que el estudiante está estudiando.
     */
    public void estudiar(){
        System.out.println("El estudiante estudia");
    }
    
    /**
     * Método que simula que el estudiante está descansando.
     * Imprime un mensaje indicando que el estudiante está descansando.
     */
    public void descansar(){
        System.out.println("El estudiante descansa de su agonía");
    }
    
    /**
     * Método que simula que el estudiante está comiendo.
     * Imprime un mensaje indicando que el estudiante está comiendo.
     */
    public void comer(){
        System.out.println("El estudiante come en el cibarium");
    }
    
    /**
     * Método que simula el transporte del estudiante.
     * Imprime un mensaje indicando que el estudiante se transporta en el metro.
     */
    public void transportar(){
        System.out.println("El estudiante se transporta en el metro");
    }   
}

