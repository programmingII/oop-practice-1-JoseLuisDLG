//Jose Luis De La Cruz Gonzalez 24-02-2019 07:59 PM
import java.util.*;//Nos permite importar java.util
 public class Ejercicio58_Capitalizar {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);//Se crea el objeto s para almacenar datos en in
     System.out.print("Introduce una oracion: ");//Nos permite introducir una oracion
	 String line = in.nextLine();//Se crea un objeto linea en la cual solo entra en siguiente linea
	 String upper_case_line = ""; 
       Scanner lineScan = new Scanner(line); //Nos permite guardar la cadena que estamos escribiendo anteriormente
         while(lineScan.hasNext()) {//Revisa de objeto en objeto y vuelve a iniciar cada que encuenta que sigue otro objeto
             String word = lineScan.next(); 
             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
      System.out.println(upper_case_line.trim()); //Nos imprime la cadena
    }
}
