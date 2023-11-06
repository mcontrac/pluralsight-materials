package com.monotonic.collections._6_operations.after;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class CollectionOperations
{
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args)
    {
        var products = new ArrayList<>(List.of(window, floorPanel, door));
        System.out.println(products);

        Collections.rotate(products, 2);
        System.out.println(products);

        Collections.shuffle(products, ThreadLocalRandom.current());
        System.out.println(products);

        var alphabet = makeAlphabet();
        System.out.println(alphabet);

        int index = Collections.binarySearch(alphabet, 'M');
        System.out.println("index = " + index);
    }

    private static List<Character> makeAlphabet()
    {
        return IntStream.range('A', 'Z').mapToObj(x -> (char)x).toList();
    }
}
