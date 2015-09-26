#include <stdio.h>

int isPermutation(char * str1, char * str2) {

	int len1, len2, i;

	// check their length
	for( i = 0; str1[i] != '\0'; i++ ) {
	}
	len1 = i;

	for( i = 0; str2[i] != '\0'; i++ ) {
	}
	len2 = i;

	// if lengths are not equal, return 0
	if (len1 != len2) {
		return 0;
	}

	// count each characters
	int char1[256];
	int char2[256];

	for(i = 0; i < 256 ; i++ ) {
		char1[i] = char2[i] = 0;
	}

	for( i = 0; i < len1; i++ ) {
		char1[str1[i]]++;
		char2[str2[i]]++;
	}

	// check characters
	for(i = 0; i < 256 ; i++ ) {
		if (char1[i] != char2[i]) {
			return 0;
		}
	}

	return 1;
}

int main() {

	char * str1 = "asdfg";
	char * str2 = "fgdsa";
	char * str3 = "qwert";

	if ( isPermutation(str1, str2) ) {
		printf("%s and %s permutations\n", str1, str2 );
	} else {
		printf("%s and %s is not permutations\n", str1, str2 );
	}

	if ( isPermutation(str1, str3) ) {
		printf("%s and %s are permutation of each other\n", str1, str3 );
	} else {
		printf("%s and %s are not permutation of each other\n", str1, str3 );
	}

	return 0;
}