import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     int t = sc.nextInt();
     while(t-- > 0)
     {
         int n = sc.nextInt();
         int arr[] = new int [n];
         
         for(int i=0; i<n; i++)
         arr[i] = sc.nextInt();
         int max = 0;
         int max_sum = 0;
         int end = 0;
         int start = 0;
         int start1 = 0;
         int end1 = 0;
         int s = 0;
         for(int i=0; i<n; i++)
         {
             if(arr[i] <= 0)
             arr[i] = Integer.MIN_VALUE;
         }
         
         for(int i=0; i<n; i++)
         {
             
             max = max + arr[i];
             if(max <= 0)
             { max = 0;
                 s = i + 1;
             }
             
             if(max_sum < max)
             {
                 max_sum = max;
                 start = s;
                 end = i;
             }
             else if(max_sum == max)
             {
                 start1 = s;
                 end1 = i;
            }
             }
           if((end1 - start1) > (end - start))
           {
               start = start1;
               end = end1;
               
           }
            
        for(int i=start; i<=end; i++)
        System.out.print(arr[i]+" ");
     }
    }
    }
