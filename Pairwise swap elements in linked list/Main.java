#include<bits/stdc++.h>
using namespace std;
struct node {
int data;
  struct node *next;
};
void append(struct node **head,int x)
{
     struct node *temp=*head;
  struct node *newnode=new node;
  newnode->data=x;
  newnode->next=NULL;
       if(*head==NULL)
         *head=newnode;
      else
      {
         while(temp->next!=NULL)
           temp=temp->next;
        temp->next=newnode;
      }
  return;
}
node *swaps(node *a,node *b)
{
   node *temp=a;
  a=b;
  b=a;
}
void pairs(struct node **head)
{
  struct node *temp=*head;
  struct node *prev=NULL;
 while(temp!=NULL&&temp->next!=NULL)
 {
    swap(temp->data,(temp->next->data));
      temp=temp->next->next;
 }
return;
}
void prints(struct node **head)
{
   struct node *temp=*head;
  while(temp!=NULL)
  {
     cout<<temp->data<<"\n";
    temp=temp->next;
  }
  return ;
}
int main()
{
  int x,c=0;
  cin>>x;
  struct node *head=NULL;
  while(x>=0)
  {
      c++;
    append(&head,x);
    cin>>x;
  }
  if(c==0)
    cout<<"List is empty"<<"\n";
  else
  {
    pairs(&head);
     prints(&head);
  }
return 0;
}