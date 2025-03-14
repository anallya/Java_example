import java.util.*;
public class Adding{

    public void add(int a,int b){
        int c=a+b;
        System.out.println("sum: "+c);
    }

     public  void sub(int a,int b){
        int c=a-b;
        System.out.println("difference: "+c);
     }

      public  void multiply(int a,int b){
        int c=a*b;
        System.out.println("product: "+c);
      }
      public void divide(int a,int b){
        int c=a/b;
        System.out.println("divide:"+c);
      }
      public static void main(String args[])
      {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the value of a");
    int a=input.nextInt();
    System.out.println("enter the value of b");
    int b=input.nextInt();
    System.out.println("enter the choice");
    int choice= input.nextInt();
    if (choice ==1){
    Adding obj =new Adding();
    obj.add(a,b);}
    if(choice ==2){
        Adding obj=new Adding();
        obj.sub(a,b);}
        if (choice ==3){
        Adding obj=new Adding();
        obj.multiply(a,b);}
        if(choice == 4){
        Adding obj=new Adding();
        obj.divide(a,b);
        }
        }

    }

    
    
    
    