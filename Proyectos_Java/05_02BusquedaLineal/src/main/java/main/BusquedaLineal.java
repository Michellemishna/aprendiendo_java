
package main;

import java.util.*;

public class BusquedaLineal {

    public static void main(String[] args) {
        final int CANTIDAD_CARACTERES=10;
        char[] simbolos;
        
        Scanner consola = new Scanner(System.in);
        String frase, letraString;
        int contador= 0;
        
        System.out.print("Ingresa la frase de "+CANTIDAD_CARACTERES+" caracteres: ");
        frase=consola.nextLine();
        System.out.print("Ingresa un caracter: ");
        letraString=consola.nextLine();
                
        char letraChar= letraString.charAt(0);
        simbolos=frase.toCharArray();
        letraChar =Character.toLowerCase(letraChar);

    for(int i=0; i<simbolos.length; i++){
        if(Character.toLowerCase(simbolos[i])== letraChar)
            contador++;
    }
    System.out.println("El caracter "+letraChar+" aparece "+contador+" veces.");
    }
}
