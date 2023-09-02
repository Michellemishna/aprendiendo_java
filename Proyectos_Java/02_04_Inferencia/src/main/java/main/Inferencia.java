/*
Escape Sequence     Description
\t                  Insert a tab in the text at this point.
\b                  Insert a backspace in tle text at this point.
\n                  Insert a newline in the text at this point.
\r                  Insert a carriage return in the text at this point.
\'                  Insert a single quote character in the text at this point.
\"                  Insert a double quote character in the text at this point.
\\                  Insert a backslash character in the text at thish point.
*/

package main;

import java.util.Scanner;

public class Inferencia {

    public static void main(String[] args) {
        var entrada= new Scanner(System.in);
        var frase= entrada.nextLine();
        
        System.out.print("La frase <<"+frase+">> es correcta.");
         System.out.print("La frase \t<<"+frase+">> es correcta.");
         System.out.print("La frase \b<<"+frase+">> es correcta.");
         System.out.print("La frase \n<<"+frase+">> es correcta.");
         System.out.print("La frase \r<<"+frase+">> es correcta.");
         System.out.print("La frase \f<<"+frase+">> es correcta.");
         System.out.print("La frase \'<<"+frase+">> es correcta.");
         System.out.print("La frase \"<<"+frase+">> es correcta.");
         System.out.print("La frase \\<<"+frase+">> es correcta.");

    }
}
/*
Tipos primitivos de Java
Los tipos primitivos de Java son pocos y muy simples. Te dejamos aquí la lista para que los tengas presentes de ahora en adelante:

byte: 1 byte - Números enteros entre -128 y 127
short: 2 bytes - Números enteros entre -32768 y 32767
int: 4 bytes - Números enteros entre -2147483648 y 2147483647
long: 8 bytes - Números enteros entre -9223372036854775808 y 9223372036854775807
float: 4 bytes-  Números de coma flotante de hasta 6 y 7 dígitos decimales.
double: 8 bytes - Ídem anterior pero de hasta 15 dígitos decimales.
boolean: 1 bit - Valores true o false.
char: 2 bytes - Un caracter simple dentro de los valores ASCII.
*/