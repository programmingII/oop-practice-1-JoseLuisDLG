//Jose Luis De La Cruz Gonzalez 01-03-2019 02:21 PM
import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio66_Suma100NumPrimos {
 public static void main(String[] args)
 {
    int sum = 1;//declaramos la variable en entero
	 int ctr = 0; //declaramos las variables en entero
	 int n = 0; //declaramos la variable en entero
    	
		while (ctr < 100) {//Nos dice que los primeros 100 numeros primos
			n++; 
			if (n % 2 != 0) { 
			// check if the number is even
				if (is_Prime(n)) {
					sum += n; 
					ctr++; 
				}
			}	
		}
		System.out.println("\nSum of the first 100 prime numbers: "+sum);//Nos imprime los primeros 100 numeros primos 
	 }
	
   	public static boolean is_Prime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
}
