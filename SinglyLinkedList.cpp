#include<iostream>
using namespace std;
struct node{
    int data;
    node* next;
};
class LinkedList{
    node* head;
    int count;
    LinkedList(){
        head=nullptr;
        count=0;
    }
    ~LinkedList(){
        if(head==nullptr){
            delete head;
        }
        else{
            node* current=head->next;
            while(current!=nullptr){
                node* nextnode=current;
                delete nextnode;
                current=current->next;
            }
        }
    }
};
int main(){
    
}