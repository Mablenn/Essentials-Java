package EntradaSalida;

/*
    Este ejemplo lee un flujo de datos a través de un archivo de texto
    y a continuación muestra los datos por pantalla.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaDatosTest02 {
    
    public static void main(String[] args) throws FileNotFoundException {
      
        //Abre el archivo pasado cómo parámetro
        FileInputStream archivo = new FileInputStream("src/info.txt");
        //Escanea el archivo. La clase Scanner analiza datos primitivos o cadenas de texto.
        Scanner scanner = new Scanner(archivo);
        String s = scanner.next();
    
        while (scanner.hasNext()){
            System.out.print(" " + s + "\n");
        s=scanner.nextLine();
        }
    }
}
