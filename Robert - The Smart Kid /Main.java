#include<bits/stdc++.h>
#define int long long int
using namespace std;
int addi(int n)
{
if(n%2==0)
  return (n/2)*(n+1);
  else
    return n*((n+1)/2);

}
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int n;
  cin>>n;
  int x=addi(n);
  cout<<x;
  
return 0;
}