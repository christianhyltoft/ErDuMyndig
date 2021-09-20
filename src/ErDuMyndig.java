import java.util.Scanner;

public class ErDuMyndig {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Hej. Hvad hedder du?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hej " + name);

        System.out.println("Hvor gammel er du?");
        int alder = input.nextInt();

        if (alder < 15) {
            System.out.println(alder + "år. Du er ikke særlig gammel eller myndig.");

        }
        else if(alder > 25) {
            System.out.println(alder + " år. Så er du godt nok gammel.;)");
        }
        else {
            System.out.println(alder + " år. Det var da en perfekt alder :D");
        }
    }

}
