#include <stdio.h>
int fact(int n)
{
    int f;
    if(n>=1)
    {f=n*fact(n-1);
    return f;}
    else return 1;
}
int main()
{
    int n,fa;
    scanf("%d", &n);
    fa=fact(n);
    printf("%d",fa);
    return 0;
}
