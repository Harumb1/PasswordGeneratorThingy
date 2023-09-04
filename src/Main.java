import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

    static String combination =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{};:'\",./?`~";
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("PASSWORD GENERATOR!!!");
        System.out.println("How long do you want your password to be?");
        System.out.println("1. 8 Characters" +
                "\n2. 12 Characters" +
                "\n3. 16 Characters" +
                "\n4. 20 Characters");

        int CharInput = Integer.valueOf(sc.nextLine());

        switch (CharInput) {
            case 1:
                System.out.println("Your password is:");
                int len = 8;
                char[] pass1 = new char[len];
                Random random = new SecureRandom();
                for (int i = 0; i < len; i++) {
                    pass1[i] = Main.combination.charAt(random.nextInt(Main.combination.length()));
                    System.out.println(pass1);
                }
                break;

            case 2:
                System.out.println("Your password is:");
                int len2 = 12;
                char[] pass2 = new char[len2];
                Random random2 = new SecureRandom();
                for (int i2 = 0; i2 < len2; i2++) {
                    pass2[i2] = Main.combination.charAt(random2.nextInt(Main.combination.length()));
                    System.out.println(pass2);
                }
                break;

            case 3:
                System.out.println("Your password is:");
                int len3 = 16;
                char[] pass3 = new char[len3];
                Random random3 = new SecureRandom();
                for (int i3 = 0; i3 < len3; i3++) {
                    pass3[i3] = Main.combination.charAt(random3.nextInt(Main.combination.length()));
                    System.out.println(pass3);
                }
                break;

            case 4:
                System.out.println("Your password is:");
                int len4 = 20;
                char[] pass4 = new char[len4];
                Random random4 = new SecureRandom();
                for (int i4 = 0; i4 < len4; i4++) {
                    pass4[i4] = Main.combination.charAt(random4.nextInt(Main.combination.length()));
                    System.out.println(pass4);
                }
                 break;

                 default:
                System.out.println("Invalid option:");
        }

    }

}

