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
public class ejemploClase {
    private String color;
    private String marca;
    private int costo;

    public ejemploClase() {
    }
    
    public String VeriCosto (){
        int costo;
        costo=this.costo;
        if (costo<5000){
       
          return "esta varato el carro";
        
        }else{
        
          return "esta Caro el carro";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
