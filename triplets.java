public class Solution {
    public int solve(String[] arr) {
        int n =arr.length;
        //double arr[] = new double [n];
       
        
        double a = Double. parseDouble(arr[0]); 
        double b =Double. parseDouble(arr[1]); 
        double c = Double. parseDouble(arr[1]);
        
        for(int i= 3; i<n; i++)
        {
        if((a+b+c) > 1 && (a+b+c) < 2)
        {
        return 1;
        }
        
        else if(a+b+c > 2)
        {
            if(a > b && a > c)
             a = Double. parseDouble(arr[i]);
             
             else if( b > c && b > a )
             b = Double. parseDouble(arr[i]);
             
             else
             c = Double. parseDouble(arr[i]);
        }
        
        else
        {
           if(a < b && a < c)
             a = Double. parseDouble(arr[i]);
             
             else if( b < c && b < a )
             b = Double. parseDouble(arr[i]);
             
             else
             c = Double. parseDouble(arr[i]);
        }
        }
    
    if((a+b+c) > 1 && (a+b+c) < 2)
    return 1;
    else
    return 0;
}
}
