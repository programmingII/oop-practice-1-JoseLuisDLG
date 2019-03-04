//Jose Luis De La Cruz Gonzalez 27-02-2019 07:40 PM
import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio64_DosValoresEnteros {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
        System.out.print("Ingresa el primer numero: ");//Nos permite ingresar nuestro primer numero
        int a = in.nextInt();//utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro primer numero
		System.out.print("Ingresa el segundo numero: ");//Nos permite ingresar nuestro segundo numero
		int b = in.nextInt();//utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro segundo numero
		System.out.println("Result: "+common_digit(a, b));//Nos imprime el resultado del numero entre a y b
    }
	
	public static boolean common_digit(int p, int q)
     {  
	   if (p<25 || q>75)
		   return false;
	   int x = p % 10;
	   int y = q % 10;
	   p /= 10;
	   q /= 10;
	   return (p == q || p == y || x == q || x == y);
     }
}