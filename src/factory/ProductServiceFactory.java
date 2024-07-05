package factory;

import data.IProductDao;
import data.ProductDaoImpl;
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

    private final IProductDao dao = new ProductDaoImpl();

    public ProductService createProductService() {
        return new ProductService(dao);
    }
}
