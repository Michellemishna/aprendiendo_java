
package main;

import java.util.Scanner;
public class SentenciaIf {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       
    /*    int edad;
        
        System.out.print("Edad: ");
        edad=entrada.nextInt();
        entrada.nextLine();
        
        if(edad==40){
            System.out.print("Tienes exactamente 40");
        } else if(edad<40){
               System.out.print("Eres joven");
        } else {
            System.out.print("Eres viejo");
        }  
    }
*/
  String opcion;
  double largo, ancho, radio, area, perimetro;
  final double PI=3.14;
  
  System.out.println(
          "Elige una opcion: \n\n"
            +"1) o a) o A) Rectangulo\n"
            +"2) o b) o B) Circunferencia\n"
            +"0) o s) o S) Salir\n\n"
            +">>"
  );
  
  opcion= entrada.nextLine();
  if(opcion.equals("1") || opcion.equals("a") || opcion.equals("A")){
        System.out.print("LARGO >>");
        largo=entrada.nextDouble();
        System.out.print("ANCHO >>");
        ancho=entrada.nextDouble();
        entrada.nextLine();
        area= largo*ancho;
        perimetro= largo*2+ancho*2;
        System.out.print("AREA= "+area+" PERIMETRO= "+perimetro);
        } else if(opcion.equals("2") || opcion.equals("b") || opcion.equals("B")){
        System.out.print("RADIO>> ");
        radio=entrada.nextDouble();
        entrada.nextLine();
        area= radio*radio*PI;
        perimetro= radio*2*PI;
        System.out.print("AREA= "+area+" PERIMETRO= "+perimetro);
        }else if(opcion.equals("0") || opcion.equals("s") || opcion.equals("S")){
        System.out.print("Presiona ENTER para salir...");
        entrada.nextLine();
        } else {
        System.out.print("ERROR: No has ingresado una opción valida");
        }
    }}
        
 
