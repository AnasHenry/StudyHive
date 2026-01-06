class OddEven{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int Es = 0;
        int Os = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0) Es += arr[i];
            else Os += arr[i];
        }
        System.out.println("Even Sum : " + Es + "\nOdd Sum : " + Os);
    }
}