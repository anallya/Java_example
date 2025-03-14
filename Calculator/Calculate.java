public class Calculate{
    public static void add(int numOne,int numTwo){
        int numThree = numOne+numTwo;
        System.out.println("sum= "+numThree);
    }
     public static void sub(int numOne,int numTwo){
        int numThree = numOne-numTwo;
        System.out.println("difference= "+numThree);
     }
      public static void multiply(int numOne,int numTwo){
        int numThree = numOne*numTwo;
        System.out.println("product= "+numThree);
      }
      public static void main(String args[]){
        int numOne=10;
        int numTwo=20;
        Calculate obj=new Calculate();
        obj.add(numOne,numTwo);
        obj.sub(numOne,numTwo);
        obj.multiply(numOne,numTwo);
      }
}
    
    