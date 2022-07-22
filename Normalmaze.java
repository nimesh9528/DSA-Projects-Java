/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
//no of waays
public class Normalmaze {
    public static void main(String[] v)
    {
        boolean[][] maze=new boolean[23][12];
        System.out.print(print(maze,0,0));
    }
    public static int print(boolean[][] board,int cr,int cc)
    {
        if(cr== board.length-1 && cc==board[0].length-1)
            return 1;
        if(cr<0 ||cr>=board.length ||cc<0 || cc>=board[0].length || board[cr][cc])
            return 0;
        
        int []r={0,1};
        int []c={1,0};        
        int ans=0;
        board[cr][cc]=true;
        for(int i=0;i<r.length;i++){
        ans+= print(board,cr+r[i],cc+c[i]);   
        }
        board[cr][cc]=false;
        return ans;
    }
}
