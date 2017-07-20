package main.test;

import java.util.Vector;

public class Test
{

    /**
     * @Title: main
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @author Dangzhang
     * @param args
     * @throws
     */
    public static void main(String[] args)
    {
        Vector v = new Vector(4); 
        int i = 0 ; 
        while(i++ < 100){
            v.add(i);
        }
        for(Object i1 : v){
            System.out.println(i1.toString());
        }
        
    }

}
