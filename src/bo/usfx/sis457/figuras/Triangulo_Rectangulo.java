/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author MC
 */
public class Triangulo_Rectangulo {
    private double Cateto1;
    private double Cateto2;
    private double Hipotenusa;

    public Triangulo_Rectangulo(double Cateto1, double Cateto2, double Hipotenusa) {
        this.Cateto1 = Cateto1;
        this.Cateto2 = Cateto2;
        this.Hipotenusa = Hipotenusa;
    }
     public Triangulo_Rectangulo(){
        this(0,0,0);
     }

    public double getCateto1() {
        return Cateto1;
    }

    public void setCateto1(double Cateto1) {
        this.Cateto1 = Cateto1;
    }

    public double getCateto2() {
        return Cateto2;
    }

    public void setCateto2(double Cateto2) {
        this.Cateto2 = Cateto2;
    }

    public double getHipotenusa() {
        return Hipotenusa;
    }

    public void setHipotenusa(double Hipotenusa) {
        this.Hipotenusa = Hipotenusa;
    }
     public double getArea(){
     return (this.Cateto1*this.Cateto2)/2;
 }   
 public double getPerimetro(){
     return Cateto1+Cateto2+Hipotenusa;
 }
}
