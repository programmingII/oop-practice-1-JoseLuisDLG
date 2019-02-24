//Jose Luis De La Cruz Gonzalez 24-02-2019 12:05 PM
import java.util.Scanner;//importamos la libreria para utilizar el scanner
public class Ejercicio32_Comparacion {
 public static void main( String args[] )    
    {
        Scanner input = new Scanner(System.in);//Nos permite leer las teclas
        int numero1; //Nos compara el primer numero
        int numero2; //Nos compara el segundo numero
      
        System.out.print( "Ingresa el primer numero: " );//Nos permite ingresar nuestro primer numero
        numero1 = input.nextInt();//Nos guarda el primer numero  
 
        System.out.print( "Ingresa el segundo numero: " );//Nos permite ingresar nuestro segundo numero      
        numero2 = input.nextInt();//Nos guarda el segundo numero
        
        if ( numero1 == numero2 )           
            System.out.printf( "%d == %d\n", numero1, numero2 );//Nos imprime el numero si el numero 1 y el 2 son iguales
        if ( numero1 != numero2 )          
            System.out.printf( "%d != %d\n", numero1, numero2 );//Nos imprime el numero solo si el numero 1 es diferente a la numero 2
        if ( numero1 < numero2 )          
            System.out.printf( "%d < %d\n", numero1, numero2 );//Nos imprime el numero solo si el numero 2 es mayor al numero 1
        if ( numero1 > numero2 )          
            System.out.printf( "%d > %d\n", numero1, numero2 );//Nos imprime el numero solo si el numero 1 es mayor al numero 2
        if ( numero1 <= numero2 )          
            System.out.printf( "%d <= %d\n", numero1, numero2 );//Nos imprime el numero solo si el numero 1 es igual o menor que el numero 2
        if ( numero1 >= numero2 )          
            System.out.printf( "%d >= %d\n", numero1, numero2 );//Nos imprime el numero solo si el numero 2 es igual o mayor que el numero 1
    }
  }
 