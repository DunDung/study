#include<stdio.h>

int main(void)
{
	double array[12] = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5};
	int month;

	printf("lab0_4: 홍준성\n\n");

	printf("월(1~12)을 입력하세요: ");
	scanf_s("%d", &month);

	printf("%d월의 평균기온 = %.1f \n", month, array[month-1]);
	
	return 0;
}