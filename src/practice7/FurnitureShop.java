package practice7;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public FurnitureShop(int n){
    }

    ArrayList<Furniture> getFurniture(){
        return furnitures;
    }

    void addLockerInShop(Locker ... args){
        for (int i=0;i<args.length;i++) furnitures.add(args[i]);
    }

    void addTableInShop(Table ... args){
        for (int i=0;i<args.length;i++) furnitures.add(args[i]);
    }

    public static void main(String args[]) {
        FurnitureShop shop = new FurnitureShop(2);
        Person me = new Person();

        Locker locker = new Locker(100, "black", 2);
        shop.addLockerInShop(locker);
        int i = shop.getFurniture().indexOf(locker);
        System.out.println(shop.getFurniture().get(i));

        Table table = new Table("white",50);
        shop.addTableInShop(table);
        int j = shop.getFurniture().indexOf(table);
        System.out.println(shop.getFurniture().get(j));

        me.buyFurniture(shop.getFurniture().get(i));
        me.buyFurniture(shop.getFurniture().get(j));

        System.out.println(me.getMyPurchase());
    }

}