public class Str{
    public int multiply(int NumOne,int NumTwo){
        int numThree=NumOne*NumTwo;
        return numThree;
    }
    public static void main(String args[])
    {
Str obj=new Str();
        int c= obj.multiply(10,20);
        System.out.println(c);

    }
    }
