
package main;
import java.util.Scanner;
import java.util.Random;

public class BucleFor {

    public static void main(String[] args) {
        //int cantidad;
        Scanner entrada = new Scanner(System.in);
        Random numeros = new Random();
     
        int numeroSecreto= numeros.nextInt(1000)+1;
        int valorLeido;
        int MAX_INTENTOS=10;
        boolean adivino=false;
        System.out.println("Adivinador 2.0 – Dispones de 10 intentos para adivinar.\n Rango de valores: 1 al 1000 inclusive.\n");
        
        for(int intento=1;intento<=MAX_INTENTOS;intento++){
        System.out.print("Intento "+intento+": ");        
        valorLeido=entrada.nextInt();
        entrada.nextLine();
        
        if(valorLeido < numeroSecreto && intento < 10){
        System.out.println("El número a adivinar es mayor.");
        }else if(valorLeido > numeroSecreto && intento < 10) {
        System.out.println("El número a adivinar es menor.");    
        } else if(valorLeido==numeroSecreto){
            System.out.print("¡¡¡GANASTE!!!");
            adivino=true;
            break;
        }
        }
        if(!adivino){
        System.out.print("¡¡¡PERDISTE!!! El número era "+numeroSecreto);
            
        }
    }
}
    //Ejercicio de asteriscos
      //  System.out.print("Ingresa la cantidad de asteriscos: ");
//        cantidad= entrada.nextInt();
       // entrada.nextLine();
        
     /*   for(int i=1; i<=10; i++){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }            
            System.out.println();
        }
    }
*/
     

