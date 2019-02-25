//Jose Luis De La Cruz Gonzalez 24-02-2019 07:09 PM
import java.util.*;//Se importa la libreria java.util
 public class Ejercicio55_Horas {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Se crea un objetivo que almacenara datos
        System.out.print("Ingresa los segundos: ");//Nos permite ingresar los segundos los cuales queramos ingresar
		int seconds = in.nextInt();//Se almacenan los segundos en int 
        int p1 = seconds % 60;//Se declaran las variables como enteros y se saca el 60 por ciento
        int p2 = seconds / 60;//Se declaran las variables como enteros y se dividen entre 60
        int p3 = p2 % 60;//Se declaran las variables como enteros y por el segundo entero y se saca el 60 por ciento
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);//Nos imprime la operacion de dichas operaciones anteriores
		System.out.print("\n");//Nos imprime el resultado final
    }    
 }