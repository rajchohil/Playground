#include<bits/stdc++.h>
using namespace std;
int main()
{ 
  int n;
  cin>>n;
  int a[9]={1,2,5,10,20,50,100,500,1000};
  for(int i=8;i>=0;i--)
  {
     while(n>=a[i])
     {
       n=n-a[i];
       cout<<a[i]<<"  ";
     }
  }
  
return 0;
}
