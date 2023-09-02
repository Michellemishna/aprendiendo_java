/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculos_simples;
import java.util.Scanner;

public class CalculosSimples {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double base, altura;
        double area;
        
        System.out.print("Ingresa la base: ");
        base= consola.nextDouble();
        consola.nextLine();
        System.out.print("Ingresa la altura: ");
        altura= consola.nextDouble();
        consola.nextLine();
        
        area=(base*altura)/2;
        System.out.println("Area: "+area);
       
    }
}
