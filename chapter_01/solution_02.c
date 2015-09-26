#include <stdio.h>

void reverse(char * str) {

	int i;
	char c;
	int len = strlen(str);

	for ( i=0; i < len / 2; i++ ) {
		// swap i and len-i
		c = str[i];
		str[i] = str[len-i-1];
		str[len-i-1] = c;
	}
}

int main() {

	char *str = "ABCDE";
	printf("Before: %s\n", str);
	reverse(str);
	printf("After: %s\n", str);

	return 0;
}
