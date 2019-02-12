//Jose Luis De La Cruz Gonzalez 12-02-2019 01:18 PM
import java.util.Scanner;
 
public class Ejercicio6_Operaciones {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//para imprimir un mensaje en pantalla
   
  System.out.print("Input first number: ");//nos permite escribir el numero y se importara abajo
  int num1 = in.nextInt();//introducir un numero entero
   
  System.out.print("Input second number: ");//nos permite escribir el numero y se importara abajo
  int num2 = in.nextInt();//introducir un numero entero
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));//imprime la operacion de dichos numeros
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));//imprime la operacion de dichos numeros
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));//imprime la operacion de dichos numeros
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));//imprime la operacion de dichos numeros
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));//imprime la operacion de dichos numeros
 }
 
}