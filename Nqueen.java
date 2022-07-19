
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class Nqueen {
    static int count=0;
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] board=new boolean[n][n];
        nqueen(board,n,0);
//        if(count==0)
            System.out.println("\n"+count);
    }
    public static void nqueen(boolean[][] b,int tq,int row)
    {
        if(tq==0)
        {
            display(b);
            count++;
            return;
        }
        
        if(row>=b.length)
            return;
        for(int col=0;col<b.length;col++)
        {
            if(itsPoss(b,row,col))
            {
                b[row][col]=true;
                nqueen(b,tq-1,row+1);
                b[row][col]=false;
            }
           
        }
    }
    public static boolean itsPoss(boolean[][] b,int row,int col)
    {
        int r=row;
        while(r>=0)
        {
            if(b[r][col])
            {
                return false;
            }
            r--;
        }
        r=row;
        int c=col;
        while(r>=0&& c<b.length)
        {
            if(b[r][c])
            {
                return false;
            }
            r--;
            c++;
        }
        r=row;
        c=col;
        while(r>=0&& c>=0)
        {
            if(b[r][c])
            {
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
    public static void display(boolean[][] b)
    {
        List <String> list=new ArrayList<>();
        List <List<String>> ans=new ArrayList<>();
        for (int i=0;i<b.length;i++) {
            for (int j = 0; j<b.length; j++) {
               if(b[i][j]!=true)
               {
                  list.add(".");
                               }
               else
                   list.add("Q");
            }
            
           ans.add(list);
        }
        
    }
}
