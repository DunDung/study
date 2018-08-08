#include<stdio.h>

int main(void)
{
	int i;
	int array[10];
	int sum = 0;

	printf("lab0_2: 홍준성\n\n");
	printf("10개의 정수를 입력하세요: \n");

	for (i = 0; i < 10; i++)
	{
		scanf("%d", &array[i]);
		if (array[i] < 101 && array[i] > 0)
			sum += array[i];
	}

	printf("\n1~100 범위 값들의 합 = %d\n", sum);

	return 0;
}