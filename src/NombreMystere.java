import java.util.Scanner;
import java.util.Random;
public class NombreMystere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int number = random.nextInt(10)+1;
        int attempt;
        do {
            System.out.print("Devenez le nombre entre 1 et 10: ");
            attempt = scanner.nextInt();
                if(attempt<number){
                    System.out.print("Trop petit ! Essayez encore.");
                } else if (attempt>number) {
                    System.out.print("Trop grand ! Essayez encore.");
                } else {
                    System.out.print("Bravo ! Vous avez trouvé.");
                }

        } while(attempt!= number);

        scanner.close();
    }
}
