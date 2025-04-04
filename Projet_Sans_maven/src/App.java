import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Employer personne = new Employer();

        Scanner scanner = new Scanner(System.in);
        int nombreChoix = scanner.nextInt();

        do{
            
            System.out.println("Cliquer un nombre pour les différentes fonctionnalités du projet");
            System.out.println("1 : Gestion des personnes");
            System.out.println("2 : Gestion des réservations");
            System.out.println("3 : Gestion des vols");
            System.out.println("4 : Gestion des avions");
            switch (nombreChoix) {
                case 1:
                    System.out.println("Choix 1 ");
                    break;
                case 2:
                    System.out.println("Choix 2 ");
                    break;
                case 3:
                    System.out.println("Choix 3 ");
                    break;
                case 4:
                    System.out.println("Choix 4 ");
                    break;
            }
        }while (nombreChoix!=0);
    }

    public class Employer {
        
    }
}