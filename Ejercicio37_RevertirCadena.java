//Jose Luis De La Cruz Gonzalez 24-02-2019 2:10 PM
import java.util.Scanner;//Nos permite importar la libreria scanner
public class Ejercicio37_RevertirCadena {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instanciamos el scanner para poder leer las teclas
        System.out.print("Introduce una cadena: ");//Nos permite introducir una cadena
        char[] letters = scanner.nextLine().toCharArray();//Nos permite poner las letras al reves por medio de una variable
        System.out.print("Cadena inversa: ");//Nos permite ingresar una cadena inversa
        for (int i = letters.length - 1; i >= 0; i--) {//tenemos un for que nos dice que las letras van a ir en reversa gracias a la condicion que acabamos de poner por medio del for
            System.out.print(letters[i]);
        }
        System.out.print("\n");//Nos imprime la cadena en reversa

    }
}