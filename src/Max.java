
public class Max {
    public static void main(String []args)
    {
    int a;
    int b;
    int r;
    a=10;
    b=6;
    
    
    r =max(a,b);
    
System.out.println("the max number is="+r);


    }
  public static  int max(int x,int y)
    {
    int max;
    if(x>y)
    {
    max=x;
    
    }
    else
    {
    max=y;
    
    }
    return max;
    }
  
    
}
