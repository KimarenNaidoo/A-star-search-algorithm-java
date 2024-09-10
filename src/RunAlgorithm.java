package src;

import java.util.Stack;

class Cell
{
    int posX = 0;
    int posY = 0;
    double f, g, h = 0;
    Cell parentCell;

    public Cell(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
}

public class RunAlgorithm 
{
    public static void main(String[] args)
    {
        int[] start = new int[2];
        int[] target = new int[2];
        
        // TODO: create blocked pathways
        int[][] map = { {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};

        start[0] = 0;
        start[1] = 0;

        target[0] = 5;
        target[1] = 5;

        executeASearchAlgorithm(start, target, map);
    }

    private static void executeASearchAlgorithm(int[] start, int[] target, int[][] map)
    {
        Cell startCell = new Cell(start[0], start[1]);
        Cell targetCell = new Cell(target[0], target[1]);

        Stack<Cell> openList = new Stack<>();
        openList.push(startCell);

        if(isTargetCell(startCell, targetCell))
            System.out.println("Start and target are the same!");

        while(!openList.isEmpty())
        {

            // 1st successor - North

            // 2nd successor - South

            // 3rd successor - East 

            // 4th successor - West

            // 5th successor - North East

            // 6th successor - North West

            // 7th successor - South East
            
            // 8th successor - South West

        }
    }

    private static boolean isTargetCell(Cell currentCell, Cell targetCell)
    {
        boolean reachedTargetCell = false;

        if ((currentCell.posX == targetCell.posX) && (currentCell.posY == targetCell.posY))
            reachedTargetCell = true;

        return reachedTargetCell;
    }
}
