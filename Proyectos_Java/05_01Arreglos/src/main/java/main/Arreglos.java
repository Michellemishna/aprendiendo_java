
package main;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {
        System.out.println("Cantidad de argumentos= "+args.length);
        System.out.print("Lista de argumentos: ");
        for (String miVariable : args) {
            System.out.print(miVariable + " ");
        }
    }
}
/* public class Arreglos {

    public static void main(String[] args) {
        int miArreglo[]= new int[12];
        int arr2[]= new int[12];
        int valor;
        
        valor=1;
        for(int i=0; i<12; i++){
            miArreglo[i]=valor;
            arr2[i]=valor;
            valor++;
        }
        
        if(Arrays.equals(miArreglo, arr2)){      
            System.out.print("Iguales");
        } else {
            System.out.print("Distintos");
        }
   }
}
*/