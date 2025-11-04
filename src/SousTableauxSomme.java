import java.util.Arrays;

public class SousTableauxSomme {
    public static void main(String[] args) {
        int[] tab = {2, 6, 1, 4, 5};
        int cible = 6;

        for (int i = 0; i < tab.length; i++) {
            int somme = 0;
            for (int j = i; j < tab.length; j++) {
                somme += tab[j];
                if (somme == cible) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(tab, i, j + 1)));
                }
            }
        }
    }
}