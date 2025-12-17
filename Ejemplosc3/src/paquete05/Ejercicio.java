/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", 
            "Diciembre"}; //12
        double[][] produccion = new double[5][12];
        double[] totalProduccion = new double[3];
        String msj = "";
        String mejorEstacion;
        String encargado;
        double mejorCantidad;

        for (int i = 0; i < nombres.length; i ++) { // 0 < 5
            System.out.println("Ingrese el nombre de la estación");
            nombres[i] = entrada.nextLine();
            for (int j = 0; j < produccion.length; j++) { // 0 < 5
                for (int g = 0; g < produccion[j].length; g++) {// 0 < 12
                    //0 0
                    //0 1
                    //0 2...
                System.out.printf("Ingrese la producción del mes de %s\n", 
                        meses[g]);
                produccion[j][g] = entrada.nextDouble();
                }
            }
        }
}
}