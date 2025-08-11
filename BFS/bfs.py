# graph = {
#     's' : ['a','b'],
#     'a' : ['c','d'],
#     'c' : ['e','f'],
#     'e' : ['k'],
#     'f' : [],
#     'd' : [],
#     'b' : ['g','h'],
#     'g' : ['i'],
#     'h' : [],
#     'i' : [],
#     'k' : []    
    
# }
visited = []
queue = []

def bfs(visited,graph,rootNode):
    queue.append(rootNode)
    visited.append(graph[rootNode])
    
    while queue:
        n = queue.pop(0)
        print(n,end="-> ")
        for neighour in graph[n]:
            
            if neighour not in visited:
                visited.append(neighour)
                queue.append(neighour)
        

graph = {}

nodes = int(input("Enter the total nodes :"))

print("\nEnter adjacency list for each node (space-separated neighbors)")
print("Example: For node 0 -> enter: 1 2 (or press Enter if no neighbors)")

for i in range(nodes):
    neighbors = input(f"Enter neighbors of Node {i}: ").strip()
    if neighbors:
        graph[i] = list(map(int,neighbors.split())) 
    else:
        graph[i] = []
        
        
start = int(input("Enter start node :"))
bfs(visited,graph, start)
    
                
        
    