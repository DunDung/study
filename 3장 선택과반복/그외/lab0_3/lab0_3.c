#include<stdio.h>

double area(int x, int y)
{
	return x * y / 2.0;
}

int main(void)
{	
	int x;
	int y;

	printf("lab0_3: ȫ�ؼ�\n\n");

	printf("�غ� �Է�: ");
	scanf("%d", &x);
	printf("���� �Է�: ");
	scanf("%d", &y);
	printf("���� = %g\n", area(x, y));

	return 0;
}