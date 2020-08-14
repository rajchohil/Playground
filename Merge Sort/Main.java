#include<bits/stdc++.h>
using namespace std;
void Sort(int a[],int l,int m,int h)
{
   int i,j,k;
  int n1=m-l+1;
  int n2=h-m;
  int x[n1];
  int y[n2];
  for(i=0;i<n1;i++)
    x[i]=a[i+l];
  for(j=0;j<n2;j++)
    y[j]=a[m+1+j];
  i=0;
  j=0;
  k=l;
  while(i<n1&&j<n2)
  {
      if(x[i]<=y[j])
      {
        a[k]=x[i];
        i++;
      }
    else
    {
       a[k]=y[j];
      j++;
    }
    k++;
  }
  while(i<n1)
  {
    a[k]=x[i];
    k++;
    i++;
  }
  while(j<n2)
  {
     a[k]=y[j];
    k++;
    j++;
  }
 // return 0;
}
void merge(int a[],int l,int h)
{
   if(l<h)
   {
     int m=(l+h)/2;
      merge(a,l,m);
     merge(a,m+1,h);
      Sort(a,l,m,h);
   }
//return 0;
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Before Sort:"<<"\n";
  for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
  cout<<"\n";
    cout<<"After Sort:"<<"\n";
  merge(a,0,n-1);
   for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
  cout<<"\n";
  
return 0;
}