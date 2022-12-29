package Multiple4;

public class IsMul4 {
    public static void main(String[] args) {
        judgeMul4(400);
    }
    public static void judgeMul4(int num) {
        if (num % 4 == 0) {
            System.out.println("入力された数値の総和は4の倍数である");
        }
        else {
            System.out.println("入力された数値の総和は4の倍数ではない");
        }
        System.out.println("=======================");
    }
}
