package oops.polymorphism.constructoroverloading;

public class ConstructorOverload {
    String name;
    int quantity;
    int price;
    ConstructorOverload(String name, int quantity, int price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    ConstructorOverload(int pr, String name){
        this.name = name;
        price = pr;
        quantity = pr/10;
    }

    ConstructorOverload(String name, int price){
        this.name = name;
        this.price = price;
        quantity = (int) (price - 0.1);
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload("Apple", 5, 200);
        obj1.printDetails();

        ConstructorOverload obj2 = new ConstructorOverload(200, "Banana");
        obj2.printDetails();

        ConstructorOverload obj3 = new ConstructorOverload("Orange", 300);
        obj3.printDetails();
    }

}
