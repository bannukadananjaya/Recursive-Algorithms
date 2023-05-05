import java.util.Scanner;

public class Q01 {

    public void find(int n,int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("Value find");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {2,5,6,10,11,13,15,18,20,22,23,25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        Q01 one = new Q01();
        one.find(num,array);
    }
}
