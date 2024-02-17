import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int billsum = sc.nextInt();
        int[] receipt = new int[sc.nextInt()*2];
        int receiptsum = 0;


        for(int i=0;i<receipt.length;i++) {
            receipt[i] = sc.nextInt();
            if((i%2)==1){
                receiptsum = receiptsum+receipt[i-1]*receipt[i];
                System.out.println(receipt[i-1]+" "+receipt[i]);
            }else {
            }
        }


        if(billsum==receiptsum){
            System.out.println("Yse");
        }else {
            System.out.println("No");
        }




    }
}