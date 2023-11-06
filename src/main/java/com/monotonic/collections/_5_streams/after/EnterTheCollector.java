package com.monotonic.collections._5_streams.after;

import com.monotonic.collections._5_streams.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class EnterTheCollector
{
    public static void main(String[] args)
    {
        var door = new Product(1, "Wooden Door", 35);
        var floorPanel = new Product(2, "Floor Panel", 25);
        var window = new Product(3, "Glass Window", 10);

        var products = List.of(door, floorPanel, window, floorPanel, window, floorPanel);

        Map<String, Long> lightProducts = products
            .stream()
            .filter(product -> product.getWeight() < 30)
            .sorted(comparingInt(Product::getWeight))
            .collect(groupingBy(Product::getName, counting()));

        System.out.println(lightProducts);
    }
}
