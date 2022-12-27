public class OOPS_Inheritance {
    public static void main(String args[]){
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);

        // Fish shark = new Fish();
        // shark.eat();

    }
}
//base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    void walk(){
        Sysytem.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Dog extends Mammals{
    String breed;
}
//derived class& Sub Class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }
