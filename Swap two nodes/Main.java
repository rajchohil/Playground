#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
  struct node *next;
};
void append(struct node **head,int x)
{
   struct node *temp=*head;
  struct node *newnode= new node;
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
  return ;
}
void swaps(struct node **head_ref,int x,int y)
{
  if (x == y) return;  
  
// Search for x (keep track of prevX and CurrX  
node *prevX = NULL, *currX = *head_ref;  
while (currX && currX->data != x)  
{  
    prevX = currX;  
    currX = currX->next;  
}  
  
// Search for y (keep track of prevY and CurrY  
node *prevY = NULL, *currY = *head_ref;  
while (currY && currY->data != y)  
{  
    prevY = currY;  
    currY = currY->next;  
}  
  
// If either x or y is not present, nothing to do  
if (currX == NULL || currY == NULL)  
    return;  
  
// If x is not head of linked list  
if (prevX != NULL)  
    prevX->next = currY;  
else // Else make y as new head  
    *head_ref = currY;  
  
// If y is not head of linked list  
if (prevY != NULL)  
    prevY->next = currX;  
else // Else make x as new head  
    *head_ref = currX;  
  
// Swap next pointers  
node *temp = currY->next;  
currY->next = currX->next;  
currX->next = temp; 
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
  int n,x,p,q;
  cin>>n;
  struct node *head=NULL;
  while(n>0)
  {
    cin>>x;
    append(&head,x);
    n--;
  }
  cin>>p>>q;
 swaps(&head,p,q);
  prints(&head);
return 0;
}