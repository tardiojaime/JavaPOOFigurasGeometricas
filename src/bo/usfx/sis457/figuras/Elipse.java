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
public class Elipse {
  
    private double EjeMayorA;
    private double EjeMayorB;

    public Elipse(double EjeMayorA, double EjeMayorB) {
        this.EjeMayorA = EjeMayorA;
        this.EjeMayorB = EjeMayorB;
    }
    
    public Elipse(){
        this(0,0);
    }

    public double getEjeMayorA() {
        return EjeMayorA;
    }

    public void setEjeMayorA(double EjeMayorA) {
        this.EjeMayorA = EjeMayorA;
    }

    public double getEjeMayorB() {
        return EjeMayorB;
    }

    public void setEjeMayorB(double EjeMayorB) {
        this.EjeMayorB = EjeMayorB;
    }
     public double getPerimetro(){
      return 2*Math.PI*(Math.sqrt((Math.pow(this.EjeMayorA, 2)+Math.pow(this.EjeMayorB, 2))/2));
    }
    public double getArea(){
     return  Math.PI*this.EjeMayorA*this.EjeMayorB;
        
    }
}
