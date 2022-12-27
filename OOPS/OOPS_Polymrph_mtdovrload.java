public class OOPS_Polymrph_mtdovrload {
    public static void main (String args[]){
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2,3));
        Deer d =new Deer();
        d.eat();
    }
}
//Method overriding
class Animal{
    void eat(){
        System.out.println("eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
//Method overloading
// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a, int b,int c){
//         return a+b+c;
//     }

// }


 