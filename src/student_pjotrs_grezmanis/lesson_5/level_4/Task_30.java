package student_pjotrs_grezmanis.lesson_5.level_4;

import java.util.Random;

 class Task_30 {
    public static void main(String[] args) {

        int[] randomNumber = new int[10];

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(100);
            randomNumber[r] = number;
            System.out.println(randomNumber[r]);
        }
        System.out.println ("Odd numbers:");
        for (int r = 0 ; r < randomNumber.length ; r++)

            if (randomNumber[r] % 2 != 0)
                System.out.println(randomNumber[r]);

    }
}