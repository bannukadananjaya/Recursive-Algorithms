import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        int array[] = {2,5,6,10,11,13,15,18,20,22,23,25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int sol = find(array,0,array.length);
        if(sol==-1){
            System.out.println("There is no such index exist");
        }else{
            System.out.println("such value find on index "+sol);
        }

    }

    public static int find(int[] array,int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (array[mid] == mid) {
            return mid;
        } else if (mid > array[mid]) {
            return find(array, mid + 1, high);
        } else  {
            return find(array, 0, mid - 1);
        }

    }
}
