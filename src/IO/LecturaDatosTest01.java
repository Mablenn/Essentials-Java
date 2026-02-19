package EntradaSalida;
/*
    Este ejemplo lee un flujo de datos a través de la entrada estándar (teclado)
    y a continuación los muestra por la salida estándar (pantalla)
*/

import java.util.Scanner;

public class LecturaDatosTest01 {
    
    public static void main(String[] args) {
        
        //Obtiene la entrada estandar(teclado) a traves del método System.in
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        //Almacena los datos en un String
        String text = input.nextLine();
        //Muestra por pantalla los datos de entrada
        System.out.println("Texto introducido: " + text);
    }    
}
