#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
  struct node *left;
  struct node *right;
};
int sum=0;
void appends(struct node **head,int x)
{
   struct node *newnode =new node;
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
void sumleaf(struct node *head)
{
   if(head==NULL)
     return ;
  if(head->left==NULL&&head->right==NULL)
  {
     sum+=head->data;
    return ;
  }
  sumleaf(head->left);
  sumleaf(head->right);
return ;
}
int main()
{
  struct node *head=NULL;
  int x,c=0;
  cin>>x;
  while(x>0)
  {
    appends(&head,x);
    c++;
  cin>>x;
  }
  if(c==0)
   cout<<"Sum of all leaf nodes are"<<" "<<0;
  else
  {
    sumleaf(head);
    cout<<"Sum of all leaf nodes are"<<" "<<sum;
  }
  return 0;
}