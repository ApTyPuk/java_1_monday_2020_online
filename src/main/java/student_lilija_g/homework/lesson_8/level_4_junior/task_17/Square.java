package student_lilija_g.homework.lesson_8.level_4_junior.task_17;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
