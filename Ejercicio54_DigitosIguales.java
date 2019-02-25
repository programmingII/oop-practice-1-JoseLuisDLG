//Jose Luis De La Cruz Gonzalez 24-02-2019 06:56 PM
import java.util.*;//Nos permite importar java.util
 public class Ejercicio54_DigitosIguales{
 public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);//Nos permite almacenar los datos
        System.out.print("Ingresa el primer numero : ");//Nos permite ingresar el primer numero
        int x = in.nextInt();//Se almacenara el primer numero entero en x  
		System.out.print("Ingresa el segundo numero: ");//Nos permite ingresar el segundo numero
		int y = in.nextInt(); //Se almacenar el segundo numero entero en y
		System.out.print("Ingresa el tercer numero : ");//Nos permite ingresar el tercer numero
        int z = in.nextInt(); //Se almacenara el primer numero entero en z
        System.out.print("The result is: "+test_last_digit(x, y, z,true));
		System.out.print("\n");
   
    }
   
    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
     {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
}