/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class POOP4 {

    /**
     * Punto de entrada principal de la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Creación de objetos y uso de métodos
        
        Punto p1 = new Punto();
        p1.imprimirPunto();
        
        Punto p2 = new Punto(2, 3);
        p2.imprimirPunto();
        
        System.out.println(p1);
        
        System.out.println("*********************");
        
        Perro guayabo = new Perro();
        System.out.println("Nombre: " + guayabo.nombre);
        guayabo.nombre = "guayabo";
        guayabo.color = "cafe";
        guayabo.raza = "electrico";
        guayabo.peso = (float) 32.6;
        guayabo.edad = 5.0f;
        System.out.println("Nombre: " + guayabo.nombre);
        
        System.out.println("*********************");
        
        Perro kira = new Perro("Kira", "blanco", "Husky", 15.02f, (float) 10.0);
        System.out.println(kira.nombre);
        System.out.println(kira.color);
        System.out.println(kira.raza);
        System.out.println(kira.peso);
        System.out.println(kira.edad);
        
        System.out.println("*********************");
        
        Coche miCoche = new Coche("Dodge", "Charger", 1996, "Negro");
        System.out.println(miCoche.marca);
        System.out.println(miCoche.modelo);
        System.out.println(miCoche.anio);
        System.out.println(miCoche.color);
        
        System.out.println("*********************");
        
        TrianguloRectangulo tri1 = new TrianguloRectangulo(15, 2);
        System.out.println(tri1.base);
        System.out.println(tri1.altura);
        
        System.out.println("*********************");
        
        Alumno yo = new Alumno("Oscar", "de la Cruz", 317167434, 21, 8.1f);
        System.out.println(yo.nombre);
        System.out.println(yo.apellido);
        System.out.println(yo.numDeCuenta);
        System.out.println(yo.edad);
        System.out.println(yo.calificacion);
        
        System.out.println("*********************");
        
        Profesor profe1 = new Profesor("Pablo", "Perez", "POO", 56218967, 31);
        System.out.println(profe1.nombre);
        System.out.println(profe1.apellido);
        System.out.println(profe1.materia);
        System.out.println(profe1.numDeCuenta);
        System.out.println(profe1.edad);
        
        System.out.println("*********************");
        
        System.out.println(kira.toString());
    }
}

