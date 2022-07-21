/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class TowerOfHanoi {
    static int count=0;
    public static void main(String[] v)
    {
        toh(2,"T1","T2","T3");
        System.out.print(count);
    }
    public static void toh(int n,String src,String des,String hel)
    {
        if(n==0)
        {
            
            return;
        }
        toh(n-1,src,hel,des);
        System.out.println(n+"th disc move from "+src+" to "+des);
        count++;
        toh(n-1,hel,des,src);
    }
}
