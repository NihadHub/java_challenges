import java.util.Scanner;
import java.util.Arrays;
    public class RotationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            int [] table={1,2,5,9};
            int last = table[table.length - 1];
            for (int i = table.length - 1; i > 0; i--) {
                table[i] = table[i - 1];
            }
            table[0] = last;

            System.out.println("Après rotation : " + Arrays.toString(table));
        }
    }
