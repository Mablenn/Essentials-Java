
package EntradaSalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDeTeclado {
    public static void main(String[] args) throws IOException{
        System.out.println("Intruduce un texto: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Podemos ahorrar código y hacerlo en una línea
        //BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String textoEntrada = br.readLine();
        System.out.println("Este es el texto de entrada: " + textoEntrada);
    }
} //Fin clase
