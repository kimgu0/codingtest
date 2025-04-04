#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a,b,c  =0;
	scanf("%d %d %d", &a , &b, &c);
	if (2<a,b,c<=10000){
		printf("%d\n",(a+b)%c);
		printf("%d\n",((a%c) + (b%c))%c);
		printf("%d\n",(a*b)%c);
		printf("%d\n",((a%c)*(b%c))%c);
		
	}
	else{
		scanf("%d %d %d", &a , &b, &c);
	}
	
	
}