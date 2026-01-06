import java.util.*;
class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        StringBuilder sb = new StringBuilder(val).reverse();
        // for(int i = val.length() - 1; i>=0; i--){
        //     sb.append(val.charAt(i));
        // }
        System.out.println(sb);
    }
}
