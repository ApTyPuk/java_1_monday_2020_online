package student_lilija_g.homework.lesson_8.level_7_senior.super_task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
