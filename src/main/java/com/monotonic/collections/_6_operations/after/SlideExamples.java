package com.monotonic.collections._6_operations.after;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlideExamples
{
    public static void main(String[] args)
    {
        // Disjoint

        var _1to3 = List.of(1, 2, 3);
        var _2to4 = List.of(2, 3, 4);
        var _4to6 = List.of(4, 5, 6);

        System.out.println(Collections.disjoint(_1to3, _4to6)); // true
        System.out.println(Collections.disjoint(_1to3, _2to4)); // false

        // Frequency

        var letters = "ABCDEFAADSEA".chars().mapToObj(x -> (char)x).toList();
        int count = Collections.frequency(letters, 'A');
        System.out.println(count);

        // Addall

        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        var products = new ArrayList<Product>();
        Collections.addAll(products, door, floorPanel, window);
        System.out.println(products);

        // Max / min
        maxEg();

        // Swap
        Collections.swap(products, 1, 2);
        System.out.println(products);

        // Reverse
        Collections.reverse(products);
        System.out.println(products);

        // Fill
        Collections.fill(products, door);
        System.out.println(products);
    }

    private static void maxEg()
    {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        var products = List.of(door, floorPanel, window);
        var max = Collections.max(products, Product.BY_WEIGHT);
        System.out.println(max == door);
    }
}
