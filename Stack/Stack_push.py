class Stack:
    def __init__(self , capacity):
        self.stack = []
        self.capacity = capacity
        self.top = -1
    def is_full(self):
        if self.top == self.capacity - 1:
            return True
        else:
            return False
    def is_Empty(self):
        if self.top == -1:
            return True
        else:
            return False
    def push(self , item):
        if self.is_full():
            print("Stack is full")
        else:
            self.top += 1
            self.stack.append(item)
            print("Item pushed to stack")
    def pop(self):
        if self.is_Empty():
            print("Stack is Empty ")
        else:
            temp = self.stack[self.top]
            
            print(f"{temp} is Pop from stack")
            self.top -= 1 
            
            
    
    def display(self):
        if self.top == -1:
            print("Stack is Empty")
        else:
            print("Elemnt of the Stack is :")
            for i in range(self.top+1):
                print(self.stack[i]," ")
s = Stack(5)
s.push(4) 
s.push(3) 
s.push(5) 
s.push(2) 
s.push(9) 
s.push(2) 
s.push(4) 
s.display()
s.pop()
s.display()