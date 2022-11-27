#include<stdio.h>

int Addition(int No1, int No2)
{
    int Ans = 0;

    printf("inside addition\n");

    Ans = No1 + No2;
    return Ans;
}
int main()
{
    int A = 11;
    int B = 10;
    int Ret = 0;

    printf("Inside main\n");

    Ret = Addition(A,B);

    printf("addition is : %d\n",Ret);
    return 0;
}