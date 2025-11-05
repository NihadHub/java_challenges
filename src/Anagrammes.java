import java.util.Arrays;
import java.util.Scanner;
public class Anagrammes {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entrez le premier mot: ");
        System.out.println("Entrez le deuxieme mot: ");
        String mot1= scanner.nextLine();
        String mot2= scanner.nextLine();
        char[] charArray1 = mot1.toCharArray();
        char[] charArray2 = mot2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1,charArray2)){
            System.out.println(" Les deux mots sont des anagrammes.");
        }else{
            System.out.println(" Les deux mots sont pas des anagrammes.");
        }


    }
}
