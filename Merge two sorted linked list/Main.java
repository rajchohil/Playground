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
  return ;
}
node* tmerge(node* a,node* b)
{
  node* result=NULL;
  if(a==NULL)
    return (b);
  else if(b==NULL)
    return (a);
  if(a->data<=b->data)
  {
    result=a;
    result->next=tmerge(a->next,b);
  }
  else
  {
      result=b;
    result->next=tmerge(a,b->next);
  }
            return  (result);
}
void prints(struct node **head)
{
  struct node *temp=*head;
  while(temp!=NULL)
  {
     cout<<temp->data<<"->";
    temp=temp->next;
  }
  cout<<"NULL";
}
int main()
{
  int n,m,x;
  struct node *head1=NULL;
  struct node *head2=NULL;
  cin>>n;
  for(int i=0;i<n;i++){
  cin>>x;
    append(&head1,x);
  }
  cin>>m;
  for(int i=0;i<m;i++)
  {
    cin>>x;
    append(&head2,x);
  }
    struct node *msort=tmerge(head1,head2);
  prints(&msort);
   return 0;
}