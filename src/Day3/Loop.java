package Day3;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);

        int num[] = new int[11];
        int i,sum=0;


        for (i = 0; i < 10; i++) {
            num[i] = hp.nextInt();
            sum = sum + num[i];
        }

        System.out.println(sum);


    }
}
