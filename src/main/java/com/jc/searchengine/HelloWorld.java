package com.jc.searchengine;

import com.jc.searchengine.po.Person;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;

/**
 * @Author: wangjie
 * @Description: put data and get data
 * @Date: Created in 13:38 2018/3/22
 */
public class HelloWorld
{
    public static void main(String[] args) throws IgniteException {
        try (Ignite ignite = Ignition.start("D:\\apache-ignite-fabric-2.3.0-bin\\examples\\config\\example-cache.xml")) {
            // Put values in cache.
            IgniteCache<Integer, Person> cache = ignite.getOrCreateCache("myCache");

            cache.put(1, new Person(1,"Hello",1));
            cache.put(2, new Person(2,"World!",2));

            // Get values from cache and broadcast 'Hello World' on all the nodes in the cluster.
            ignite.compute().broadcast(() -> {
                Person s1 = cache.get(1);
                Person s2 = cache.get(2);

                System.out.println(s1.toString() + " " + s2.toString());
            });
        }
    }
}
