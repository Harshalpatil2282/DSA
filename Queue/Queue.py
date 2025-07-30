class Queue:
    def __init__(self,size):
         self.queue = []
         self.front = -1
         self.rear = -1
         self.size = size
    def Enqueue(self,item):
        if self.rear == self.size - 1 :
            print("Queue is full !")
            return
        if self.front == -1 and self.rear== -1:
            self.front = self.rear = 0
        else :
            self.rear += 1
        
        self.queue.append(item)
        print(f"{item} Enqueue into the Queue !")
    
    def dequeue(self):
        if self.front == -1 or self.front>self.rear :
            print("Queue is Empty !")
        else:
            self.temp = self.queue[self.front]
            print (self.temp," Dequeue from queue")
            self.front += 1
            
    def display(self):
        if self.front == -1 or self.front>self.rear:
            print("Queue is Empty!")
        else:        
            print("Queue :")
            for i in range(self.front,self.rear + 1):
                print(self.queue[i])
                
q = Queue(5)
q.display()

q.Enqueue(4)
q.Enqueue(3)
q.Enqueue(2)
q.Enqueue(1)
q.Enqueue(6)
q.Enqueue(7)
q.display()
q.dequeue()
q.display()