#include <stdio.h>
int main(){
  	int n;
  scanf("%d",&n);
  for(int cr=1;cr<=n;cr++){
    for(int cc=1;cc<=cr;cc++)
    {
      printf("%d",cr);
    }
    printf("\n");
   }
	return 0;
}