//Jose Luis De La Cruz Gonzalez  24-02-2019 02:24 PM
import java.util.Scanner;//Importamos la libreria para poder utilizar el scanner
public class Ejercicio38_ContadordeCadenas {
    
 public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";//Declaramos la cadena
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();//Declaramos variables del contador en char
		int letter = 0;//declaramos variables en entero
		int space = 0;//declaramos variables en entero
		int num = 0;//declaramos variables en entero
		int other = 0;//declaramos variables en entero
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;//esta condicion nos dice que el caracter y letra incrementaran
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;//esta condicion nos dice que el caracter y numeros incrementaran
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;//esta condicion nos dice que el caracter y espacio incrementaran
			}
			else{
				other ++;//esta condicion nos dice que el caracter y otros incrementaran
			}
		}
		System.out.println("La cadena es : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");//Nos imprime el texto de la cadena que declaramos
		System.out.println("letter: " + letter);//Nos imprime la letra
		System.out.println("space: " + space);//Nos imprime el espacio
		System.out.println("number: " + num);//Nos imprime el numero
		System.out.println("other: " + other);//Nos imprime otro
			}
}