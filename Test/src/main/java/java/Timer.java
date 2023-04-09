package Test.src.main.java.java;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter minutes");
        int mins = input.nextInt();



        for (int i = mins; i >= 0 ; i--) {
            String minutes = " minutes";
            if (i == 1 || i == 0){
                minutes = " minute";
            }
            for (int j = 59; j >= 0 ; j--) {
                String seconds = " seconds";
                if (j == 1 || j == 0){
                    seconds = " second";
                }
                System.out.print("\r" + i + minutes + " and " + j + seconds);
                Thread.sleep(1000);
            }
        }

        System.out.println("====================================");
        System.out.println("|           TIME IS UP. WAKE UP    |");
        System.out.println("====================================");

    }
}
