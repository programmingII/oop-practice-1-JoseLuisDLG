//Jose Luis De La Cruz Gonzalez 24-02-2019 05:39 PM
public class Ejercicio50_Dividir {
    	public static void main(String args[]) {
		System.out.println("\nDivided by 3: ");	//Nos pide que ingresemos un numero	
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%3==0) System.out.print(i +", "); //Si el numero i es divisible entre 3 y el residuo es igual a cero entra al ciclo
		}//Se imprime el numero almacenado en i				
				
		System.out.println("\n\nDivided by 5: ");//Nos pide que ingresemos un numero
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%5==0) System.out.print(i +", ");//Si el numero i es divisible entre 5 y el residuo es igual a cero entra al ciclo			
		}//Se imprime el numero almacenado en i
				
		System.out.println("\n\nDivided by 3 & 5: ");//Nos permite dividir el numero 3 y 5
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%3==0 && i%5==0) System.out.print(i +", ");//Si el numero i es divisible entre 3 y 5  el residuo es igual a cero entra al ciclo			
		}//Se imprime el numero almacenado en i
		System.out.println("\n");//Se imprime el numero almacenado
  }
}
