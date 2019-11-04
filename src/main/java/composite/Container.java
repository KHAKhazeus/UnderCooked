package composite;

import Utils.Utils;

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
       Utils.logger.info("("+this.toString()+") : ");
       int size = 0;
       for (Item it:itemList) {
           size+=it.getSize();

       }
       return size;
    }

    @Override
    public Item add(Item item) throws Exception {
        Utils.logger.info("("+this.toString()+")"+" : ");
        if(item.setParent(this)){
            itemList.add(item);
            System.out.println(this.getName()+" is added in the Container.");
            return item;
        }
        else{
            throw new Exception(item.getName() +" has already been added in the Container " + item.getParent().getName()+"!");
        }

    }

    @Override
    public void printList() throws Exception {
       Utils.logger.info("("+this.toString()+") : ");
       System.out.println("Container "+this.getName()+" has these items:");
       for(Item item:itemList){
           System.out.println(item.getName());
       }
       System.out.println();

    }
}
