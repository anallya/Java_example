class Parent{
    public void add(){
        System.out.println("hello world");
    }
}
class Child extends Parent
{
    void display(){
        System.out.println("home");
        
    }
}
 public class Overriding{
    public static void main(String args[]){
 Child obj1 =new Child();
    obj1.display();
} 
    }

