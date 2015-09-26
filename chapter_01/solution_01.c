#include <stdio.h>


/**
* if string contains all unique characters retun 1, otherwise return 0
*/
int isUnique(char * str) {

	if (strlen(str) > 256 ) {
		return 0;
	}

	int characters[256];
	int i;

	for ( i = 0 ; i < 256 ; i++ ) {
		characters[i] = 0;
	}

	for ( i = 0; str[i] != '\0' ; i++ ) {
		if ( characters[ str[i] ] == 0 ) {
			characters[ str[i] ]++;
		} else {
			return 0;
		}
	}

	return 1;

}

int main() {

	char *str = "asdfghjkl";
	int a = isUnique(str);

	if ( a == 0 ) {
		printf("%s is not unique\n", str);
	} else {
		printf("%s is unique\n", str);
	}

	return 0;
}