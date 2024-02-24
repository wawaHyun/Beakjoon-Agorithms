import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        int total = 0;

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            total +=arr[i];
        }


        int bee1 =total-(arr[0]); //꿀벌1의 위치가 0, 꿀통이 맨끝
        int maxhoney = 0;


        for(int i = 1;i<arr.length-1;i++){
            int bee2 = 0;
            for(int j = i+1;j<arr.length;j++){
                bee2 += arr[j];
            }
            if(maxhoney<bee2){
                maxhoney = bee2;
            }
        }


        bee1 =total-(arr[arr.length-1]); //꿀벌1의 위치가 맨끝, 꿀통이 0
        maxhoney = 0;
        for(int i = arr.length-2;i>0;i--){
            int bee2 = 0;
            for(int j = i;j>0;j--){
                bee2 += arr[j];
            }
            if(maxhoney<bee2){
                maxhoney = bee2;
            }
        }




        bee1 =total-(arr[arr.length-1]); //꿀벌1의 위치가 맨끝, 꿀통이 0
        int maxhoney2 = 0;
        for(int i = arr.length-2;i>0;i--){
            int bee2 = 0;
            for(int j = i;j>0;j--){
                bee2 += arr[j];
            }
            if(maxhoney2<bee2){
                maxhoney2 = bee2;
            }
        }


        System.out.println((maxhoney+maxhoney2));

    }
}