package com.itheima.pojo;

import java.util.Date;

public class Log {
    private Integer id;
    private String name;
    private Date time;
    private String url;
    private Integer cost;
    private Integer aaa;
    private Integer bbb;
    private Integer ccc;
    private Integer ddd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
