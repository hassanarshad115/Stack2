public class Stack2 {
    
 private static final int capacity = 3;
 int arr[] = new int[capacity];
 int top = -1;
 
     public void push(int p)
 {
      if (top < capacity - 1) 
  {
       top++;
       arr[top] = p;
       System.out.println("Element " + p+ " is pushed to Stack !");
  }
        else
  {
        System.out.println("Stack Overflow !");
  }
 }

         public void pop()
 {
          if (top >= 0)
  {
          top--;
          System.out.println("Pop operation done !");
  }
          else
    {
          System.out.println("Stack Underflow !");
  }
 }

           public void print()
 {
            if (top >= 0) 
     {
            System.out.println("Elements in stack :");
            for (int i = 0; i <= top; i++) 
         {
            System.out.println(arr[i]);
   }
  }
 }


 
 public static void main(String[] args)
 {
  Stack2 h = new Stack2();

  h.pop();
  h.push(0);
  h.push(1);
  h.push(2);
  h.push(3);
  h.pop();
  h.pop();
  h.pop();
  h.pop();
 }

}
