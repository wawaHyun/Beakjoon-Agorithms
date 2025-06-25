

import java.util.*;

public class Beakjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 =  sc.nextInt();
        String num2 = sc.next();
        int num3 = Integer.parseInt(num2);

        int[] arr = new int[num2.length()];

        for(int i=0;i<arr.length;i++){
            arr[i] = num2.charAt(i)-48;
        }

        System.out.println((num1*arr[2]));
        System.out.println((num1*arr[1]));
        System.out.println((num1*arr[0]));

        System.out.println((num1*num3));
    }
}