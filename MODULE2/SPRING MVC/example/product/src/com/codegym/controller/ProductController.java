package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/products")
    public ModelAndView list(){
        List<Product> products = this.productService.findAll();
        ModelAndView modelAndView = new ModelAndView("product/list","products",products);
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/new")
    public ModelAndView createProduct(@ModelAttribute("product") Product product){
        int randomId = (int)(Math.random() * 10000);
        product.setId(randomId);//For demo purpose only

        this.productService.save(product);

        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product was created");
        return modelAndView;
    }

    @GetMapping(value = "/view")
    public ModelAndView view(@RequestParam("id") Integer productId){
        Product product = this.productService.findById(productId);
        ModelAndView modelAndView = new ModelAndView("product/view");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView showEditForm(@RequestParam("id") Integer productId){
        Product product = productService.findById(productId);
        ModelAndView modelAndView = new ModelAndView("product/edit");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping(value = "/edit")
    public ModelAndView editProduct(@ModelAttribute("product") Product product){

        this.productService.save(product);

        ModelAndView modelAndView = new ModelAndView("product/edit");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

//    @GetMapping("/delete")
//    public ModelAndView showDeleteForm(@RequestParam("id") Integer productId){
//        Product product = productService.findById(productId);
//        ModelAndView modelAndView = new ModelAndView("product/delete");
//        modelAndView.addObject("product", product);
//        return modelAndView;
//    }

    @PostMapping(value = "/delete")
    public ModelAndView deleteProduct(@RequestParam("id") Integer product  ){
        this.productService.remove(product);
        List<Product> products = this.productService.findAll();
        ModelAndView modelAndView = new ModelAndView("product/list","products",products);
        return modelAndView;
    }

    @PostMapping(value = "/search")
    public ModelAndView searchProduct(@RequestParam String searchs){
        List<Product> productsList = new ArrayList<>();
        List<Product> products = this.productService.findAll();
        for(Product product1:products){
            if(product1.getName().toLowerCase().contains(searchs.toLowerCase())){
                productsList.add(product1);
            }
        }
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", productsList);
        return modelAndView;
    }


}