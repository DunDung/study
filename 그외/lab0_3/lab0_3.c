#include<stdio.h>

double area(int x, int y)
{
	return x * y / 2.0;
}

int main(void)
{	
	int x;
	int y;

	printf("lab0_3: 홍준성\n\n");

	printf("밑변 입력: ");
	scanf("%d", &x);
	printf("높이 입력: ");
	scanf("%d", &y);
	printf("면적 = %g\n", area(x, y));

	return 0;
}