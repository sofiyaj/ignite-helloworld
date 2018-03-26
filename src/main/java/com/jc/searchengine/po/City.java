package com.jc.searchengine.po;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: wangjie
 * @Description:
 * @Date: Created in 13:29 2018/3/21
 */
public class City {
    private static final AtomicLong ID_GEN = new AtomicLong();

    @QuerySqlField(index = true)
    private long id;

    @QuerySqlField
    private String name;

    public City(){}
    public City(long id,String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + "]";
    }
}
