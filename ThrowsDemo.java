class Arithmatic
{
    public int Division(int A, int B) throws ArithmaticException
    {
        int Ans = 0;
        Ans = A/B;
        return Ans;
    }
}
class ThrowsDemo
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter the first number");
       int iNo1 = sobj.nextInt();
       System.out.println("Enter the second number");
       int iNo2 = sobj.nextInt();

       Arithmatic aobj = new Arithmatic();

       try
       {
        int Ret = aobj.Division(iNo1,iNo2);
        System.out.println("division is :"+Ret);

       }
       catch(ArithmaticException obj)
       {
        System.out.println("Exception occured");
        System.out.println(obj);
       }
     }
}