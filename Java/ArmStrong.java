class Armstrong{
    public static void main(String[] args){
        int number = 135;
        int temp = number;
        int count = 0;
        while(temp > 0){
            count += 1;
            temp /= 10;
        }
        temp = number;
        int result = 0;
        while(temp > 0){
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp /= 10;
        }
        if(result == number){
            System.out.println("Armstrong Number!!");
        }else{
            System.out.println("Not an Armstrong Number!!");
        }
    }
}