class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("no one can bark ");
    }
}
public class prgm1{
    public static void main(String args[]){
        Animal a = new Dog(); // Upcasting
        a.sound(); // Calls the overridden method in Dog class
    }
}