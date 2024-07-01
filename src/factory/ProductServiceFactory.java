package factory;

import service.ProductService;

/**
 * {@link ProductServiceFactory} is used to create an instance of {@link service.ProductService}
 * <p>
 * TODO: 1. Implement method {@link ProductServiceFactory#createProductService()}
 */
public class ProductServiceFactory {

    /**
     * Create a new instance of {@link ProductService}
     *
     * @return ProductService
     */
    public ProductService createProductService() {
        return new ProductService();
    }
}
