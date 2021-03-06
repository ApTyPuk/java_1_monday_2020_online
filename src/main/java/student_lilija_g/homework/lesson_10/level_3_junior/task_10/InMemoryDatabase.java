package student_lilija_g.homework.lesson_10.level_3_junior.task_10;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    public static List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        Optional<Product> productReturn = Optional.empty();
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                productReturn = Optional.of(product);
            }
        }
        return productReturn.orElse(null);
    }

}
