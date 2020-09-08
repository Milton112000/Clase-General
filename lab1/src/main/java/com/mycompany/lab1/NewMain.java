/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;
 
/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
     Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es su nombre? ");
        String nombre = sc.nextLine();

        System.out.println(nombre);

        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("¿Cuál es su sexo? (F/M)");
        String sexo = sc.next();

        System.out.println("¿Ingresa tu peso peso? ");
        double peso = sc.nextDouble();

        System.out.println("¿Ingresa tu altura? ");
        double altura = sc.nextDouble();

        persona user1 = new persona(nombre, edad, sexo, peso, altura);
        
        persona user2 = new persona(user1.getNombre(), user1.getEdad(), user1.getSexo());

        persona user3 = new persona();
        user3.setNombre(nombre);
        user3.setEdad(edad);
        user3.setSexo(sexo);
        user3.setPeso(peso);
        user3.setAltura(altura);

        System.out.println(user1.toAll()) ;
        System.out.println(user1.esMayordeEdad()) ;
        System.out.println(user2.toString()) ;
        System.out.println(user2.esMayordeEdad()) ;
        System.out.println(user3.toAll()) ;
        System.out.println(user3.esMayordeEdad()) ;
    
    
    }
    
    
}
