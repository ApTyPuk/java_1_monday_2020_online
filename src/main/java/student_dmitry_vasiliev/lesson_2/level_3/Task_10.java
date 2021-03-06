package student_dmitry_vasiliev.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        float radius = in.nextFloat();
        double a = Math.PI * radius;
        double perimeter = a * 2;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
}
