//Jose Luis De La Cruz Gonzalez 25-02-2019 07:27 PM
import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio60_PenultimaPalabra {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
     System.out.print("Ingresa un oracion ");//Nos permite crear o escribir una oracio
	 String line = in.nextLine();//Nos guarda la informacion que hayamos escrito anteriormente
	 String[] words = line.split("[ ]+");///este metodo split, de la clase string, este metodo me permite dividir una cadena de caracteres
	 System.out.println("Penultimate word: "+words[words.length - 2]);
	 }			
}