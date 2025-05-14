import java.util.Random;
import java.util.Scanner;

public class JeuDivinette {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int nbrSecret = rand.nextInt(100) + 1;
        int essaisMax = 10;
        int essais = 0;
        boolean trouve = false;


        System.out.println(" Bienvenue dans le jeu de devinettes !");
        System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 essais seulement.");

        while (essais < essaisMax) {
            System.out.print("Essai " + (essais + 1) + " : ");

            if(!scan.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre valide !");
                 scan.next();
               continue;

            }

            int nbrUser = scan.nextInt();
            essais++;

            if (nbrUser < nbrSecret) {
                System.out.println("Trop petit !");
            } else if (nbrUser > nbrSecret) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Felicitation ! Vous avez trouvé le nombre " + nbrSecret + " en " + essais + " essais.");
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Vous avez utilisé vos 10 essais. Le nombre était : " + nbrSecret);
        }

        scan.close();
    }
}
