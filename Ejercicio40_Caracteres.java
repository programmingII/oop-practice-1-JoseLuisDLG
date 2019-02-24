//Jose Luis De La Cruz Gonzalez 24-02-2019 02:58 PM
import java.nio.charset.Charset;//Nos permite enumerar las codificaciones para cualquier implementacion de Java
public class Ejercicio40_Caracteres {
  public static void main(String[] args) {
	System.out.println("Lista de conjuntos de caracteres disponibles:");//Nos permite imprimir la lista de los caracteres disponibles que hay en java
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
  }
}