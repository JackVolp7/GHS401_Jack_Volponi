
public class TwoDArrays
{
    public static void main()
    {
        int[][] grid = new int[3][5];
        int[] array = new int[10];
        int count=1;
        for(int r=0; r<grid[0].length;r++)
        {
            for(int c=0; c<grid.length;c++)
            {
                grid[c][r]=count;
                count++;
            }
        }
        for(int r=0; r<grid.length;r++)
        {
            for(int c=0; c<grid[r].length;c++)
            {
                System.out.print(grid[r][c]+"\t");
            }
            System.out.println();
        }
        int rowSum=0;
        for(int r=0;r<grid.length; r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                rowSum+=grid[r][c];
            }
            System.out.println("row sum: " + rowSum);
            rowSum=0;
        }
        int columnSum=0;
        for(int r=0;r<grid[0].length; r++)
        {
            for(int c=0;c<grid.length;c++)
            {
                columnSum+=grid[c][r];
            }
            System.out.println("column sum: " + columnSum);
            columnSum=0;
        }
        for(int i=0; i<array.length;i++)
        {
            array[i]=i*2;
        }
        
        int[][] chart=new int[3][5];
        
        for(int r=0; r<chart.length;r++)
        {
            for(int c=0; c<chart[0].length;c++)
            {
                
            }
        }
    }
}
