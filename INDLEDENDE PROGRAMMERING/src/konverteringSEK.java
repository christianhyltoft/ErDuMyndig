import java.util.Scanner;
public class konverteringSEK {
    public static void main(String[] args) {

        /*
        Lav et program, der:
        (1) læser et antal sekunder ind og
        (2) skriver hvor mange dage, timer, minutter og sekunder det angivne antal sekunder svarer til
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast antallet af sekunder du gerne have omregnet til dage, timer, minutter og sekunder?");
        int sekunder = input.nextInt();

        //Definerer konstanter for dage, timer, minutter og sekunder
        int dag = sekunder/86400;
        int time = ((sekunder %86400)/3600);
        int minut = ((sekunder %3600)/60);
        int sek = sekunder % 60;

        System.out.println("Det svarer til " + dag + " dag(e), " + time + " time(r), " + minut + " minutter og " + sek + " sekunder.");

    }
}
