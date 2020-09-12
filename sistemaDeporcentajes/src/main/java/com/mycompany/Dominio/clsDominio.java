/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Dominio;

/**
 *
 * @author USUARIO
 */
public class clsDominio {
    private Double Dato1;
    private Double Dato2;

    public Double getDato1() {
        return Dato1;
    }

    public void setDato1(Double Dato1) {
        this.Dato1 = Dato1;
    }

    public Double getDato2() {
        return Dato2;
    }

    public void setDato2(Double Dato2) {
        this.Dato2 = Dato2;
    }
    public Double primerP1 (Double Dato1, Double Dato2){
        this.Dato1=Dato1;
       this.Dato1=Dato2;
        return Dato1*0.40+Dato2*0.60;
 
    }
    public Double SegundoPeriodo (Double Dato1, Double Dato2){
        this.Dato1=Dato1;
        this.Dato2=Dato2;
        
        return Dato1*0.40 + Dato2*0.60;
    
    
    }
    public Double TercerPeriodo(Double Dato1, Double Dato2){
        this.Dato1=Dato1;
        this.Dato2=Dato2;  
        
        return Dato1*0.40 + Dato2*0.60;
    
    
    }
    public Double PromedioGeneral (Double resultado1,Double resultado2,Double resultado3){
       Double res=resultado1+resultado2+resultado3;
        
        return res/3;
    
    }
    
   
    
    
          
    
    
}
