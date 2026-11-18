 Assignment 3: Directory Graph

1. BFS (Breadth-First Search)

BFS visits folders level by level, from left to right.

Traversal Order:

C: → Users → Program Files → Imtiyaz → Public → Java → Documents → Downloads

2. DFS (Depth-First Search)

DFS explores as deep as possible before backtracking.

Traversal Order:

C: → Users → Imtiyaz → Documents → Downloads → Java → Public → Program Files

 3. Importance of Visited Check

Java is reachable from two places:
- Program Files → Java
- Downloads → Java (shortcut)

Without a visited check, Java could be visited more than once, causing duplicate processing. If cycles exist, traversal could continue indefinitely.

A visited check ensures that each folder is visited only once.