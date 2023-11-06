package com.monotonic.collections._5_streams.after;

import com.monotonic.collections._5_streams.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class StreamProducts
{
    public static void main(String[] args)
    {
        var door = new Product(1, "Wooden Door", 35);
        var floorPanel = new Product(2, "Floor Panel", 25);
        var window = new Product(3, "Glass Window", 10);

        var products = List.of(door, floorPanel, window, floorPanel, window);

        System.out.println(namesOfLightProductsWeightSortedStreams(products));
//        System.out.println(namesOfLightProductsWeightSortedLoop(products));
    }

    private static List<String> namesOfLightProductsWeightSortedStreams(final List<Product> products)
    {
        return products
            .stream()
            .filter(product -> product.getWeight() < 30)
            .sorted(comparingInt(Product::getWeight))
            .map(Product::getName)
            .toList();
    }

    private static List<String> namesOfLightProductsWeightSortedLoop(
            List<Product> products)
    {
        List<Product> lightProducts = new ArrayList<>();

        for (Product product : products)
        {
            if (product.getWeight() < 30)
            {
                lightProducts.add(product);
            }
        }

        lightProducts.sort(comparingInt(Product::getWeight));

        List<String> productNames = new ArrayList<>();
        for (Product product : lightProducts)
        {
            productNames.add(product.getName());
        }

        return Collections.unmodifiableList(productNames);
    }
}
