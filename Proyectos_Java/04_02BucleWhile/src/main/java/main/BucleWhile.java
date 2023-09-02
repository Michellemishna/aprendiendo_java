
package main;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
      
  String opcion;
  double largo, ancho, radio, area, perimetro;
  final double PI=3.14;
  final String OPCION_1="1";
  final String OPCION_2="2";
  final String OPCION_SALIR="0";
  
  do{
  System.out.println(
          "Elige una opcion: \n\n"
            +"1) o a) o A) Rectangulo\n"
            +"2) o b) o B) Circunferencia\n"
            +"0) o s) o S) Salir\n\n"
            +">>"
  );
  
  opcion= entrada.nextLine();
      switch (opcion) {
            case OPCION_1, "a", "A":
                System.out.print("LARGO >>");
                largo=entrada.nextDouble();
                System.out.print("ANCHO >>");
                ancho=entrada.nextDouble();
                entrada.nextLine();
                area= largo*ancho;
                perimetro= largo*2+ancho*2;
                System.out.println("AREA= "+area+" PERIMETRO= "+perimetro);
                System.out.print("Presiona ENTER para continuar...");
                entrada.nextLine();
                break;
                
            case OPCION_2, "b", "B":
                System.out.print("RADIO>> ");
                radio=entrada.nextDouble();
                entrada.nextLine();
                area= radio*radio*PI;
                perimetro= radio*2*PI;
                System.out.println("AREA= "+area+" PERIMETRO= "+perimetro);
                System.out.print("Presiona ENTER para continuar...");
                entrada.nextLine();
                break;
            
            case OPCION_SALIR, "S", "s":
                break;
    
            default:
                System.out.println("ERROR: No has ingresado una opción valida");
                System.out.print("Presiona ENTER para salir...");
                entrada.nextLine();
                break;
        }
  }while(!opcion.equals(OPCION_SALIR) && !opcion.equals("s") && !opcion.equals("s"));
          
                System.out.print("Presiona ENTER para salir...");
                entrada.nextLine();     
  }
}
//buclewhile
 /* System.out.println(
          "Elige una opcion: \n\n"
            +"1) o a) o A) Rectangulo\n"
            +"2) o b) o B) Circunferencia\n"
            +"0) o s) o S) Salir\n\n"
            +">>"
  );
  
  opcion= entrada.nextLine();
  while(!opcion.equals(OPCION_SALIR) && !opcion.equals("s") && !opcion.equals("s")){
      switch (opcion) {
            case OPCION_1, "a", "A":
                System.out.print("LARGO >>");
                largo=entrada.nextDouble();
                System.out.print("ANCHO >>");
                ancho=entrada.nextDouble();
                entrada.nextLine();
                area= largo*ancho;
                perimetro= largo*2+ancho*2;
                System.out.println("AREA= "+area+" PERIMETRO= "+perimetro);
                System.out.print("Presiona ENTER para continuar...");
                entrada.nextLine();

                break;
                
            case OPCION_2, "b", "B":
                System.out.print("RADIO>> ");
                radio=entrada.nextDouble();
                entrada.nextLine();
                area= radio*radio*PI;
                perimetro= radio*2*PI;
                System.out.println("AREA= "+area+" PERIMETRO= "+perimetro);
                System.out.print("Presiona ENTER para continuar...");
                entrada.nextLine();
                break;
                
            default:
                System.out.println("ERROR: No has ingresado una opción valida");
                System.out.print("Presiona ENTER para salir...");
                entrada.nextLine();
                break;
        }
      
      System.out.println(
          "Elige una opcion: \n\n"
            +"1) o a) o A) Rectangulo\n"
            +"2) o b) o B) Circunferencia\n"
            +"0) o s) o S) Salir\n\n"
            +">>"
  );
  
  opcion= entrada.nextLine();
  }
                System.out.print("Presiona ENTER para salir...");
                entrada.nextLine();     
  }
}
*/