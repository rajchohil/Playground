#include<bits/stdc++.h>
using namespace std;
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
 
return ;
}
int lca(struct node *head,int m,int n)
{
  if(head==NULL)
    return -1;
  else if(head->data>n&&head->data>m)
    return lca(head->left,m,n);
   else if(head->data<n&&head->data<m)
    return lca(head->right,m,n);
  else return head->data;
}int ans=0;
void inorder(struct node *head,int n,int m)
{
  if(head==NULL)
    return;
  inorder(head->left,n,m);
  if(head->data==n)
    ans++;
  if(head->data==m)
    ans++;
  inorder(head->right,n,m);
  return;
}
int main()
{
 int c,x;
  cin>>c;
  struct node *head=NULL;
  while(c)
  {
    cin>>x;
    append(&head,x);
  c--;
  }
  int m,n;
  cin>>m>>n;
  inorder(head,n,m);
  if(ans==2)
  cout<<lca(head,m,n);
  else
    cout<<-1;
return 0;
}