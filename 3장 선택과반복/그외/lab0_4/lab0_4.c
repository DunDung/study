#include<stdio.h>

int main(void)
{
	double array[12] = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5};
	int month;

	printf("lab0_4: ȫ�ؼ�\n\n");

	printf("��(1~12)�� �Է��ϼ���: ");
	scanf_s("%d", &month);

	printf("%d���� ��ձ�� = %.1f \n", month, array[month-1]);
	
	return 0;
}