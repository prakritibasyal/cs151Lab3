public class DumpArray
{

    public static void dumpArray(Object[] objects)
    {
        for(int i = 0; i < objects.length; i++)
        {
            System.out.println(objects[i].toString());
        }
    }

    public static void main(String[] args)
    {
        Object[] objects = {"Hello", 5, "Hi",10.0,5,"World"};
        dumpArray(objects);
    }

}