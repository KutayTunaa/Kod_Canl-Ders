package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    //aynı zamanda List<Logger>loggers == Logger[] loggers olarakta yazabiliriz
    // ikiside array anlamı taşır

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları örnek olması için kötü kod olarak yazılmıştır
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz!!!"); //ekrana hata verir.
        }
        productDao.add(product);
        for (Logger loggers : loggers) {//[db, file]
            loggers.log(product.getName());
        }
    }
}
