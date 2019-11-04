package composite;

public abstract class Item {
    private Container parent = null;

    public abstract String getName();
    public abstract int getSize();
    public void printList() throws Exception {
        throw new Exception();
    }

    public Item add(Item item) throws Exception {
        throw new Exception("Item "+this.getName()+" cannot add Item!");
    }

    protected boolean setParent(Container parent){
        if(this.parent!=null){
            return false;
        }
        this.parent = parent;
        return true;
    }

    public Item getParent(){
        return this.parent;
    }
}

