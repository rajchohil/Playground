#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
  struct node *next;
};
void append(struct node **head,int x)
{
  struct node *temp=*head;
  struct node *newnode=new node;
  newnode->data=x;
  newnode->next=NULL;
  int f=0;
  if(*head==NULL)
    *head=newnode;
  else{
        while(temp->next!=NULL)
        {
           if(temp->data==x)
             f=1;
          temp=temp->next;
        }
    if(f==0&&temp->data!=x)
    {
      temp->next=newnode;
    }
      
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
  struct node *head=NULL;
  int c=0,x;
  cin>>x;
  while(x>=0)
  {
     c++;
    append(&head,x);
    cin>>x;
  }
  if(c==0)
    cout<<"List is empty";
  else
    prints(&head);
return 0;
  
}