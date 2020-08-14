#include<bits/stdc++.h>
using namespace std;
int main(){
  int n;
  cin>>n;
  int *a=(int *)malloc(n*sizeof(int));
   for(int i=0;i<n;i++)
     cin>>*(a+i);
   int m=0,f=0;
    for(int i=0;i<n;i++)
                       {
                       if((*(a+i))%2==0)
                         f++;
                         else
                           m++;
                       }
                       cout<<m<<"\n";
                       cout<<f;
  return 0;
}