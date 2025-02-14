public class changeVar
{
    static int A=10, B=20;
    public static void main (String args[])
    {
        System.out.println("Initial Values " +A +" " +B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("Values " +A +" " +B);

    }

}
