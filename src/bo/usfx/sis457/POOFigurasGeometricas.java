/*
 * Ejemplo del Principio de Encapsulamiento 
 */
package bo.usfx.sis457;

import bo.usfx.sis457.figuras.*;
import java.util.Scanner;

/**
 * Clase principal que instancia objetos de las clases del paquete figuras
 * @author Marcelo
 */
public class POOFigurasGeometricas {
        
    /**
     * Clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        Scanner entradaTeclado;
        int opcion;
        
        System.out.println("+============================================================+");
        System.out.println("|           Programa: Figuras Geometricas                    |");
        System.out.println("|          - Ejemplo de Encapsulamiento                      |");
        System.out.println("+============================================================+");
        System.out.println("|               Que desea realizar?                          |");
        System.out.println("| 1) Calcular el area y perimetro de un Circulo              |");
        System.out.println("| 2) Calcular el area y perimetro de un Cuadrado             |");
        System.out.println("| 3) Calcular el area y perimetro de un Rectangulo           |");
        System.out.println("| 4) Calcular el area y perimetro de una Elipse              |");
        System.out.println("| 5) Calcular el area y perimetro de un Trapecio             |");
        System.out.println("| 6) Calcular el area y perimetro de un Triangulo Rectangulo |");
        System.out.println("| *) Salir                                                   |");
        System.out.println("+============================================================+");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.nextInt();
        switch (opcion) {
            case 1:
                /* Se instancia un objeto de la Clase Círculo y posteriormente se modifica el valor
                   de su propiedad "Radio" a través de un método accesor o setter (setRadio). */
                Circulo circulo = new Circulo();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Circulo                             |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del radio: ");
                float radio = (float)entradaTeclado.nextFloat();
                circulo.setRadio(radio);
                System.out.println("El Area del Circulo es: " + circulo.getArea());
                System.out.println("El Perimetro del Circulo es: " + circulo.getPerimetro());
                break;
            case 2:
                /* Se instancia un objeto de la Clase Cuadrado y posteriormente se modifica el valor
                   de su propiedad "Lado" a través de un método accesor o setter (setRadio). */
                Cuadrado cuadrado = new Cuadrado();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Cuadrado                            |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del lado: ");
                cuadrado.setLado(entradaTeclado.nextDouble());
                System.out.println("El Area del Cuadrado es: " + cuadrado.getArea());
                System.out.println("El Perimetro del Cuadrado es: " + cuadrado.getPerimetro());
                break;
            case 3:
                /* Se instancia un objeto de la Clase Rectangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectangulo                          |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la Base: ");
                double base = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la Altura: ");
                double altura = entradaTeclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("El Area del Rectangulo es: " + rectangulo.getArea());
                System.out.println("El Perimetro del Rectangulo es: " + rectangulo.getPerimetro());
                break;
                case 4:
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("|               SubPrograma:  Elipse               |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca El Eje Mayor A:  ");
                double EjeMayorA = entradaTeclado.nextDouble();
                System.out.println("Introduzca El Eje Mayor B:  ");
                double EjeMayorB = entradaTeclado.nextDouble();
                Elipse e = new Elipse(EjeMayorA,EjeMayorB);
                System.out.println("El Area de la Elipse es: "+e.getArea());
                System.out.println("El Perimetro de la Elipse es: "+e.getPerimetro());
                break;
            case 5:
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectangulo                          |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el ladoA: ");
                double a = entradaTeclado.nextDouble();
                System.out.println("Introduzca el ladoB: ");
                double b = entradaTeclado.nextDouble();
                System.out.println("Introduzca el ladoC: ");
                double c = entradaTeclado.nextDouble();
                System.out.println("Introduzca La Altura Del Trapecio: ");
                double h = entradaTeclado.nextDouble();
                Trapecio t = new Trapecio(a,b,c,h);
                System.out.println("El Area del Trapecio es: "+t.getArea());
                System.out.println("El Perimetro del Trapecio es: "+t.getPerimetro());
                break;
            case 6:
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectangulo                          |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el cateto 1: ");
                double c1 = entradaTeclado.nextDouble();
                System.out.println("Introduzca el cateto 2: ");
                double c2 = entradaTeclado.nextDouble();
                System.out.println("Introduzca la hipotenusa: ");
                double z = entradaTeclado.nextDouble();
                Triangulo_Rectangulo q = new Triangulo_Rectangulo(c1,c2,z);
                System.out.println("El Area del triangulo rectangulo es: "+q.getArea());
                System.out.println("El perimetro del triangulo rectangulo es: "+q.getPerimetro());
            case 7:
                System.out.println("Salio del programa");
                break;
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
