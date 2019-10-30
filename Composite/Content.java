package com.Composite;

public class Content extends Item {
    private String name = "";
    private int size = 0;
    private Container parent = null;

    public Content(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }
}
