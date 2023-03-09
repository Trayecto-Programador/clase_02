/*
La compañía de luz y sombras (CLS) requiere determinar el pago que
debe realizar una persona por el consumo de energía eléctrica, la cual
se mide en kilowatts (KW). Realice un programa que permita
determinar ese pago.
*/
package actividad02clase02;

public class Actividad02Clase02 {

    public static void main(String[] args) {
        
        //Datos de Entrada
            //Definir las Variables
        double cargoFijo,  Impuestos, valorKWH, saldoAnterior, totalApagar;
        int lecturaAnterior, lecturaActual, totalConsumo;
        
                //Asignar valores a la variable
         cargoFijo = 1575.00;
         valorKWH = 5.23;
         Impuestos = 1.27;
         lecturaActual = 4420;
         lecturaAnterior = 3071;
         saldoAnterior = 0;
         totalConsumo = lecturaActual - lecturaAnterior;
         
         //Procesamiento de datos (Resolucion)
         totalApagar = (cargoFijo + totalConsumo *valorKWH) * Impuestos + saldoAnterior;
         
         // Datos de Salida (Testeo no solicitado)
         System.out.println("Total de consumo " + totalConsumo +" Total a pagar " + totalApagar);
         
        
    }
    
}
