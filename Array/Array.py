size = int(input('Enter the size of the array : '))
arr = []
print("Enter "+ str(size) + " elements of the array :")
for i in range(size):
    item = int(input("Enter the"+str(i+1)+ "element :"))
    arr.append(item)
        
print("Array is :",arr)