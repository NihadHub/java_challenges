import java.util.Scanner;
public class MiniDistributeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choix;
        double solde= 0.0;
        do{
            System.out.println("---Menu--- ");
            System.out.println("1. Consulter le solde ");
            System.out.println("2. Dépôt");
            System.out.println("3. Retrait ");
            System.out.println("4. Quitter");
            System.out.println("Entrez votre choix: ");
            choix = scanner.nextInt();
         switch(choix){
             case 1: System.out.println("Votre solde est: "+solde);
                break;
             case 2: System.out.println("Entrez le montant: ");
                      double depot = scanner.nextDouble();
                      solde +=depot;
                      System.out.println("Dépôt effectué avec succès. ");
                 break;
             case 3: System.out.println("Entrez le montant à retirer: ");
                      double retrait= scanner.nextDouble();
                      if(retrait<=solde){
                         solde -= retrait;
                          System.out.println("Retrait effectué ");
                      }else {
                          System.out.println("Votre solde est insuffisant ");
                      }
                 break;
             case 4: System.out.println("à la prochaine!");
                 break;
             default:  System.out.println("Choix invalide");
                    break;
         }
        }while(choix!=4);
        scanner.close();


    }

}


