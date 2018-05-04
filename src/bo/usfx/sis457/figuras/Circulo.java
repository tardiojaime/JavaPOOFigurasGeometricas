/*
 * Archivo que contiene la Clase Circulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Circulo que calcula el área y perímetro en base a su radio
 * @author Marcelo
 */
public class Circulo {
    private float Radio;
    
    /**
     * Método constructor, crea el Círculo con valores por defecto
     */
    public Circulo() {
        this.Radio = 0;
    }
    
    /**
     * Método constructor, crea el Círculo con la propiedad Radio
     * @param radio Valor tipo float
     */
    public Circulo (float radio) {
        this.Radio = radio;
    }

    /**
     * Método que retorna el valor del Radio 
     * @return Devuelve el valor del Radio en tipo float
     */
    public float getRadio() {
        return Radio;
    }

    /**
     * Método que modifica el valor del radio
     * @param radio Valor de tipo float
     */
    public void setRadio(float radio) {
        this.Radio = radio;
    }
    
    /**
     * Método que retorna el area del Circulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (Math.PI * Math.pow(this.Radio, 2));
    }
    
    /**
     * Método que retorna el perimetro del Circulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * Math.PI * this.Radio);
    }
}
