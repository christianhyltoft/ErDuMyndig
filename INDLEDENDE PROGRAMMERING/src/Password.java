import java.util.Scanner;
public class Password {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        boolean finished = false;
        while(!finished) {
            System.out.println("Indtast ønsket kodeord - bemærk koden skal være mellem 4 og 9 cifre.");
            String psw = input.nextLine();

            if("exit".equals(psw))
                finished = true;
            else {
                int lenght = psw.length();

                if (lenght < 4) {

                    System.out.println("Dit kodeord er for kort.");
                }

                if (lenght > 9) {

                    System.out.println("Dit kodeord er for langt.");
                }
                if (lenght > 4 && lenght < 10) {
                    System.out.println("Dit kodeord er nu oprettet.");
                    finished = true;
                }
            }
        }


    }
}
