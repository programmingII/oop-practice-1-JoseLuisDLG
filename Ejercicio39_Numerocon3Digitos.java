//Jose Luis De La Cruz Gonzalez 24-02-2019 02:40 PM
import java.util.Scanner;//Declaramos la libreria para poder utlizar el scanner

public class Ejercicio39_Numerocon3Digitos {
    
public static void main(String[] args) {
		int amount = 0;//declaramos variables en entero
		for(int i = 1; i <= 4; i++){//Nos dice que si el numero entero i es igual a 1 entonces el entero e i tiene que ser mayor o igual que 4 mientras incrementa
			for(int j = 1; j <= 4; j++){//Nos dice que si el numero entero j es igual a 1 y j mayor o igual que 4 mientras se incrementa
				for(int k = 1; k <= 4; k++){//Nos dice que si el numero entero k es igual a 1 y k es mayor o igual a 4 entonces se incrementa
					if(k != i && k != j && i != j){//Si se cumplen las condiciones entonces se ejecturan las operaciones
						amount++;
						System.out.println(i + "" + j + "" + k);//Se imprimen los valores que ya cumplieron las condiciones
					}
				}
			}
		}
		System.out.println("El número total del número de tres dígitos es " + amount);//Nos imprime los 3 numeros y digitos que pedimos
	}
}