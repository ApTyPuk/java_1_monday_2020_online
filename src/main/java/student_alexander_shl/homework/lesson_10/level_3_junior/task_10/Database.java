package student_alexander_shl.homework.lesson_10.level_3_junior.task_10;
/*
Task_10:
В предыдущем задании вы познакомились с классом Optional и узнали для чего он применяется.

Примените Optional для возвращаемого значения метода findByTitle() интерфейса Database.
Сделайте в коде интерфейса необходимые изменения, а так же реализуйте
новую версию этого интерфейса и протестируйте её.

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
 */
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
