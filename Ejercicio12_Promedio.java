//Jose Luis De La Cruz Gonzalez 12-02-2019 09:10 PM
import java.util.Scanner;
 
public class Ejercicio12_Promedio {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//Imprime un mensaje en la pantalla
   
  System.out.print("Input first number: ");//Nos permite ingresar cualquier numero
  int num1 = in.nextInt();//Nos sirve para leer el numero entero
   
  System.out.print("Input second number: ");//Nos permite ingresar cualquier numero
  int num2 = in.nextInt();//Nos sirve para leer el numero entero
   
  System.out.print("Input third number: ");//Nos permite ingresar cualquier numero
  int num3 = in.nextInt();//Nos sirve para leer el numero entero
   
  System.out.print("Input fourth number: ");//Nos permite ingresar cualquier numero
  int num4 = in.nextInt();//Nos sirve para leer el numero entero		
  
  System.out.print("Enter fifth number: ");//Nos permite ingresar cualquier numero
  int num5 = in.nextInt();//Nos sirve para leer el numero entero
   
   
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);//Nos permite sumar los 5 numeros
 }
}