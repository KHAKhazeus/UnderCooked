package Composite;

import Utils.Utils;

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
        Utils.logger.info("("+this.toString()+") : ");
        return size;
    }

    @Override
    public String getName() {
        return name;
    }
}
