#include <stdio.h>

int main() 
{
	int n = 365,q,r;
	q = 365 / 4;
	r = 365 % 4;
	printf("Quotient: %d\nRemainder: %d",q,r);
	return 0;
}