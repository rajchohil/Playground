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
     {
         temp=temp->next;
     }
    temp->next=newnode;
  }
  return;
}
void dupli(struct node **head)
{
  struct node *curr=*head;
  struct node *nex=NULL;
  struct node *prev=NULL;
  map<int,int> m;
  while(curr!=NULL)
  {
 //   nex=curr->next;
   // curr=curr->next;
  //  auto it=m[curr->data];
      if(m[curr->data]==0)
      {
        m[curr->data]++;
        prev=curr;
      }
    else
    {
        prev->next=curr->next;
    }
    curr=curr->next;  
  }
  return ;
}
void prints(struct node **head)
{
   struct node *temp=*head;
  while(temp!=NULL)
  {
    cout<<temp->data<<"\n";
    temp=temp->next;
  }
  return;
}
int main()
{
  struct node *head=NULL;
  int x,c;
  cin>>x;
  while(x>=0)
  {
     c++;
    append(&head,x);
    cin>>x;
  }
  if(c==0)
  {
    cout<<"Linked list before removal of duplicates"<<"\n";
cout<<"Linked list after removal of duplicates"<<"\n";
  }
  else
  {
       cout<<"Linked list before removal of duplicates"<<"\n";
    prints(&head);
    cout<<"Linked list after removal of duplicates"<<"\n";
    dupli(&head);
     prints(&head);
  }
return 0;
}