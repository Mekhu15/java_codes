#include <iostream>
using namespace std;

int main() {
	//code
	
	int t;
	cin>>t;
	 while(t-- > 0)
	 {
	     int n,key;
	     cin>>n;
	     cin>>key;
	     int arr[n];
	     int a = 0;
	     int b = 0;
	     int f = 0;
	     int sum = 0; 
	     
	     for(int i=0; i<n; i++)
	     cin>>arr[i];
	     
	     for(int i=0; i<n; i++)
	     {
	         sum += arr[i];
	         while(sum > key)
	         {
	             sum -= arr[a];
	             a++;
	         }
	         
	         if(sum == key)
	         {
	             f = 1;
	             b = i+1;
	             break;
	             
	         }
	     }
	     if(f == 0)
	     cout<<"-1"<<endl;
	     else
	     cout<<a+1<<" "<<b<<endl;
	        
	 }
	return 0;
}
