/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia2_1;

/**
 *
 * @author USUARIO
 */
public class profesor extends classPersona{
    
       private String titulo;
    private String Dedicacion;
    

    public profesor ( String  Nombre , String  Direccion , String  Fecha , String  Genero , int  Edad , String  Titulo , String  Dedicacion ) {

        this. Nombre  =  Nombre ;
        this . direccion =  Direccion ;
        this . fechaNc =  Fecha ;
        this. Genero  =  Genero ;
        this . Edad  =  Edad ;
        this. titulo  =  Titulo ;
        this. Dedicacion  =  Dedicacion ;

    }

     public profesor () {

    }

    public  String  getTitulo () {
        return  titulo ;
    }

    public  void  setTitulo ( String  Titulo ) {
        this. titulo  =  Titulo ;
    }

    public  String  getDedicacion () {
        return Dedicacion ;
    }

    public  void  setDedicacion ( String  Dedicacion ) {
        this. Dedicacion  =  Dedicacion ;
    }

    public  String  getNombre () {
        return  Nombre ;
    }

    public  void  setNombre ( String  Nombre ) {
        this . Nombre  =  Nombre ;
    }

    public  String  getDireccion () {
        return direccion;
    }

    public  void  setDireccion ( String  direccion ) {
        this. direccion = direccion;
    }

    public  String  getFechaNc () {
        return fechaNc;
    }

    public  void  setFechaNc ( String  fechaNc ) {
        this. fechaNc = fechaNc;
    }

    public  String  getGenero () {
        return  Genero ;
    }

    public  void  setGenero ( String  Genero ) {
        this . Genero  =  Genero ;
    }

    public  int  getEdad () {
      this.Edad=this.Edad;
        return  Edad ;
    }

    public  void  setEdad ( int  Edad ) {
        this . Edad  =  Edad ;
    }

   

    

    public  String  esMayorDeEdad () {
        int edad =  this. Edad ;
        if (edad < 18 ) {
        return " Eres menor de edad " ;
        }
        else {
        return  " Eres mayor de edad " ;
        }

    }

    
    public String mostrarProfesor() {
        return "profesor{"+ "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + "titulo=" + titulo + ", Dedicacion=" + Dedicacion + '}';
    }

    public String sinEdad() {
        return "profesor{"+ "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero  + "titulo=" + titulo + ", Dedicacion=" + Dedicacion + '}';
    }
    public String sinTitulo() {
        return "profesor{"+ "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero   + ", Dedicacion=" + Dedicacion + '}';
    }
}


