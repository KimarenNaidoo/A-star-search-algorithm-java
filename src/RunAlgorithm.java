package src;

class Cell
{
    int posX = 0;
    int posY = 0;

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
    }
}
