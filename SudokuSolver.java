/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class SudokuSolver {
    public static void main(String[] v)
    {
        int [][] grid={ {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
         {0, 0, 5, 2, 0, 6, 3, 0, 0} }; 
        sudoku(grid,0,0);
    }   
    //Sudoku function the solve Sudoku
    public static void sudoku(int[][] grid,int row,int col)
    {
        if(col==9)
        {
            row++;
            col=0;
        }
        if(row>=9)
        {
            display(grid);
            return;
        }
        
        if(grid[row][col]!=0)
        {
            sudoku(grid,row,col+1);
        }
        else
        {
            for(int i=1;i<10;i++)
            {          
                if(itsPossible(grid,row,col,i))
                {
                    grid[row][col]=i;
                    sudoku(grid,row,col+1);
                    grid[row][col]=0;
                }
            }
        }
    }
    //Check if the number can be placed or not
    public static boolean itsPossible(int[][] grid,int cr,int cc,int val)
    {
        //column 
        int r=0;
        while(r<9)
        {
            if(grid[r][cc]==val)
            {
                return false;
            }
            r++;
        }
        //row
        int c=0;
        while(c<9)
        {
            if(grid[cr][c]==val)
            {
                return false;
            }
            c++;
        }
        //3*3
        r=cr-cr%3;
        c=cc-cc%3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(grid[i][j]==val)
                    return false;
            }
        }
        return true;
    }
    //TO Display the grid 
    public static void display(int[][] grid)
    {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
