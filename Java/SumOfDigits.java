import java.util.Scanner;
import java.util.Arrays;
class Loop1{
    public static void main(String[] args){
        int number = 12345;
        int sumOfDig = 0;
        int count = 1;
        while(number > 0){
            int digit = number % 10;
            // if(count % 2 != 0) 
            sumOfDig += digit;
            number = number / 10;
            count++;
        }
        System.out.print(sumOfDig);
    }
}