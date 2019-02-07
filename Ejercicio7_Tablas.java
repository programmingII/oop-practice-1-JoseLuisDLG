//Jose Luis De La Cruz Gonzalez 
//Dia 07/02/2019
//Hora: 1:00 

import java.util.Scanner;
 
public class Ejercicio7_Tablas {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");//nos permite introducir el numero que queramos			
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));//hace la funcion de hacer la operaciones de sumar y multiplicar 
  }
 }
}