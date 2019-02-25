//Jose Luis De La Cruz Gonzalez 24-02-2019 05:12 PM
import java.util.*;//Importamos java util
 public class Ejercicio48_Impresiondenumero {
     public static void main(String[] args){
	for (int i = 1; i < 100; i++) {//Se crea un ciclo for en la que se utiliza un contador i de tipo entero que va desde 1 hasta 99 con incremento de 1
			if (i % 2 != 0) {
				System.out.println(i);//Se imprime el valor de i
			}
		}
    }
}