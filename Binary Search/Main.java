#include<bits/stdc++.h>
using namespace std;
int binarySearch(int a[],int l,int h,int k)
{
   if(l<=h)
   {
      int m=(l+h)/2;
      if(a[m]==k)
       return m;
     else if(a[m]>k)
        return binarySearch(a,l,m-1,k);
      return binarySearch(a,m+1,h,k);
   }
  return -1 ;
}
int main()
{
int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int k;
  cin>>k;
   int c=binarySearch(a,0,n-1,k);
//  cout<<c<<"\n";
  if(c==-1)
  {
      cout<<"Not found";
  }
  else 
    cout<<c;
 
return 0;
}