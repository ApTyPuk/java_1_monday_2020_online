package student_artur_martinenko.homework.lesson_6.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {  //<
            System.out.println(i);
            i++;    //++
        }
    }

}
