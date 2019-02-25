//Jose Luis De La Cruz Gonzalez 24-02-2019 06:19 PM
import java.util.*;//Importamos la libreria java.util
 public class Ejercicio52_SumaEnteros {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Se crea el objeto num que almacenara datos
        System.out.print("Ingrese el primer número : ");//Nos permite ingresar el primer numero
        int x = in.nextInt();//Se almacena el primero en x
		System.out.print("Ingrese el segundo número : ");//Nos permite ingresar el segundo numero
		int y = in.nextInt();//Se almacena el segundo en y
		System.out.print("Ingrese el tercer número : ");//Nos permite ingresar el tercer numero
        int z = in.nextInt();//Se almacena el tecer numero en z 
        System.out.print("El resultado es: "+sumoftwo(x, y, z));//Nos hace la operacion de sumar los 3 numeros
		System.out.print("\n");//Nos imprime el resultado final
    }
    
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
}
