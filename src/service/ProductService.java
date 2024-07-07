package service;

import data.IProductDao;
import data.ProductDaoImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * {@link ProductService} provides an API that allows to manage {@link Product}s.
 * <p>
 * TODO: 1. Using {@link ProductDaoImpl} implement method {@link ProductService#addProduct(Product)}}
 * TODO: 2. Using {@link ProductDaoImpl} implement method {@link ProductService#searchProducts(String)}
 */
public class ProductService {
    private final IProductDao dao;

    public ProductService(IProductDao dao) {
        this.dao = dao;
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
        Set<Product> productsSet = dao.findAll();
//        List<Product> productsList = new ArrayList<>();
//        for (Product product : productSet) {
//            if (product.getName().contains(query) || product.getDescription().contains(query)) {
//                productList.add(product);
//            }
//        }
//        return productList;

        return productsSet.stream()
                .filter(product -> product.getName().contains(query) || product.getDescription().contains(query))
                .collect(Collectors.toList());
    }

    public void printProducts() {
        System.out.println(dao.findAll());
    }
}
