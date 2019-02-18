//Jose Luis De La Cruz Gonzalez 18-02-2019 11:45 AM
import java.util.Scanner;//Se importa la libreria para escanear
public class Ejercicio28_HexadecimalDecimal {
   public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";//Se declaran como string los siguientes digitos
             s = s.toUpperCase();
             int val = 0;//Nos declara variables en enteros
             for (int i = 0; i < s.length(); i++)//Nos pone la condicion de que si el entero es igual a 0 entonces tiene que ser el incremento aumenta
             {
                 char c = s.charAt(i);//Se utiliza para contener los caracteres del hexadecimal y no sobrecargamos a string
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdec_num;//declaramos como string las variables
        int dec_num;//Se declaran como entero la variable dec
        Scanner scan = new Scanner(System.in);//Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scanner
        System.out.print("Ingresa el numero hexadecimal: ");//Se ingresa el numero hexadecimal
        hexdec_num = scan.nextLine();//Se almacena un numero entero en la variable hexdec
        dec_num = hex_to_decimal(hexdec_num);
        System.out.print("El numero equivalente hexadecimal es: " + dec_num+"\n");//Se imprime el numero hexadecimal
    }
}