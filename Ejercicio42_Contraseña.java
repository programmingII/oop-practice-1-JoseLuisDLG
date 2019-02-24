//Jose Luis De La Cruz Gonzalez 24-02-2019 03:13 PM
import java.io.Console;//Importamos la libreria console que nos permite acceder a los dispositivos con consola
public class Ejercicio42_Contraseña{
	public static void main(String[] args) {
		Console cons;//Se declara console como constante
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;//Nos guarda los caracteres que se usaran al momento de definir la contraseña
			try {
				pass_ward = cons.readPassword("Ingrese su contraseña:");//Nos permite ingresar la contraseña
				System.out.println("Tu contraseña era: " + new String(pass_ward));//Nos imprime nuestra contraseña
			} finally {
				if (pass_ward != null) {//Nos dice si la contraseña es incorrecta
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("No se puede obtener la contraseña ... Sin consola");//Nos pone una condicion donde sin la consola no nos imprimira la contraseña
		}
	}
}