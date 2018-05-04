/*
 * Archivo que contiene la Clase Cuadrado
 */
package bo.usfx.sis457.figuras;

/**
 * Clase cuadrado que calcula el Area y Perímetro en base a su lado
 * @author Marcelo
 */
public class Cuadrado {
    private double Lado;

    /**
     * Método constructor, crea el Cuadrado con la propiedad lado
     * @param lado Valor tipo float
     */
    public Cuadrado(double lado) {
        this.Lado = lado;
    }

    /**
     * Método constructor, crea el Cuadrado con valores por defecto
     */
    public Cuadrado() {
        // Llama al método constructor anterior
        this(0);
    }

    /**
     * Método que retorna el valor del Lado 
     * @return Retorna el valor del Lado en tipo double
     */
    public double getLado() {
        return this.Lado;
    }

    /**
     * Método que modifica el valor del Lado
     * @param lado Valor de tipo double
     */
    public void setLado(double lado) {
        this.Lado = lado;
    }
    
    /**
     * Método que retorna el area del Cuadrado
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (this.Lado * this.Lado);
    }
    
    /**
     * Método que retorna el perimetro del Cuadrado
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (4 * this.Lado);
    }
}
