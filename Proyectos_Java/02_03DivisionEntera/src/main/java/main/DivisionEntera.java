
package main;

import java.util.Scanner;

public class DivisionEntera {

    public static void main(String[] args) {
        // TODO code application logic here
      /*  Scanner entrada= new Scanner(System.in);
        int cantPelotas, cantNiños;
        int pelotasPorNiño, pelotasSobrantes;
        
        System.out.print("Ingresa la cantidad de niños y luego la cantidad de pelotas: ");
        cantNiños=entrada.nextInt();
        cantPelotas=entrada.nextInt();
        entrada.nextLine();
        
        pelotasPorNiño= cantPelotas/cantNiños; 
        pelotasSobrantes= cantPelotas % cantNiños;
        
        System.out.print("Pelotas por niño: "+pelotasPorNiño+" Sobrantes: "+pelotasSobrantes);
*/
    Scanner entrada= new Scanner(System.in);
    int numeroCuatroCifras;
    int c1, c2, c3,c4;
    int suma;
    
    numeroCuatroCifras= entrada.nextInt();
    entrada.nextLine();
    
    c1= numeroCuatroCifras%10;
    
    c2= (numeroCuatroCifras/10)%10;
    
    c3= (numeroCuatroCifras/100)%10;
    
    c4= (numeroCuatroCifras/1000);
    
    suma=c1+c2+c3+c4;
        System.out.println("Suma de cifras: "+suma);
    }
    
}
