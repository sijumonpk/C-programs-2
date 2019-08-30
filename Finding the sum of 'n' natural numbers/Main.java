#include <stdio.h>
int sumofnumber(int n)
{
int sum=n*((n+1)/2);
return sum;
}
int main()
{
  int n,result;
  scanf("%d",&n);
  result=sumofnumber(n);
  printf("%d",result);
  return 0;
}