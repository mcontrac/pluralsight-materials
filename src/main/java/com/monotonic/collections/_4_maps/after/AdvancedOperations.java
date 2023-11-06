package com.monotonic.collections._4_maps.after;

import java.util.HashMap;
import java.util.Map;

public class AdvancedOperations
{
    public static void main(String[] args)
    {
        var defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        var result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        result = idToProduct
            .computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        idToProduct.replaceAll((key, oldProduct) ->
            new Product(oldProduct.getId(), oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println();
    }
}
