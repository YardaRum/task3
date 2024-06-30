import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i,j,dubl = 1;
        int[] ar1 = new int[20];
        for(i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random() * 15) + 1;
            System.out.print(ar1[i] + "  ");
        }
        System.out.print("\n");
        Arrays.sort(ar1);
        /*//вывод отсортированного массива для проверки
        for(i = 0; i <  ar1.length; i++) {
            System.out.print(ar1[i] + "  ");
        }*/
        for(i = 0; i <  ar1.length-1; i++) {
            j=i+1;
            if (ar1[i] == ar1[j]){
                dubl++;
            }
            else if (dubl != 1){
                System.out.print("\nЧисло " + ar1[i] + " встречается " + dubl + " раза");
                dubl = 1;
            }
        }
    }
}
