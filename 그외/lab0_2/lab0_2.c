#include<stdio.h>

int main(void)
{
	int i;
	int array[10];
	int sum = 0;

	printf("lab0_2: ȫ�ؼ�\n\n");
	printf("10���� ������ �Է��ϼ���: \n");

	for (i = 0; i < 10; i++)
	{
		scanf("%d", &array[i]);
		if (array[i] < 101 && array[i] > 0)
			sum += array[i];
	}

	printf("\n1~100 ���� ������ �� = %d\n", sum);

	return 0;
}