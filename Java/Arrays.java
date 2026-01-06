import java.util.Scanner;
import java.util.Arrays;
class Array1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        Arrays.sort(arr);
        System.out.print("Max ELEMENT IS " + arr[0]);
    }
}