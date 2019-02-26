//Jose Luis De La Cruz Gonzalez 25-02-2019 07:59 PM
import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio61_CadenaInvertida {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
     System.out.print("Ingrese Oracion: ");//Nos permite ingresar una oracion
	 String word = in.nextLine();//Nos permite utilizar el metodo de datos y nos guarda en la variable
	 word = word.trim();
	 String result = ""; //Nos permite dar el resultado de dicha oracion
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {//Utilizamos una estructura de control for, para recorrer la cadena desde la ultima letra,utilizo el metodo length() de la clase string, del objeto, para encontrar el tamaño de la frase
			 result += ch[i];//Nos imprime el resultado de la condicion anterior
		 }
	 System.out.println("Reverse word: "+result.trim());//Nos imprime la cadena ya invertida
	 }			
}