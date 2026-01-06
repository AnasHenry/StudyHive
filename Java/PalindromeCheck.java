class PalindromeCheck{
    public static void main(String[] args){
        String val = "madam";

        //Approach - 1
        // int count = 0;
        // int l = 0;
        // int r = val.length() - 1;
        // while(l<r){
        //     if(val.charAt(l) == val.charAt(r)) count++;
        //     l++;
        //     r--;
        // }
        // if(count == (int) val.length() / 2) 
        //     System.out.print("A Palindrome");
        // else
        //     System.out.print("Not a Palindrome");

        //Approach - 2 
        StringBuilder sb1 = new StringBuilder(val);
        StringBuilder sb2 = new StringBuilder(val).reverse();
        if(sb1.toString().equals(sb2.toString())){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a Palindrome");
        }
    }
}