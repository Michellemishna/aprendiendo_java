
package main;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_02Truco {
       public static void main(String[] args) {
        final short MAX_TARJETAS_GRUPO= 7; // Tarjetas por grupo.
        final short MAX_GRUPOS= 3; // Cantidad de grupos.
        final short MAX_TARJETAS= MAX_TARJETAS_GRUPO*MAX_GRUPOS; //Total de tarjetas.
        final short MIN_TARJETA_VALOR='A';
        final short MAX_TARJETA_VALOR= (char)(MAX_TARJETAS+(int)('A')-1); //Tarjeta final.
        
        var generador= new Random();
        var entrada= new Scanner(System.in);
        
        char[] grupo1= new char[MAX_TARJETAS_GRUPO], 
               grupo2= new char[MAX_TARJETAS_GRUPO], 
               grupo3= new char[MAX_TARJETAS_GRUPO];
        char[] deck= new char[MAX_TARJETAS];
        char[][] arregloIntercalado= new char[MAX_TARJETAS_GRUPO][MAX_GRUPOS];
        
        String grupoSeleccionado;
        char tarjeta;
        int i,j,k,l,m;
           
        //Generar letras al azar:
        for(i=0; i<MAX_TARJETAS; i++){
            j=0;
            tarjeta= (char)(generador.nextInt(MAX_TARJETA_VALOR-(int)(MIN_TARJETA_VALOR)+1)+(int)(MIN_TARJETA_VALOR));
            while(j<i){
                if(deck[j]==tarjeta){
                    j=0;
                    tarjeta= (char)(generador.nextInt(MAX_TARJETA_VALOR-(int)(MIN_TARJETA_VALOR)+1)+(int)(MIN_TARJETA_VALOR));
                } else{
                    j++;
                }
            }
            deck[i]=tarjeta;
        }
        
        System.out.println();
        
       // Asignar cartas a las celdas de los grupos
    j = 0;
    for (i = 0; i < MAX_GRUPOS; i++) {
        for (k = 0; k < MAX_TARJETAS_GRUPO; k++) {
            switch (i) {
            case 0:
                grupo1[k] = deck[j];
                break;
            case 1:
                grupo2[k] = deck[j];
                break;
            case 2:
                grupo3[k] = deck[j];
                break;
            default:
                break;
        }
        j++;
        }
    }

    j = 0;

    for ( i = 0; i < MAX_GRUPOS; i++) {
        for (k = 0; k < MAX_TARJETAS_GRUPO; k++) {
            if (i == 0) {
            deck[j] = grupo2[k];
            }
            if (i == 1) {
            deck[j] = grupo1[k];
            }
            if (i == 2) {
            deck[j] = grupo3[k];
            }
            j++;
        }
    }

        
        System.out.println("Haremos 3 secuencias. Empecemos...");               
        for(int secuencia=0; secuencia<MAX_GRUPOS;secuencia++){
            System.out.println("Secuencia "+(secuencia+1)+":");
            //--- IMPRIME LA SECUENCIA EN PANTALLA ---
            for(j=0; j<MAX_TARJETAS_GRUPO;j++){
                System.out.println("\t\t"+grupo1[j]+"  "+grupo2[j]+"  "+grupo3[j]);
            }
            // --- FIN: IMPRIME LA SECUENCIA EN PANTALLA ---
            System.out.print("En que grupo esta tu tarjeta [1,2,3]: ");
            grupoSeleccionado= entrada.nextLine();
            while(!grupoSeleccionado.equals("1") && !grupoSeleccionado.equals("2") && !grupoSeleccionado.equals("3")){
                System.out.print("ERROR - Opcion incorrecta, ingresa una opcion valida [1,2,3]: ");
                grupoSeleccionado= entrada.nextLine();
            }
            if(grupoSeleccionado.equals("1")){
                k=0;
                // --- CAMBIAR POSICION DEL GRUPO ---
                for(l=0; l<MAX_GRUPOS; l++){
                    m=0;
                    while(m<MAX_TARJETAS_GRUPO){
                        if(l==0){
                            deck[k]=grupo2[m];
                            m++;
                            k++;
                        }
                        if(l==1){
                            deck[k]=grupo1[m];
                            m++;
                            k++;
                        }
                        if(l==2){
                            deck[k]=grupo3[m];
                            m++;
                            k++;
                        }
                    }
                }
                m=0;
                for (l=0; l<MAX_GRUPOS; l++) {
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 1:
                                grupo2[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 2:
                                grupo3[k]=deck[m];
                                k++;
                                m++;
                                break;
                            default:
                                break;
                        }   
                    }
                }
                // --- RELLENAR ARREGLO BIDIMENSIONAL ---
                m=0;
                for(l=0; l<MAX_TARJETAS_GRUPO;l++){
                    k=0;
                    while(k<MAX_GRUPOS){
                        arregloIntercalado[l][k]=deck[m];
                        m++;
                        k++;
                    }
                }
                // --- RELLENAR GRUPOS INTERCALADOS ---
                for(l=0; l<MAX_GRUPOS;l++){
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            case 1:
                                grupo2[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            default:
                                grupo3[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                        }
                    }
                }
            } else if (grupoSeleccionado.equals("2")){
                k=0;
                for(l=0; l<MAX_GRUPOS; l++){
                    m=0;
                    while(m<MAX_TARJETAS_GRUPO){
                        if(l==0){
                            deck[k]=grupo1[m];
                            m++;
                            k++;
                        }
                        if(l==1){
                            deck[k]=grupo2[m];
                            m++;
                            k++;
                        }
                        if(l==2){
                            deck[k]=grupo3[m];
                            m++;
                            k++;
                        }
                    }
                }
                m=0;
                for (l=0; l<MAX_GRUPOS; l++) {
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 1:
                                grupo2[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 2:
                                grupo3[k]=deck[m];
                                k++;
                                m++;
                                break;
                            default:
                                break;
                        }   
                    }
                }
                // --- RELLENAR ARREGLO INTERCALADO ---
                m=0;
                for(l=0; l<MAX_TARJETAS_GRUPO;l++){
                    k=0;
                    while(k<MAX_GRUPOS){
                        arregloIntercalado[l][k]=deck[m];
                        m++;
                        k++;
                    }
                }
                // --- RELLENAR GRUPOS INTERCALADOS ---
                for(l=0; l<MAX_GRUPOS;l++){
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            case 1:
                                grupo2[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            default:
                                grupo3[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                        }
                    }
                }
            } else{
                k=0;
                for(l=0; l<MAX_GRUPOS; l++){
                    m=0;
                    while(m<MAX_TARJETAS_GRUPO){
                        if(l==0){
                            deck[k]=grupo1[m];
                            m++;
                            k++;
                        }
                        if(l==1){
                            deck[k]=grupo3[m];
                            m++;
                            k++;
                        }
                        if(l==2){
                            deck[k]=grupo2[m];
                            m++;
                            k++;
                        }
                    }
                }
                m=0;
                for (l=0; l<MAX_GRUPOS; l++) {
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 1:
                                grupo2[k]=deck[m];
                                k++;
                                m++;
                                break;
                            case 2:
                                grupo3[k]=deck[m];
                                k++;
                                m++;
                                break;
                            default:
                                break;
                        }   
                    }
                }
                m=0;
                for(l=0; l<MAX_TARJETAS_GRUPO;l++){
                    k=0;
                    while(k<MAX_GRUPOS){
                        arregloIntercalado[l][k]=deck[m];
                        m++;
                        k++;
                    }
                }
                // --- RELLENAR GRUPOS INTERCALADOS ---
                for(l=0; l<MAX_GRUPOS;l++){
                    k=0;
                    while(k<MAX_TARJETAS_GRUPO){
                        switch (l) {
                            case 0:
                                grupo1[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            case 1:
                                grupo2[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                            default:
                                grupo3[k]=arregloIntercalado[k][l];
                                k++;
                                break;
                        }
                    }
                }
            }
        }
        System.out.println("Obviamente elegiste la "+ grupo2[3]);
    }
}