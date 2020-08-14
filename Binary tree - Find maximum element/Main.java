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
            return ;
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
vector<int> v;
void inorder(struct node *head)
{
   if(head==NULL)
     return;
  inorder(head->left);
  v.push_back(head->data);
  inorder(head->right);
 // cout<<head->data;
  return;
}
int main()
{
  int n;
  struct node *head=NULL;
  cin>>n;
  while(n>0)
  {
    append(&head,n);
    cin>>n;
  }
  cout<<"Maximum element is ";
   inorder(head);
  auto it=v.end()-1;
  cout<<*it;
return 0;
}