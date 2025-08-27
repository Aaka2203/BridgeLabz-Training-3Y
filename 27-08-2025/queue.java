public class queue {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("no. of transactions");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("enter transactions");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       int bal=0;
       for(int i =0;i<arr.length;i++){
           if(arr[i]>0){
               System.out.println("DEPOSIT");
               bal=bal+arr[i];
           }
           else{
               System.out.println("WITHDRAWAL");
               bal=bal+arr[i];
           }
       }
       System.out.println("the total balance is "+ bal);
       if(bal<0){
           System.out.println("0verdraft!");
       }
   }
}