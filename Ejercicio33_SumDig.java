//Jose Luis De La Cruz Gonzalez 24-02-2019 12:39 PM
import java.util.Scanner;//Importamos la libreria para poder utilizar el scanner
public class Ejercicio33_SumDig { 
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Importamos el scanner para poder leer los digitos
        System.out.print("Ingresamos un digito: ");//Nos permite ingresar un numero
        long n = input.nextLong();//le damos valores a long
        System.out.println("La suma de los digitos es: " + sumDigits(n));//Nos permite imprimir la suma de los digitos

    }

    public static int sumDigits(long n) {
        int sum = 0;//Declaramos los enteros
        while (n != 0) {//Nos dice que el numero tiene que ser diferente a 0
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}