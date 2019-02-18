//Jose Luis De La Cruz Gonzalez 17-02-2019 10:02 PM
import java.util.Scanner;//Se importa la libreria para escanear
public class Ejercicio27_OctalHexadecimal {
public static void main(String args[])
    {
        String octal_num, hex_num;//Se declaran las variables en string
        int decnum;//se declaran las variables en entero
        Scanner in = new Scanner(System.in);//Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre de scanner
        System.out.print("Escribe un numero octal : ");//Nos imprime un numero en octal
        octal_num = in.nextLine();///Se almacena numero entero en la variable Octal
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Numero hexadecimal equivalente: "+ hex_num+"\n");//Nos permite imprimir el numero equivalente en hexadecimal
     }
}