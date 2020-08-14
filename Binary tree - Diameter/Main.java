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
//int ans=0;
int diamete(struct node *head,int& ans)
{
     if(head==NULL)
       return 0;
  int ld=diamete(head->left,ans);
  int rd=diamete(head->right,ans);
  ans=max(ans,1+ld+rd);
  
  return 1+max(ld,rd);   
}
int diameter(struct node *head)
{
  if(head==NULL)
    return 0;
  int ans=INT_MIN;
  int dia=diamete(head,ans);
  return ans;
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
  cout<<"Diameter of the given binary tree is ";
  cout<<diameter(head);
return 0;
}
