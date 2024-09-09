# A-star-search-algorithm-java

### Algorithm
- Initialize an open list.

- Initialize a closed list:
    - Ammend the starting cell to the open list.(f value can be left at zero).

- While the open list is not empty:
    - Find the cell with the least f on the open list, call this cell q.
    - Pop q off the open list.
    - Generate q's 8 successors and set their parent Cell to q.
    - For each successor:
        - If the successor is the target cell, then stop the search.
        - If it is not the target cell, compute both g and h for the successor:
            - successor.g = q.g + distance between the successor and q.
            - successor.h = distance from the target cell to the successor. (We are going to use a heuristic - Euclidean Heuristic)
            - successor.f = successor.g + successor.h
        - If a cell with the same position as the successor is in the open list which has a lower f than the successor cell, then we can skip this successor.
        - If a cell with the same position as the successor is in the closed list which has a lower f than the successor cell, then we can skip this successor, else we can add the cell to the open list.
    - Push q to the closed list

