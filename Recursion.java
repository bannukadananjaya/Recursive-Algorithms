package lab02;

import java.util.Scanner;
import java.util.Arrays;
public class Recursion{
    public int tri(int n){
        if (n == 1){
            return 1;
        }else{
            return n + tri(n-1); 
        }
    }

    public int fac(int n){
        if(n == 1){
            return 1;
        }else{
            return n * fac(n-1);
        }
    }

    public int fibb(int n){
        if(n == 2){
            return 2;
        }else{
            return fibb(n-1) + fibb(n-2);
        }
    }

    public static boolean isAnagram(String str1, String str2){
        // if(str1.length() == str2.length()){
        //     return false;
        // }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        //System.out.println(charArray1);
        //System.out.println(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }

    public void histro(int n){

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //code for anagram chacker
        System.out.println("Enter the first String :");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string :");
        String str2 = sc.nextLine();

        //isAnagram(str1, str2);

        if(isAnagram(str1,str2)){
            System.out.println("The strins are anagrams.");
        }else{
            System.out.println("The strings are not anagrams");
        }
    }
}
