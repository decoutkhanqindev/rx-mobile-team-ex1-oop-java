package data;

import org.jetbrains.annotations.NotNull;
import service.Product;

import java.util.Set;

public interface IProductDao {
    boolean add(@NotNull Product product);
    Set<Product> findAll();
}
