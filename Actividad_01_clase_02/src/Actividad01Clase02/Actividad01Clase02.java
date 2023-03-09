/*
Para realizar una excursión nos cobran 5 pesos por persona más
89,30 de cargo fijo por el seguro. Conociendo la cantidad de personas
que viajan, ¿Cuánto nos costará la excursión? ¿Cuánto deberá pagar
cada persona?
 */
package Actividad01Clase02;

public class Actividad01Clase02 {

    public static void main(String[] args) {
       //Datos de Entradas
            //Definir variables
        int valorExcursion;
        double cargoFijo;
        int cantidadPersonas;
        
            //Inicializar las variables
        valorExcursion = 5;
        cargoFijo = 89.30;
        cantidadPersonas = 10;
        
        //Procesamiento de la resolucion
        double totalExcursion = (valorExcursion + cargoFijo) * cantidadPersonas;
        double pagoPorPersona = totalExcursion / cantidadPersonas;
        
        //Datos de Salida (testeo del Programa no solicitado)
        System.out.println("Total abonar " + totalExcursion);
        System.out.println("Total abonar por cada Persona " + pagoPorPersona);
    }

}
