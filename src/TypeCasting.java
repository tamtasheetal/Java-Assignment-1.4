import java.io.DataInputStream;
public class TypeCasting {
public static void main(String[] args)throws Exception {
        //Declaring variables
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        DataInputStream in=new DataInputStream(System.in);
        //initializing values from user to short and byte variable
        System.out.println("Enter a number");
      a=Byte.parseByte(in.readLine());
      System.out.println("Enter a number");
      b=Short.parseShort(in.readLine());
      //storing sum in integer variable
      c=a+b;
      System.out.println("Sum in integer="+c);
       //storing sum in long variable
      d=b+c;
      System.out.println("Sum in long="+d);
      //storing sum in float variable
      e=(float)(c+d);
      System.out.println("Sum in float="+e);
      //storing sum in double variable
      f=(float)(d+e);
      System.out.println("Sum in double="+f);
      
      
        // TODO code application logic here
    }
    
}
