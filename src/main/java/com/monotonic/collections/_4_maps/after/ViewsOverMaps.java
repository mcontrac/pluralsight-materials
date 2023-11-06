package com.monotonic.collections._4_maps.after;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps
{
    public static void main(String[] args)
    {
        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        var ids = idToProduct.keySet();
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);

//        ids.add(5);

        var products = idToProduct.values();
        System.out.println(products);
        System.out.println(idToProduct);

        products.remove(ProductFixtures.window);

        System.out.println(products);
        System.out.println(idToProduct);

//        products.add(ProductFixtures.window);

        var entries = idToProduct.entrySet();
        for (var entry : entries)
        {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

//            entry.setValue(ProductFixtures.window);
        }

        var entry = Map.entry(3, ProductFixtures.window);
        entries.add(entry);

        System.out.println(idToProduct);
    }
}
