package Multiple4;
import java.util.*;

public class GetNum {
    public static void main(String[] args) {
        int[] array = getInput();
        int sum = Cal.sum(array);
        System.out.println(sum);
    }
    public static int[] getInput() {
        System.out.println("=======================");
        System.out.print("数値の個数を入力: ");
        int N = new Scanner(System.in).nextInt();
        int[] array = new int[N];
        System.out.println("=======================");

        for (int i=0; i<array.length; i++) {
            System.out.print(i+1+"番目の数値を入力: ");
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("=======================");

        return array;
    }
}
