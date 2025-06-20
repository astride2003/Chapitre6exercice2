import java.util.Scanner;

public class jeuxDevinette {
    public static void main(String[]args){
        Scanner clavier = new Scanner(System.in);
        int nombreSecret = 1 + (int)(Math.random() * 100);
        int nombreEssaisMax = 10 ;
        int essais = 0;
        Boolean trouver = false;
        System.out.println("Bienvenu dans le jeu de devinette \nL'objectif du jeu est de deviner un nombre entre 1 et 100");
        System.out.println("Vous avez "+ nombreEssaisMax +" essais. Bonne chance");
        while (essais < nombreEssaisMax){
            System.out.println("Entrez votre tentative n°"+(essais + 1)+" : ");
             int proposition = clavier.nextInt();
             essais++;

             if (proposition == nombreSecret){
                System.out.println("Super ! vous avez trouver le bon nombre en "+essais+" essai(s).");
  trouver = true;
  break;
             }
             else if (proposition < nombreSecret) {
System.out.println("Le nombre est plus grand que "+proposition );
             }
             else {
                 System.out.println("Le nombre est plus petit que "+proposition );
             }
        }

        if (!trouver){
            System.out.println("Désolé vous avez perdu !le nombre secret était : "+nombreSecret );
        }

        System.out.println("Merci d'avoir jouer et à bientôt !" );
    }
}
