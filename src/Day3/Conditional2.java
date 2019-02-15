package Day3;
import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = hp.nextLine();

        System.out.println("Hi, " + name + ". How are you?");
        String feeling = hp.nextLine();

        if (feeling.equalsIgnoreCase("Fine")) {
            System.out.println("That's great, are you Male or Female?");
            String sex = hp.nextLine();
        } else {
            System.out.println("Oh!!");
        }

        System.out.println("Okay!.How old are you?");
        int age = hp.nextInt();

        switch (age) {
            case 1:
                System.out.println("h");
                break;
            case 2:
                System.out.println("i");
                break;
            case 3:
                System.out.println("j");
                break;
            case 4:
                System.out.println("k");
                break;
            case 5:
                System.out.println("l");
                break;
            case 6:
                System.out.println("m");
                break;
            case 7:
                System.out.println("n");
                break;
            case 8:
                System.out.println("o");
                break;
            case 9:
                System.out.println("p");
                break;
            case 10:
                System.out.println("q");
                break;
            case 11:
                System.out.println("r");
                break;
            case 12:
                System.out.println("s");
                break;
            case 13:
                System.out.println("t");
                break;
            case 14:
                System.out.println("u");
                break;
            case 15:
                System.out.println("v");
                break;
            default:
                System.out.println("W");
        }


    }
}
