#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a,b,c  =0;
	scanf("%d %d", &a , &b);
	if (2<a,b,c<=10000){
		printf("%d\n",a*(b%10));
		printf("%d\n",a*(b/10%10));
		printf("%d\n",a*(b/100));
		printf("%d\n",a*b);
		
	}
	else{
		scanf("%d %d %d", &a , &b, &c);
	}
	
	
}