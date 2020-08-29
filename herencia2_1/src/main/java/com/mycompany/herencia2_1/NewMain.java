/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia2_1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner (System.in);
        System.out.println ( " ESCRIBE TU NOMBRE " );
        String  Nombre  = sc.nextLine();
        System.out.println ( " ESCRIBE TU DIRECCION " );
        String  Direccion  = sc.nextLine();
         System.out.println( " ESCRIBE TU FECHA DE NACIMIENTO " );
        String  Fecha  = sc.nextLine();
        System.out.println( " ESCRIBE TU EDAD " );
        int  Edad  = sc . nextInt ();
        
         String Genero=sc.nextLine();



        profesor profe =  new profesor ();


        profe . setNombre ( Nombre );
        profe . setDireccion ( Direccion );
        profe . setEdad ( Edad );
        profe . setFechaNc ( Fecha );
        profe . setGenero ( Genero );
        System.out.println(profe . esMayorDeEdad ());
        
        System.out.println ( profe .mostrarProfesor ());
//          System.out.println ( profe.sinEdad());
//            System.out.println ( profe.sinTitulo());
            
    // SEGUNDA PRACTICA   
    
    
//     Scanner s= new Scanner(System.in);
//        System.out.println("Ingrese el costo del veiculo");
//       int  cos = s.nextInt();
//        
//        ejemploClase cod= new ejemploClase();
//       
//         cod.setCosto(cos);
//        System.out.println(cod.VeriCosto());
//    }
    

    }
}