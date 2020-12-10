package student_artur_martinenko.homework.lesson_14.level_1_2_intern.task_1_17;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
interface ApplePredicate {
    boolean test(Apple apple);
}

//Task_7
/*
Требование фермера:
Поиск яблок по цвету и весу вместе или по отдельности.

Тоесть фермер хочет иметь возможности:
- искать яблоки только по цвету,
- искать яблоки только по весу,
- искать яблоки и по цвету и по весу вместе.

Возможно в будущем у яблок могут появиться новые свойства,
например срок хранения. По этим свойствам фермер тоже захочет
делать поиск сочетая их в разных комбинациях с уже реализованными
свойствами: цвет и вес.

Возможное решение - смоделировать критерии выбора:
вы работаете с яблоками и возвращаете
логическое значение, основанное на некоторых атрибутах Apple
(например, зеленое оно или более тяжелое чем 150 г?).
Это называется предикатом (то есть функцией, которая возвращает
логическое значение).

Давайте определим интерфейс для моделирования критериев выбора:

interface ApplePredicate {
    boolean test (Apple apple);
}
 */

//Task_8
/*
Создайте реализацию интерфейса ApplePredicate для выбора:
- зелёных яблок
- красных яблок
- тяжелых яблок ( > 150 г.)
- лёгких яблок ( < 150 г.)
}
 */

//Task_15
/*
Интерфейс ApplePredicate является функциональным интерфейсом.

В Java функциональным интерфейсом является тот интерфейс,
у которого есть всего один метод.

У интерфейса ApplePredicate есть только один метод test().
Поэтому он является функциональным интерфейсом!

Для обозначения функциональных интерфейсов в Java применяется
аннотация @FunctionalInterface:

@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}
 */