package data;

import org.jetbrains.annotations.NotNull;
import service.Product;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link ProductDaoImpl} represents a Data Access Object (DAO) for products.
 * The implementation is simplified, so it just uses {@link HashSet} to store.
 * <p>
 * todo: 1. Implement a method {@link IProductDao#add(Product)} that store new product into the set
 * todo: 2. Implement a method {@link ProductDaoImpl#findAll()} that returns a set of all products
 */
public class ProductDaoImpl implements IProductDao {
    private final Set<Product> products = new HashSet<>();

    /**
     * Stores a new product
     *
     * @param product a product to store
     * @return {@code true} if a product was stored, {@code false} otherwise
     */
    @Override
    public boolean add(@NotNull Product product) {
        return products.add(product);
    }

    /**
     * Returns all stored products
     *
     * @return a set of all stored products
     */
    @Override
    public Set<Product> findAll() {
        return new HashSet<>(products);
    }
}
