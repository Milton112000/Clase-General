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
public class classEstudiante extends classPersona {
     private int matricula;
  private String carrera;
  
    public  classEstudiante ( String  Nombre , String  Direccion , String  Fecha , String  Genero , int  Edad , int  Matricula , String  Carrera ) {
        this . Nombre  =  Nombre ;
        this . direccion =  Direccion ;
        this . fechaNc =  Fecha ;
        this . Genero  =  Genero ;
        this. Edad  =  Edad ;
        this. matricula  =  Matricula ;
        this. carrera  =  Carrera ;

    }

    public  int  getMatricula () {
        return  matricula ;
    }

    public  void  setMatricula ( int  Matricula ) {
        this . matricula  =  Matricula ;
    }

    public  String  getCarrera () {
        return  carrera ;
    }

    public  void  setCarrera ( String  Carrera ) {
        this . carrera  =  Carrera ;
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
        this . fechaNc = fechaNc;
    }

    public  String  getGenero () {
        return  Genero ;
    }

    public  void  setGenero ( String  Genero ) {
        this . Genero  =  Genero ;
    }

    public  int  getEdad () {
        return  Edad ;
    }

    public  void  setEdad ( int  Edad ) {
        this . Edad  =  Edad ;
    }
//le fala mobido de otra clase
    @Override
    public String toString() {
        return "classEstudiante{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + "matricula=" + matricula + ", carrera=" + carrera + '}';
    }
    
}
