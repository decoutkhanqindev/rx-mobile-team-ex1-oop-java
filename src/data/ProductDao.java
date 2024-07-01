package data;

import org.jetbrains.annotations.NotNull;
import service.Product;

import java.util.Set;

public interface ProductDao {
    boolean add(@NotNull Product product);
    Set<Product> findAll();
}
