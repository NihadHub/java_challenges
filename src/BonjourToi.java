import java.util.Scanner;
    public class BonjourToi{

        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.print("Entrez votre nom: ");
            String name = scanner.nextLine();
            System.out.println("Bonjour, "+name);
            scanner.close();
        }
    }

