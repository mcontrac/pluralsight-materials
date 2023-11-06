package com.monotonic.collections._4_maps.before;

import java.util.HashMap;

public class AdvancedOperations
{
    public static void main(String[] args)
    {
        var defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

    }
}
