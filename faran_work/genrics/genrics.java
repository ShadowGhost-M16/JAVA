public class genrics {
    public static <T extends Number> void add(T element1, T element2)
    {
      System.out.println(element1.intValue()+element2.intValue());
    }
    public static <K extends Number> void subtract(K element1, K element2)
    {
        System.out.println(element1.intValue()-element2.intValue());
    }

public static void main(String[] args)
{
add(23, 11);
subtract(23,3);

}
}
