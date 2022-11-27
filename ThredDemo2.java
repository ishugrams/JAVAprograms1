class Demo implements Runnable
{
    public void run()
    {
        int i = 0;
        for(i = 1; i < 10;i++)
        {
            System.out.println(i);
        }
    }
}
class ThredDemo2
{
    public static void main(String a[])
    {
        System.out.println("Inside the main Thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}