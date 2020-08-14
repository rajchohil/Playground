#include<bits/stdc++.h>
using namespace std;
struct node {
  int data;
  struct node *next;
  struct node *prev;
};
void append(struct node **head,int x)
{
  struct node *temp=*head;
  struct node *newnode=new node;
  newnode->data=x;
  newnode->next=NULL;
  if(*head==NULL)
  {
    newnode->prev=NULL;
    *head=newnode;
  }
  else
  {
    while(temp->next!=NULL)
      temp=temp->next;
    temp->next=newnode;
    newnode->prev=temp;
    return ;
  }
}
void deletes(struct node **head)
{
    struct node *prev=NULL;
  struct node *temp=*head;
  while(temp->next->next!=NULL)
  {
       prev=temp;
    temp=temp->next;
  }
  prev->next=temp->next;
  temp->next->prev=prev;
  return;
}
void prints(struct node **head)
{
  struct node *temp=*head;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
  return ;
}
int main()
{
  int x,c=0;
  struct node *head=NULL;
 cin>>x;
  while(x>=0)
  {
     append(&head,x);
    cin>>x;
    c++;
  }
  if(c<=1)
    cout<<"Deletion of second last element is not possible";
  else
  {
   deletes(&head);
   prints(&head);
  }
    
  
return 0;
}