package student_dmitry_vasiliev.lesson_4.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_7 {

    private int num;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter please first integer number...");
        int num1 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num2 = in.nextInt();

        int result = num1 - num2;
        if (result > 0) {
            System.out.println("Numbers are different.");
        } else if (result < 0) {
            System.out.println("Numbers are different.");
        } else {
            System.out.println("Numbers are equals.");
        }
    }
}
