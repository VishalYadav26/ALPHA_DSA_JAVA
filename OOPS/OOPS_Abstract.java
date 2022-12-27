public class OOPS_Abstract {
    public static void main(String args[]){
        Mustang myHorse = new Mustang();
        //Animal-->Horse-->Mustang

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);

    }
    
}
abstract class Animal{
    //can have constructor
    String color;
    Animal(){
        color = "brown";
        System.out.println("animal constructor called");
    }
    //non abstract method
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark Brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
// class Chicken extends Animal {
//     void changeColor(){
//         color = "dark Yellow";
//     }
//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }
