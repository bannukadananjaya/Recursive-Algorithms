import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {2, 5, 6, 10, 11, 13, 15, 18, 20, 22, 23, 25};
        System.out.println("Enter the number");

        int num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                System.out.println("Value find");
                break;
            }
        }
    }
}
