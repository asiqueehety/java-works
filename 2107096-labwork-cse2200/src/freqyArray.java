import java.util.Scanner;

public class freqyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int cou=0;


        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        int x=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==x){
                cou++;
            }
        }
        System.out.println(cou);
    }
}