package com.monotonic.collections._5_streams.before;

import com.monotonic.collections._5_streams.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        var result = products
                .stream()
                .filter(product -> product.getWeight() < 30)
                .sorted(comparingInt(Product::getWeight))
                .toList();

        System.out.println("result = " + result);
    }
}
