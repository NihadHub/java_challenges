import java.util.Arrays;

    public class DeuxiemePlusGrand {
        public static void main(String[] args){

            int []array = {94,100,22,5,0,7,73};
            Arrays.sort(array);
            int second = array[array.length-2];
            System.out.println("le deuxieme plus grand est: "+ second);
        }

}
