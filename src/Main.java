import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int FACE = 1;
    private static int CONTFACE=0;
    private static int CONTTOTAL=0;
    public static void main(String[] args) {

        while (askIfWantToThrowCoin()) {

            int coinFace = throwCoin();
            whatFaceIs(coinFace);
        }
        showFinalResult();
    }

    private static void showFinalResult() {
        System.out.println("The numbers of times is face: "+CONTFACE+" and the total times throwing the coin is: "+CONTTOTAL);
    }

    private static void whatFaceIs(int coinFace) {

        if (coinFace == FACE)
        {
            System.out.println("The coin show face");
            CONTFACE++;
            CONTTOTAL++;
        }
        else
        {
            System.out.println("The coin show cross");
            CONTTOTAL++;
        }

    }

    private static int throwCoin() {
        Random rand = new Random();
        int coinFace = (rand.nextInt(2) + 1);
        return coinFace;
    }

    private static boolean askIfWantToThrowCoin() {
        System.out.println("Do you want to throw the coin? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");
    }
}
