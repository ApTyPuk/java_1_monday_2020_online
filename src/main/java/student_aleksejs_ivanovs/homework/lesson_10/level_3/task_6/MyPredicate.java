package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_6;

import teacher.annotations.CodeReview;

/*Что такое функциональный интерфейс в Java?

Найдите в интернете информацию об этом.
Придумайте и реализуйте его в виде программного кода.
В коментарии в коде напишите ответ на вопрос.*/
@CodeReview(approved = true)
@FunctionalInterface
interface MyPredicate {

    boolean test(Integer value);

}

// Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
// Основное назначение – использование в лямбда выражениях и method reference.
// Наличие 1 абстрактного метода - это единственное условие,
// таким образом функциональный интерфейс может содержать так же default и static методы.
// К функциональному интерфейсу можно добавить аннотацию @FunctionalInterface.
// Это не обязательно, но при наличии данной аннотации код не скомпилируется,
// если будет больше или меньше, чем 1 абстрактный метод.

