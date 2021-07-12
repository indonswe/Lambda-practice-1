package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Product> productList = new ArrayList<>();
        Product bmw = new Product();
        Product audi = new Product();
        Product Mercedes = new Product();
        productList.add(bmw);

        methodIterate()

    }

    public void methodIterate(List<Product> products,Conditional conditional,Action action){

        products.forEach(product -> {
            if (product.getStock()==0){
                action.execute(product);
                //System.out.println(product.toString());
            }
                });

    }

}
