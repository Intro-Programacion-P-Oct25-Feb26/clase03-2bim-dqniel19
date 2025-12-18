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
        String[] nombres = new String[1];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"}; //12
        double[][] produccion = new double[5][12];
        double[] totalProduccion = new double[5];
        String msj = "";
        String mejorEstacion;
        String encargado;
        double mejorCantidad;
        double suma;
        int indice;

        for (int i = 0; i < nombres.length; i++) { // 0 < 5
            System.out.println("---------------------------------------\n"
                    + "Ingrese el nombre de la estación");
            nombres[i] = entrada.nextLine();
            suma = 0;
            for (int g = 0; g < produccion[i].length; g++) {// 0 < 12
                //0 0
                //0 1
                //0 2...
                System.out.printf("Ingrese la producción del mes de %s\n", // El condicional hace que se pidan los datos de cada mes
                        meses[g]);
                produccion[i][g] = entrada.nextDouble();
                suma = suma + produccion[i][g];
                entrada.nextLine();
            }
            totalProduccion[i] = suma;

            msj = String.format("%sNombre %s - Total de producción: "
                    + "$ %.2f\n",
                    msj, nombres[i], totalProduccion[i]);
        }

        mejorCantidad = totalProduccion[0];
        indice = 0;
        for (int s = 1; s < totalProduccion.length; s++) { //   La variable s empieza en 1 debido a que las anteriores variables adquirieron su valor en la posicion 0
            if (totalProduccion[s] > mejorCantidad) { // Si los valores de totalProduccion[s] (1, 2, 3...) son mayores a totalProduccion[0] 
                mejorCantidad = totalProduccion[s];   // que fue tomada como referencia, remplazaran a los valores antiguos de mejorCantidad
                indice = s;

            }
        }
        
        mejorEstacion = nombres[indice];
        System.out.printf("Ingrese el nombre del encargado de la estacion %s "
                + "(%d)\n", nombres[indice], indice);
        encargado = entrada.nextLine();

        msj = String.format("Análisis de Producción\nEstación\n%s\nEstacion más"
                + " productiva %s (%d)\nEncargado de la estación: %s\nCantidad "
                + "de la estación mas productiva: $ %.2f\n",
                msj, mejorEstacion, indice, encargado, mejorCantidad);

        System.out.printf("%s", msj);

    }
}
