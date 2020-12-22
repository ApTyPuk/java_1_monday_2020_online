package student_alexander_shl.homework.lesson_8.level_1_intern.Task_2;
/*
Нужно ли в классе создавать дефолтный конструктор
или Java его автоматически добавит при компиляции
кода? Ответьте на вопрос примером кода!
 */

class DefaultConstructor {
    int number;
    String name;
}

/*
Если конструктор класса не определен явно, то в Java для класса создается
конструктор по умолчанию.
Конструктор по умолчанию инициализирует все переменные экземпляра
устанавливаемыми по умолчанию значениями.
Но как только в классе будет определен собственный конструктор, конструктор по умолчанию
больше не используется.
*/