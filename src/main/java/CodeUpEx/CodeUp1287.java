package CodeUpEx;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 0; j < cnt*i ; j++) {
                System.out.print('*');
            }
            System.out.println();


        }
    }
}
