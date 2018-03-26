package com.jc.searchengine.po;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

/**
 * @Author: wangjie
 * @Description:
 * @Date: Created in 13:22 2018/3/21
 */
public class Person {

    @QuerySqlField
    private long id;

    @QuerySqlField
    private String name;

    @QuerySqlField
    private long city_id;

    public  Person(){}
    public  Person(long id,String name,long city_id){
       this.id = id;
       this.name = name;
       this.city_id = city_id;
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

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + ", city_id=" + city_id + "]";
    }
}
