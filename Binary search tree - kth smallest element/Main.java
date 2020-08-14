#include<bits/stdc++.h>
using namespace std;
vector<int> v;
struct node{
int data;
  struct node *left;
  struct node *right;
};
void append(struct node **head,int x)
{
  struct node *newnode=new node;
  newnode->data=x;
  newnode->left=NULL;
  newnode->right=NULL;
  if(*head==NULL)
    *head=newnode;
  else
  {
     struct node *temp=*head;
    while(1)
    {
    if(temp->data>x)
    {
      if(temp->left==NULL)
      {
         temp->left=newnode;
        return;
      }
      temp=temp->left;
    }
    else
    {
       if(temp->right==NULL)
       {
          temp->right=newnode;
         return;
       }
        temp=temp->right;
    }
    }
  }
  return;
}
void inorder(struct node *head)
{
   if(head==NULL)
     return;
  inorder(head->left);
 // cout<<head->data<<" ";
  v.push_back(head->data);
  inorder(head->right);
  return;
}
int main()
{
  int c,n,k;
  struct node *head=NULL;
  cin>>n;
  while(n>0)
  {
    c++;
   // cout<<n<<" ";
    append(&head,n);
    cin>>n;
  }
  cout<<"Enter the kth value:"<<"\n";
  cin>>k;
 // cout<<k;
  cout<<"Smallest kth value"<<" ";
  inorder(head);
  cout<<v[k-1];
 // for(auto it=v.begin();it!=v.end();it++)
return 0;
}