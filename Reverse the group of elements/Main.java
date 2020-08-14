#include<bits/stdc++.h>
using namespace std;
struct node {
int data;
  struct node *next;
 // struct node *prev;
};
void append(struct node **head,int x)
{
     struct node *temp=*head;
  struct node *newnode=new node;
//  struct node *prev=NULL;
  newnode->data=x;
  newnode->next=NULL;
 // newnode->prev=NULL;
       if(*head==NULL)
         *head=newnode;
      else
      {
         while(temp->next!=NULL)
         {
         //  temp->prev=prev;
         //  prev=temp;
           temp=temp->next;
         }
        temp->next=newnode;
      }
  return;
}
node* reverses(struct node *head,int k)
{
   stack<node*> mystack; 
    struct node* current = head; 
    struct node* prev = NULL; 
  
    while (current != NULL) { 
  
        // Terminate the loop whichever comes first 
        // either current == NULL or count >= k 
        int count = 0; 
        while (current != NULL && count < k) { 
            mystack.push(current); 
            current = current->next; 
            count++; 
        } 
  
        // Now pop the elements of stack one by one 
        while (mystack.size() > 0) { 
  
            // If final list has not been started yet. 
            if (prev == NULL) { 
                prev = mystack.top(); 
                head = prev; 
                mystack.pop(); 
            } else { 
                prev->next = mystack.top(); 
                prev = prev->next; 
                mystack.pop(); 
            } 
        } 
    } 
  
    // Next of last element will point to NULL. 
    prev->next = NULL; 
  
    return head; 

}
void prints(struct node *head)
{
   struct node *temp=head;
  while(temp!=NULL)
  {
     cout<<temp->data<<"\n";
    temp=temp->next;
  }
  return ;
}
int main()
{
  int x,c=0,n;
  cin>>x;
  struct node *head=NULL;
  while(x>=0)
  {
      c++;
    append(&head,x);
    cin>>x;
  }
  cin>>n;
  if(c==0)
    cout<<"List is empty"<<"\n";
  else
  {
    head=reverses(head,n);
     prints(head);
  }
return 0;
}