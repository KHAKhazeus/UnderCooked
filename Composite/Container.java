package com.Composite;

import java.util.Vector;

public class Container extends Item {
   private String name="";
   private Vector<Item> itemList = new Vector();

   public Container(String name){
       this.name = name;
   }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
       int size = 0;
       for (Item it:itemList) {
           size+=it.getSize();

       }
       return size;
    }

    @Override
    public Item add(Item item) throws Exception {
        if(item.setParent(this)){
            itemList.add(item);
            return item;
        }
        else{
            throw new Exception(item.getName() +" has already been added in the Container " + item.getParent().getName()+"!");
        }

    }

    @Override
    public void printList() throws Exception {
       System.out.println("Container "+this.getName()+" has these items:");
       for(Item item:itemList){
           System.out.println(item.getName());
       }
       System.out.println();

    }
}
