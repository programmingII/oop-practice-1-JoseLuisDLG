//Jose Luis De La Cruz Gonzalez 24-02-2019 07:27 PM
import java.util.*;//Se importa la libreria java.util
 public class Ejercicio56_RangoDivisible {
     public static void main(String[] args){
		int x = 5;//Se declaran las variables en entero
		int y = 20;//Se declaran las variables en entero
		int p = 3;//Se declaran las variables en entero
		System.out.println(result(x,y,p));//Nos permite imprimir las operaciones de las variables anteriores
	 } 		
	public static int result(int x, int y, int p) {	
		if (x%p == 0)
			return( y/p - x/p + 1);//Entra al ciclo solo si el residuo de i entre p es igual a cero
		return(y/p - x/p);
	}
 }