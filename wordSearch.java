/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class wordSearch {
    public static void main(String[] v)
    {
    char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    String tar="ABCCED";
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[0].length;j++)
        {
            boolean ans=search(board,tar,i,j,0);
            if(ans)
            {
                System.out.print("true");
            }
        }
        
    }
    System.out.print("flase");
    
    }
    public static boolean search(char[][] b,String s,int cr,int cc,int idx)
    {
        if(idx==s.length())
        {
            return true;
        }
        if(cr<0|| cr>=b.length|| cc<0|| cc>=b[0].length|| b[cr][cc]!=s.charAt(idx))
            return false;
        int[] r={-1,0,1,0};
        int[] c={0,1,0,-1};
        b[cr][cc]='*';
        for(int i=0;i<r.length;i++){
            boolean ans=search(b,s,cr+r[i],cc+c[i],idx+1);
            if(ans)
                return true;
            
        }
        b[cr][cc]=s.charAt(idx);
        return false;
    }
}
