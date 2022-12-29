package Multiple4;

public class Main {
    public static void main(String[] args) {
        int[] array = GetNum.getInput();
        int sum = Cal.sum(array);
        System.out.print("合計値: ");
        System.out.println(sum);
        IsMul4.judgeMul4(sum);
    }
}
