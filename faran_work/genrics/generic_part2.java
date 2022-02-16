public class generic_part2 < X,Y> {

    X obj1;
    Y obj2;
    
    public generic_part2 (X obj1,Y obj2) 
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void Print ()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main (String[] args)
    {
        generic_part2<Integer, String> obj3 = new  generic_part2<Integer, String>(20, "Shazib");
        obj3.Print();
    }
}