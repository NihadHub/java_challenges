import java.util.Scanner;
    public class Rebours{
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.print("Entrez un nombre: ");
            int number = scanner.nextInt();
            for(int i=number; i>=0; i--){
                System.out.print(i + " ");
            }
            scanner.close();
        }
    }