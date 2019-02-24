//Jose Luis De La Cruz Gonzalez 24-02-2019 01:54 PM
import java.util.Scanner;//Se agrega la libreria para poder utilizar el scanner

public class Ejercicio36_DistanciaTierra {
    
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Nos permite intanciar para poder utilizar el scanner
        System.out.print("Ingrese la latitud de la coordenada 1: ");//Nos permite ingresar la latitud de la primera cordenada
        double lat1 = input.nextDouble();//Nos guarda la variable ingresada
        System.out.print("Ingrese la longitud de la coordenada 1: ");//Nos permite ingresar la longitud de la primera cordenada
        double lon1 = input.nextDouble();//Nos guarda la variable ingresada
        System.out.print("Ingrese la latitud de la coordenada 2: ");//Nos permite ingresar la latitud de la segunda cordenada
        double lat2 = input.nextDouble();//Nos guarda la variable ingresada
        System.out.print("Ingrese la longitud de la coordenada 2: ");//Nos permite ingresasr longitud de la segunda cordenada
        double lon2 = input.nextDouble();//Nos guarda la variable ingresada

        System.out.print("La distancia entre esos puntos es: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n"); //Nos imprime la distancia que hay entre los puntos 
    }

    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {//nos dice que los puntos se convertiran a radiantes
        lat1 = Math.toRadians(lat1);//conversion del primer punto de latitud a radianes
        lon1 = Math.toRadians(lon1);//conversion del primer punto de longitud a radianes
        lat2 = Math.toRadians(lat2);//conversion del segundo punto de latitud a radianes
        lon2 = Math.toRadians(lon2);//conversion del segundo punto de longitud a radianes

        double earthRadius = 6371.01; //Kilometros
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));//Es la formula de del coseno y seno entro los dos puntos
    }
}