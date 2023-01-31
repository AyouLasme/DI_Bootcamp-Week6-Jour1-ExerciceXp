import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la premiere valeur du triangle :");
        int premiereValeur = sc.nextInt();
        System.out.println("Veillez entrer la deuxieme valeur du triangle");
        int deuxiemeValeur = sc.nextInt();
        System.out.println("Veillez entrer la deuxieme valeur du triangle");
        int troisiemeValeur = sc.nextInt();
        if (premiereValeur + deuxiemeValeur + troisiemeValeur == 180){
            System.out.println("c'est un triangle valide");
        }else {
            System.out.println("ce n'est pa un trianggle valide");
        }
    }
}