import java.util.Scanner;

public class GoodPair {
    public static boolean checkGoodPair(int n, int[] arr,int b){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==b){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        if(checkGoodPair(n, arr, b)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
