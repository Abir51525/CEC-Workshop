package Day3;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);

        int num[] = new int [11];

        num[0] = hp.nextInt();
        num[1] = hp.nextInt();
        num[2] = hp.nextInt();
        num[3] = hp.nextInt();
        num[4] = hp.nextInt();
        num[5] = hp.nextInt();
        num[6] = hp.nextInt();
        num[7] = hp.nextInt();
        num[8] = hp.nextInt();
        num[9] = hp.nextInt();

        num[10] = num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9];

        System.out.println(num[10]);
    }
}
