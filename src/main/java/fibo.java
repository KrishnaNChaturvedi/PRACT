public class fibo
{
    static int a=0,b=1,c=1;
    public static void main(String args[]){
        for(int i=0; i<15; i++){
            System.out.println("Iteration-"+i +"value-"+a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
