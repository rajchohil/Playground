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
   queue<node *> q;
   q.push(temp);
   while(!q.empty())
   {
     struct node *te=q.front();
     q.pop();
       if(te->left==NULL)
       {
          te->left=newnode;
         break;
       }
     else
       q.push(te->left);
     if(te->right==NULL)
     {
       te->right=newnode;
       break;
     }
     else
       q.push(te->right);
   
   }
 }
  return;
}
int ans=0;
void sum(struct node *head)
{
  if(head==NULL)
    return ;
  ans+=head->data;
  sum(head->left);
  sum(head->right);
}
int main()
{
  struct node *head=NULL;
  int x;
 cin>>x;
  while(x>0)
  {
    append(&head,x);
    cin>>x;
  }
  cout<<"Sum of all nodes are ";
  sum(head);
  cout<<ans;
return 0;
}
