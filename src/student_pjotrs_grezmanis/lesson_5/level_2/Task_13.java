package student_pjotrs_grezmanis.lesson_5.level_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {

        Random random = new Random();

        int [] randomNumber = new int[3];

        int sum = 0 ;

        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(30);
            randomNumber[r] = number;

        }

        for (int r = 0; r < randomNumber.length; r++){
            System.out.println(randomNumber[r] );
            sum = randomNumber[0] + randomNumber[1] + randomNumber[2];

        }
           System.out.println("Sum = "+ sum);
    }
}
