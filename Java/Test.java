import java.util.*;
class Test{
    public static void main(String args[]){
        // String s = "";
        // for (int i = 0; i < 10; i++) {
        //     s = s + i;   
        // }
        // System.out.println(s);
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(val);
        StringBuilder sb2 = new StringBuilder();
        for(int i = val.length() - 1; i >= 0; i--){
            sb2.append(val.charAt(i));
        }
        if(sb1.toString().equals(sb2.toString())){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}