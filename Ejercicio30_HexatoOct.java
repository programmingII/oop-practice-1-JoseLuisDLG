//Jose Luis De La Cruz González 24-02-2019 11:42 AM
import java.util.Scanner;//importamos la libreria para el scanner	

public class Ejercicio30_HexatoOct
{
	static Scanner Hexa = new Scanner(System.in);//Nos permite definir las variables
	public static void main(String[] ags)
	{
		String Hexadecimal;//Se declaran las variables
		System.out.println("Ingrese el numero Hexadecimal que desea convertir a Octal");//Ingresamos el numero hexadecimal
		Hexadecimal = Hexa.nextLine();//Nos permite leer el numero hexadecimal 
		int Decimal = Integer.parseInt(Hexadecimal , 16);//Nos permite convertir el numero hexadecimal a decimal
		System.out.println("Numero decimal: " + Decimal); //Nos imprime el resultado de la conversion entre el hexadecimal a decimal
		System.out.println("El numero Octal es: " + Integer.toOctalString(Decimal));//Imprime el numero de decimal a octal		
		
	}
}
