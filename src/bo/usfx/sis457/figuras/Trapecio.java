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
public class Trapecio {
    private double LadoA;
    private double LadoB;
    private double LadoC;
    private double Haltura; 

    public Trapecio(double LadoA, double LadoB, double LadoC, double Haltura) {
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.LadoC = LadoC;
        this.Haltura = Haltura;
    }

    public double getLadoA() {
        return LadoA;
    }

    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
    }

    public double getHaltura() {
        return Haltura;
    }

    public void setHaltura(double Haltura) {
        this.Haltura = Haltura;
    }
     public double getPerimetro(){
        return this.LadoA+this.LadoB+2*this.LadoC;
    }
    public double getArea(){
        return (this.LadoA+this.LadoB)*this.Haltura/2;
    }
}
