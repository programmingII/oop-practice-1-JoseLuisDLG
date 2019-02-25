//Jose Luis De La Cruz Gonzalez 24-02-2019 04:57 PM
 import java.text.SimpleDateFormat;//Nos permite importar un formato que nos permitira manipularlo de cualquier manera
import java.util.Calendar;//Importo la clase Calendar que nos maneja datos sobre el calendario
import java.util.TimeZone;//Importo la clase timezone que nos da los datos sobre el tiempo

public class Ejercicio47_FormatoDatos {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");//Se crea un objeto de simpledete format, y lo inicializo para que obtenga sus metodos
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));//Se crea un objeto de cdt.setCalendar, y lo inicializo para que obtenga sus metodos
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));//Nos imprime los datos sobre el tiempo y el calendario
	}
}