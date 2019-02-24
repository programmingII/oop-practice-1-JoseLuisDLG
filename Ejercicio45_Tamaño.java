//Jose Luis De La Cruz Gonzalez 24-02-10 04:39 PM
import java.util.Scanner;//Se importa la libreria scanner
import java.io.File;//se importa la clase file que nos ayuda de manera abstracta en la ruta de directorios, esto trabaja con el flujo de datos
public class Ejercicio45_Tamaño {

 public static void main(String[] args) {
  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");//Nos imprime el tamaño de abc en el texto
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");//Nos imprime el tamaño en texto de dicha fila
 }
}