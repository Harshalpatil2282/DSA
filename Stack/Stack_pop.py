class Stack:
    def __init__(self, size) :
        self.stack = []
        self.size = size
        self.top = -1 
        
        
    def isFull(self) :
        if self.top==self.size - 1 :
            return True
        else:
            return False
        
    
    def isEmpty(self):
        if self.top==-1 :
            return True
        else:
            return False
    def push(self , item):
        if self.isFull() :
            print("Stack is Full !")
        else :
            self.top += 1
            self.stack.append(item)
            print(item," pushed Into Stack")  
    def pop(self):
        if self.isEmpty():
            print("Stack is Empty !")
        else:
            self.stack[self.top]
            print(self.stack[self.top]," Pop from the Stack !")
            self.top -= 1
            
    def peek(self):
        if self.isEmpty():
            print("Stack is Empty !")
        else:
            self.temp = self.stack[self.top]
            print("Top of the stack is :",self.temp)
    def display(self):
        if self.isEmpty():
            print("Stack is Empty !")
        else:
            print("Elements of the Stack are :")
            for i in range(self.top+1):
                print(self.stack[i])
s = Stack(5)
s.push(1) 
s.push(2) 
s.push(3) 
s.push(4) 
s.push(5)
s.pop()
s.peek()
s.display() 
    
              
            
    
    
    