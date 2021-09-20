import java.util.*;
import java.lang.*;

// Her har jeg navnet for min java class (ASCII_tabel
public class ASCII_tabel {
    // Her er min method hvor min "method header" er main
    public static void main(String[] args) {

// Jeg har indsat en booelan expresion og sat den til false, så jeg kan lave et loop der fortsætter
// koden indtil jeg selv skriver *
        boolean finished = false;
        while (!finished) {
            Scanner input = new Scanner(System.in);
            System.out.println("Indtast et tegn.");

            // Her definerer jeg min char
            char tegn = input.next().charAt(0);
            if (tegn == '*') {
                break;
            } else {
                if (Character.isLetter(tegn) == true) {

                    if (Character.isUpperCase(tegn) == true) {
                        System.out.println("Tegnet er et stort bogstav.");
                    } else if (Character.isLowerCase(tegn) == true) {
                        System.out.println("Tegnet et et lille bogstav.");
                    }

                } else if (Character.isDigit(tegn) == true) {
                    System.out.println("Tegnet et et tal");
                } else {
                    switch (tegn) {
                        case '#':
                            System.out.println("Tegnet er et af de 4 specialtegn");
                            break;
                        case '!':
                            System.out.println("Tegnet er et af de 4 specialtegn");
                            break;
                        case '+':
                            System.out.println("Tegnet er et af de 4 specialtegn");
                            break;
                        case '\\':
                            System.out.println("Tegnet er et af de 4 specialtegn");
                            break;
                        default:
                            System.out.println("Tegnet et ikke kendt af dette program.");
                            break;
                    }
                }
            }
        }
    }
}
