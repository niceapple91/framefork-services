package com.soap.bussiness.range.productmanager;

import com.adidas.sef.ws.schema.range.*;
import com.soap.properties.SimplePropertyCreator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ProductManagerConstructor {

    public ProductManagers getProductManager(){
        List<String> productManagers = new ArrayList<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        productManagers.add(reader.getProperty("productManagerName"));
        return setProductManager(productManagers);
    }

    private ProductManagers setProductManager(List<String> productManagers){
        ProductManagers managers = new ProductManagers();
        Class clazz = ProductManagers.class;
        Field f;
        try {
            f = clazz.getDeclaredField("productManagerName");
            f.setAccessible(true);
            f.set(managers, productManagers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return managers;
    }

    public ProductManagers getProductManager(String... vargs){
        List<String> productManagers = new ArrayList<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        for (String propertyName: vargs) {
            productManagers.add(reader.getProperty(propertyName));
        }
        return setProductManager(productManagers);
    }
}

