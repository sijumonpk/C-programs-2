//program for adding first and third digit
#include<stdio.h>
int main()
{
  int n,s,r;
  scanf("%d",&n);
  r=n%10;//for last digit
  n=n/100;//for last digit
  s=r+n;//sum equation
  printf("%d",s);
  return 0;
}
