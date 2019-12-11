package quanlysanpham.service;

import quanlysanpham.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Samsung A50",500,"dien thoai","Japan"));
        products.put(2,new Product(2,"Samsung A80",500,"dien thoai","Japan"));
        products.put(3,new Product(3,"Iphone 7",500,"dien thoai","Usd"));
        products.put(4,new Product(4,"Iphone X",500,"dien thoai","Usd"));
        products.put(5,new Product(5,"Oppo F11",500,"dien thoai","Taiwan"));

    }
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
