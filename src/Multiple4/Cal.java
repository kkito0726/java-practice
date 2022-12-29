package Multiple4;

public class Cal {
    public static void main(String[] args) {
        int[] array = {3,4,6,7};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num: array) {
            sum += num;
        }

        return sum;
    }
}
