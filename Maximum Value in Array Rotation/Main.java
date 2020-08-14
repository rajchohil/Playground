#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
 int res = INT_MIN; 
   for (int i=0; i<n; i++) 
   { 
     int curr_sum = 0; 
     for (int j=0; j<n; j++) 
     { 
         int index = (i+j)%n; 
         curr_sum += j*a[index]; 
     } 
     res = max(res, curr_sum); 
   } 
  cout<<res;
return 0;
}