import java.util.Scanner;

public class Q01 {
    //call Scanner method inside the whole class as it can be used in all methods
    Scanner sc = new Scanner(System.in);
    private int num;
    public static void main(String[] args) {
       
        //defined array 
        int array[] = {2,5,6,10,11,13,15,18,20,22,23,25};

        //get user input to find the desired number 
        System.out.println("Enter the number :");
        num = sc.nextInt();

        int sol = find(array,0,array.length);
        if(sol==-1){
            System.out.println("There is no such index exist");
        }else{
            System.out.println("such value find on index "+sol);
        }

    }
    
    //method to get user defined array
    public void chooseArrray(){
        system.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] array = new int[len];

        for(int i = 0; i < len; i++){
            system.out.println("Enter "+i+" number: ");
            array[i]  = sc.nextInt();
        } 
    }

//Q01 FInd the identity
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

//Q2 find a number which user ask for
     public find(int arr[],int min, int max) {
        int mid = (min+max)/2;

        if(mid > max){
            return -1;
        }else(num>arr[mid]){
            return find(arr,mid+1,max);
        }else{
            return find(arr,0,mid-1)
        }
        
    }

    //find anagrams
    //here the code is not recursive
    public findAnagram(String str1, String str2){
        if(str1.length != str2.length){
            return -1;
        }
        //convert words to lowercase
        str1 = str1.toLowerCase(); 
        str2 = str2.toLowerCase();

        //convert words to char array
        char[] str1 = str1.toCharArray();
        char[] str2 = str2.toCharArray();

        //sort char arrrays
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2)
    }
}
