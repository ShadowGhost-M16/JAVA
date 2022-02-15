package faran_work.vectors;

import java.util.Vector;

public class vectors {
    public static void main(String[] args)
    {
       Vector<Integer> v = new Vector<Integer>();
       v.add(3);
       v.add(2);
       v.add(1);
        System.out.println(v.size());
        System.out.println(v);
        v.remove(1);
        System.out.println(v.size());
        System.out.println(v);
    }
}
