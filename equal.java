 int maxLen(int[] arr) 
    {
         // Your code here
         int sum = 0;
         int max = 0;
         int j = 0;
         int n = arr.length;
         
         for(int i=0; i<n; i++)
         {
             if(arr[i] == 0 )
             arr[i] = -1;
         }
         
         for(int i=0; i<n; i++)
         {
             sum = 0;
             for(j=i; j<n; j++)
             {
                 sum += arr[j];
                 if(sum == 0)
                  max = Math.max(max,j-i+1); 
             }
         }
       return max;
    }
