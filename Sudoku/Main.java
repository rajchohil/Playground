#include<bits/stdc++.h>
using namespace std;
int a[9][9];
bool crow(int row,int num)
{
   for(int i=0;i<9;i++)
   {
     if(a[row][i]==num)
       return true;
   }
  return false;
}
bool ccol(int col,int num)
{
  for(int i=0;i<9;i++)
  {
    if(a[i][col]==num)
      return true;
  }
return false;
}
bool box(int row,int col,int num)
{
  int r=row-row%3;
  int c=col-col%3;
  for(int i=r;i<r+3;i++)
  {
    for(int j=c;j<c+3;j++)
    {
     if(a[i][j]==num)
       return true;
    }
  }
return false;
}
bool isAllow(int row,int col,int num)
{
 return !((crow(row,num))||(ccol(col,num))||(box(row,col,num)));
}
bool solveSoduku(int a[9][9])
{
 for(int row=0;row<9;row++)
 {
   for(int col=0;col<9;col++)
   {
      if(a[row][col]==0)
      {
          for(int i=1;i<=9;i++)
          {
               if(isAllow(row,col,i))
               {
                   a[row][col]=i;
                  if(solveSoduku(a))
                  {
                   return true;
                  }
                 else
                   a[row][col]=0;
               }
          }
      return false;
      }
   }
 }
return true;
}
void print(int a[9][9])
{
 for(int i=0;i<9;i++)
 {
   for(int j=0;j<9;j++)
     cout<<a[i][j];
   cout<<"\n";
 }

}
int main()
{
   for(int i=0;i<9;i++)
   {
    for(int j=0;j<9;j++)
      cin>>a[i][j];
   }
  if(solveSoduku(a))
    print(a);
  else
    cout<<"No";
return 0;
}