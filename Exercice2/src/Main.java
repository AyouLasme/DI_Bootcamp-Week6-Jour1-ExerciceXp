import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le décalage horaire entre votre domicile et l'endroit où vous vous rendez, entrer une valeur negative si c'est negatif");
        int decalage = sc.nextInt();
        int heureD1 = 12;
        int heuredestination1 = heureD1 + decalage;
        System.out.println("l'heure qu'il fait dans la destination quand il est 12h au doicile est " + heuredestination1 + "H");
        int heureD2 ;
        if (decalage < 0) {
            heureD2 = 24;
            int heuredestination2 = heureD2 + decalage;
            System.out.println("l'heure qu'il fait dans la destination quand il est 00h au doicile est " + heuredestination2 + "H");
        } else if (decalage > 0) {
            heureD2 = 00;
            int heuredestination2 = heureD2 + decalage;
            System.out.println("l'heure qu'il fait dans la destination quand il est 00h au doicile est " + heuredestination2 + "H" );
        }
    }
}