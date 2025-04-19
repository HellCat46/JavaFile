import java.util.*;

class List {
    Vector<Item> items = new Vector<>();
    void append(int id, String name, int price){
        if(items.size() == 5) {
            System.out.println("List is full");
            return;
        }
        items.add(new Item(id, name, price));
    }

    void addSpec(int loc, int id, String name, int price){
        if(items.size() == 5) {
            System.out.println("List is full");
            return;
        }
        items.add(loc, new Item(id, name, price));
    }

    void print(){
        System.out.println("\n\nId\tName\tPrice");
        for(Item item : items){
            System.out.println(item.id+"\t"+item.name+"\t"+item.price);
        }
    }

    void remove(int itemId){
        int idx =0;
        for(; idx <items.size(); idx++){
            if(itemId == items.get(idx).id){
                break;
            }
        }
        if(idx == items.size()){
            System.out.println("Item not in List");
            return;
        }

        items.remove(idx);
    }
}

class Item {
    int id, price;
    String name;
    Item(int id, String name, int price){
        this.id = id;
        this.price = price;
        this.name = name;
    }
}

class Program5 {
    public static void main(String[] args){
        List list = new List();
        list.append(1,"Orange", 50);
        list.append(3,"Apple", 150);
        list.addSpec(1, 2,"Banana", 75);
        list.addSpec(1, 4,"Mango", 175);
        list.addSpec(1, 5,"Grapes", 90);
        list.addSpec(1, 6,"Kiwi", 170);
        list.print();
        list.remove(2);
        list.print();
    }
}