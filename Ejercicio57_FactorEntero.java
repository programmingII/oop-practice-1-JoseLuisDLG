//Jose Luis De La Cruz Gonzalez 24-02-2019 07:41 PM
import java.util.*;//Nos permite importar java.util
 public class Ejercicio57_FactorEntero {
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);//Se crea el objeto que almacenara datos
      System.out.print("Ingrese un entero: ");//Nos permite ingresar un entero
      int x = in.nextInt();// Se almacena el numero en entero x

		System.out.println(result(x));//Nos imprime el resultado de los enteros
	 } 		
	public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {//Ciclo for que vas desde 1 hasta el resultado de la raiz cuadrada de x con incremento de 1
            if(num%i==0 && i*i!=num) {//Entra al ciclo solo si el residuo de x entre el valor de i es cero y  i al cuadrado es diferente de un num
                ctr+=2;//En la variable cont se suma cont mas dos
            } else if (i*i==num) {// entra al ciclo solo si i al cuadrado es igual a x
                ctr++;//se incrementa uno al contador
            }
        }
        return ctr;//se regresa el contador si es que falla
	}
 }