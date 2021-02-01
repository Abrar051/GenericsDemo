class Container <T>
{
    T value;
    public void show ()
    {
        System.out.println(value.getClass().getName());
    }
}
public class GenericDemo {
    public static void main (String args[])
    {
        //System.out.println("");
        Container <Integer> obj = new Container<>();
        obj.value=9;
        obj.show();
    }
}
