import java.util.Scanner;
public class AfstandMlLinjeOgPunkt {
    public static void main(String[] args) {

        Scanner afstand = new Scanner(System.in);

        System.out.println("Hvad er din værdi for a og b?");

        double a = afstand.nextInt();
        double b = afstand.nextInt();
        System.out.println("Hvad er din værdi for x0 og y0?");

        double x0 = afstand.nextInt();
        double y0 = afstand.nextInt();


        double dist = ((a*x0-y0+b)/(Math.sqrt(1 + a*a)));
        System.out.println("Afstanden mellem linjen og punktet er " + dist);
    }
}
