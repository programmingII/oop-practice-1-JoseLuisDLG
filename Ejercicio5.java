//Jose Luis De La Cruz Gonzalez 12:25 12-02-2019

import java.util.Scanner;//importamos un mensaje en la pantalla
 
public class Ejercicio5 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//importar cualquier tipo de texto que queramos escribir en la pantalla	
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();//ingresamos cualquiere numero entero que queramos 
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();//ingresamos cualquiere numero entero que queramos 
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);//Hace la funcion de las operaciones
 }
 
}