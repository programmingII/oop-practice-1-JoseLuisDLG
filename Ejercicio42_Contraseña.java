//Jose Luis De La Cruz Gonzalez 24-02-2019 03:13 PM
import java.io.Console;//Importamos la libreria console que nos permite acceder a los dispositivos con consola
public class Ejercicio42_Contrase�a{
	public static void main(String[] args) {
		Console cons;//Se declara console como constante
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;//Nos guarda los caracteres que se usaran al momento de definir la contrase�a
			try {
				pass_ward = cons.readPassword("Ingrese su contrase�a:");//Nos permite ingresar la contrase�a
				System.out.println("Tu contrase�a era: " + new String(pass_ward));//Nos imprime nuestra contrase�a
			} finally {
				if (pass_ward != null) {//Nos dice si la contrase�a es incorrecta
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("No se puede obtener la contrase�a ... Sin consola");//Nos pone una condicion donde sin la consola no nos imprimira la contrase�a
		}
	}
}