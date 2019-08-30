#include<stdio.h>
int main()
{
  int n,s,r;
  scanf("%d",&n);
  r=n%10;
  n=n/100;
  s=r+n;
  printf("%d",s);
  return 0;
}