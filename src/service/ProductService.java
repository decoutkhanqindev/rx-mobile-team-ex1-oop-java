package service;

import data.ProductDaoImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * {@link ProductService} provides an API that allows to manage {@link Product}s.
 * <p>
 * TODO: 1. Using {@link ProductDaoImpl} implement method {@link ProductService#addProduct(Product)}}
 * TODO: 2. Using {@link ProductDaoImpl} implement method {@link ProductService#searchProducts(String)}
 */
public class ProductService {
    private final ProductDaoImpl dao;

    public ProductService() {
        dao = new ProductDaoImpl();
    }

    /**
     * Adds a new product to the system.
     *
     * @param product a product to add
     * @return {@code true} if a product was added, {@code false} otherwise.
     */
    public boolean addProduct(@NotNull Product product) {
        return dao.add(product);
    }

    /**
     * Returns all products that contains the given query in the name or description.
     *
     * @param query a search query
     * @return a list of found products
     */
    public List<Product> searchProducts(@NotNull String query) {
        Set<Product> productSet = dao.findAll();
        List<Product> productList = new ArrayList<>();
        for (Product product : productSet) {
            if (product.getName().contains(query) || product.getDescription().contains(query)) {
                productList.add(product);
            }
        }
        return productList;
    }
}
