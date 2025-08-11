graph = {
    '1': ['2', '3'],
    '2': ['4', '5'],
    '3': ['6', '7'],
    '4': ['8'],
    '5': [],
    '6': [],
    '7': [],
    '8': []
}

visited = []

def dfs(visited, graph, start):
    if start not in visited:
        print(start)
        visited.append(start) 
        for neighbor in graph[start]:
            dfs(visited, graph, neighbor)

dfs(visited, graph, '1')
