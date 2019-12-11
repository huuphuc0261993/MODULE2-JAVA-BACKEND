package quanlysanpham.service;

import quanlysanpham.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Samsung A50","500","dien thoai","Japan"));
        products.put(2,new Product(2,"Samsung A80","500","dien thoai","Japan"));
        products.put(3,new Product(3,"Iphone 7","500","dien thoai","Usd"));
        products.put(4,new Product(4,"Iphone X","500","dien thoai","Usd"));
        products.put(5,new Product(5,"Oppo F11","500","dien thoai","Taiwan"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
    products.remove(id);
    }

    @Override
    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> productsResult = new ArrayList<>();
        for (Product product: products.values()){
            if (product.getName().contains(name))
                productsResult.add(product);
        }
    return productsResult;
    }
}
