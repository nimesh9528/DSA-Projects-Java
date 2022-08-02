/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class maze_Path {
    static int count=0;
    public static void main(String[] v)
    {
        printpath(0,0,2,"");
        System.out.print("\n"+count);
    }
    public static void printpath(int cr,int cc,int er,String ans)
    {
        if(cr==er && cc==er)
        {
            System.out.println(ans);
            count++;
            return;
        }
        if(cr>er || cc>er)
        {
            return;
        }
        printpath(cr+1,cc,er,ans+"H");
        printpath(cr,cc+1,er,ans+"V");
        if(cr==cc)
            printpath(cr+1,cc+1,er,ans+"D");
        }
    }


