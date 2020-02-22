import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0)
      {
          int n = sc.nextInt();
          int arr [] = new int [n];
          for(int i=0; i<n; i++)
          arr[i] = sc.nextInt();
          
          
          Arrays.sort(arr);
          System.out.println(func(arr,n));
      }
    }
      
      public static int func(int arr[],int n)
      {
          int array[] = new int [n];
          for(int i=0; i<n; i++)
          array[i] = n-1-i;
          
          for(int i=0; i<n; i++)
          if(array[i] == arr[i])
          {
              return 1;
          }
          return -1;
      }
}
