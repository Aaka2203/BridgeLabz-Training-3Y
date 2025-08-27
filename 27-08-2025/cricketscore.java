import java.util.*;
public class queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no. of batsmen");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("runs");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("highest score");
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println("lowest");
        System.out.println(arr[0]);
        System.out.println("avg score");
        int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum/n);
        for(int i =0;i<n;i++){
            if (arr[i]>100){
                System.out.println(arr[i]+"  it is a century");
            }
                    }

    }
}
