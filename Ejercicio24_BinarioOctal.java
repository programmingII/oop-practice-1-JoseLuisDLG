//Jose De La Cruz Gonzalez 17-02-2019 8:00 PM
import java.util.*;//Se importa la libreria java 
public class Ejercicio24_BinarioOctal {
public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;//Se declaran varias variables enteras
        int octnum[] = new int[100];// Se crea el contador que sera de un numero octal del 0 al 100
        Scanner scan = new Scanner(System.in); //Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scanner
		System.out.print("Ingresa un numero binario : ");//Nos permite ingresar un numero binario
        binnum = scan.nextInt();//Se crea una variable tipo binnum
        binnum1=binnum;
     
      while(binnum > 0)//Se crea ciclo while que se cumplira cuando binnum siempre sea diferente de cero
        {
            rem = binnum % 10;//el numero binario es divido entre 10
            decnum = decnum + rem*i; //nos dice que un numero decimal es sumado al residuo mas el incremento
            //System.out.println(rem);//Se imprime el residuo
            i = i*2;//el incremento se multiplica por 2
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {//Se crea ciclo while que se cumplira siempre que Num sea mayor de cero
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("El numero binario ingresado en equivalente a numero octal a  " +binnum1+ " is :");//Nos imprime el numero binario mas el numero binario con un incremento
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);//imprime el numero octal
        }
 System.out.print("\n");//nos imprime el numero octal con todas las operaciones ya hechas
 
    }
}
