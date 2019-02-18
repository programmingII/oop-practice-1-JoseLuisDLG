//Jose Luis De La Cruz Gonzalez 18-02-2019 12:20 PM
import java.util.Scanner;//Se importa la libreria para escanear
public class Ejercicio29_HexadecimalaBinario {
     public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";//Se declaran como string los siguientes digitos
             s = s.toUpperCase();
             int val = 0;//Nos declara variables en enteros
             for (int i = 0; i < s.length(); i++)
             {//Nos pone la condicion de que si el entero es igual a 0 entonces tiene que ser el incremento aumenta
                 char c = s.charAt(i);//Se utiliza para contener los caracteres del hexadecimal y no sobrecargamos a string
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;//Retornamos la valor 
    }
    public static void main(String args[])
    {
        String hexdec_num;//declaramos como string las variables
        int dec_num, i=1, j;//Se declaran las variables como entero
        int bin_num[] = new int[100];//Se crea el contador que sera de un numero entero del 0 al 100
        Scanner scan = new Scanner(System.in);//Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scanner
		
        System.out.print("In: ");//Nos imprime el numero
        hexdec_num = scan.nextLine();////Se almacena numero entero en la variable  hexdec
        
        /* convert hexadecimal to decimal */        
        dec_num = hex_to_decimal(hexdec_num);//se convierte de hexadecimal a decimal
        
        /* convert decimal to binary */        
        while(dec_num != 0)
        {//Nos pone un while que nos dice que el numero decimal tiene que ser diferente de 0
            bin_num[i++] = dec_num%2;//nos dice que el numero binario se va a convertir en decimal
            dec_num = dec_num/2;//El numero decimal se divide entre 2 
        }
		
        System.out.print("Es el numero equivalente en binario es: ");//Nos permite ingresar un numero binario
        for(j=i-1; j>0; j--)
        {//Ponemos una condicion de que el numero tiene que ser mayor a 0 
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");//nos imprime el resultado final
    }
}
