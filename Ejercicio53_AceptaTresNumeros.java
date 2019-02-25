//Jose Luis De La Cruz Gonzalez 24-02-2019 06:31 PM
import java.util.*;//Nos permite importar java.util
 public class Ejercicio53_AceptaTresNumeros {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos permite almacenar los datos
        System.out.print("Ingresa el primer numero : ");//Nos permite ingresar el primer numero
        int x = in.nextInt();//Se almacenara el primer numero entero en x  
		System.out.print("Ingresa el segundo numero: ");//Nos permite ingresar el segundo numero
		int y = in.nextInt(); //Se almacenar el segundo numero entero en y
		System.out.print("Ingresa el tercer numero : ");//Nos permite ingresar el tercer numero
        int z = in.nextInt(); //Se almacenara el primer numero entero en z
        System.out.print("El resultado es: "+test(x, y, z,true));//Nos dice el resultado de dichas operaciones
		System.out.print("\n");//Nos imprime el resultado final
    }
    
    public static boolean test(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
}
