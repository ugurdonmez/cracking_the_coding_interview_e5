#include <stdio.h>

void replaceSpaces(char * str) {

	int i;
	int length=0;
	int spaces=0;

	for ( i = 0; str[i] != '\0'; i++ ) {
		length++;
		if ( str[i] == ' ' ) {
			spaces++;
		}
	}

	int newLength = spaces * 2 + length;

	str[newLength] = '\0';
	newLength--;

	for ( i = length - 1; i >= 0; i-- ) {
		if ( str[i] != ' ' ) {
			str[newLength] = str[i];
			newLength--;
		} else {
			str[newLength] = '0';
			newLength--;
			str[newLength] = '2';
			newLength--;
			str[newLength] = '%';
			newLength--;
		}
	}

}

int main() {

	char str[80] = "ab  c";

	printf("Before: %s\n", str);
	replaceSpaces(str);
	printf("After:  %s\n", str);

	return 0;
}