package Day3;

import java.util.Scanner;

public class ExtremeMultiplication {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);

        int num[] = new int[21];
        num[20]=1;

        for(int i=0;i<20;i++) {
            num[i] = hp.nextInt();
            num[20] = num[20]*num[i];
        }

        System.out.println(num[20]);
    }
}
