//Jose Luis De La Cruz Gonzalez 16-02-2019 1:14 PM
import java.util.Scanner; //Se importa la libreria para escanear
public class Ejercicio20_Hexadec {
      public static void main(String args[])
    {
        int dec_num, rem; //Se declaran las variables de tipo entero
        String hexdec_num=""; //Se crea una variable string 
        
        /* hexadecimal number digits */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //Se declaran la variable que nos permite almacenar los datos en 16 bits
        
        Scanner in = new Scanner(System.in); //Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre in
		
        System.out.print("Ingrese un numero entero: "); //Nos permite ingresar un numero entero
        dec_num = in.nextInt(); //Se almacena numero entero en la variable dec
		
        while(dec_num>0)
        { //Se crea ciclo while que se cumplira siempre que dec_num sea mayor a 0
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("El resultado en numero hexadecimal es  : "+hexdec_num+"\n"); //Se imprime el numero hexadecimal
    }
}