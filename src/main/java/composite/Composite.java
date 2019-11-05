package composite;

public class Composite {
    public static void test(){

        System.out.println("===========================");
        System.out.println("Testing Composite:");
        System.out.println("===========================");

        try{
            Item item_a = new Content("筷子",2);
            Item item_d = new Container("筷笼");
            Container container_b = new Container("塑料袋");
            Content content_c = new Content("勺子",3);

            item_d.add(item_a);
            container_b.add(content_c);
            container_b.add(item_d);

            //Check printList
            item_d.printList();
            container_b.printList();

            //Check getSize
            int size_a = item_a.getSize();
            System.out.println(item_a.getName()+"的大小是: "+size_a);


            int size_c = content_c.getSize();
            System.out.println(content_c.getName()+"的大小是: "+size_c);



            System.out.println();

            //Check Exception

            //c has been added in a Container
            //item_d.add(content_c);

            //Content cannot add Item
            //content_c.add(container_b);


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
