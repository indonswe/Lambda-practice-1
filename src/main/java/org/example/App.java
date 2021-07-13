package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Product> listOfProducts = Arrays.asList(new Product("Lego",150,100),
                new Product("Book",99,5),
                new Product("Movie",125,9),
                new Product("Game",149,10),
                new Product("Fruit",5,500),
                new Product("Car",150000,0)
        );

        Conditional stockEmpty = new Conditional() {
            @Override
            public boolean test(Product p) {
                //if ()
                return p.getStock()==0;
            }
        };
        Action printOut = (Product p) -> System.out.println(p);

        /*Action printout = new Action() {
            @Override
            public void execute(Product p) {
                System.out.println(p);
            }
        };*/
        foo(listOfProducts, stockEmpty, printOut);
        foo(listOfProducts,
                (Product p) -> p.getStock() == 0,
                (Product p) -> System.out.println(p));
        foo(listOfProducts,
                (Product p) -> p.getProductName().startsWith("B"),
                (Product p) -> System.out.println(p));

    }

    public static void foo(List<Product> products,Conditional conditional,Action action){

        for(Product p:products){
           if (conditional.test(p)) {
              action.execute((p));
           }
        }



    }

}
