#include <stdio.h>
#include <stdlib.h>

char * compress(char * str) {

	int length;
	int i;

	for ( i = 0; str[i] != '\0'; i++ ) {
	}
	length = i;

	char * compressed = (char *) malloc (length * sizeof(char));

	char last = str[0];
	int size = 1;
	int new_size = 0;
	for ( i = 1; i < length; i++ ) {
		if ( last == str[i] ) {
			size++;
		} else {
			compressed[new_size] = last;
			last = str[i];
			new_size++;
			if( new_size > length-1 ) {
				return str;
			}
			compressed[new_size] = size +'0';
			size = 1;
			new_size++;
		}
	}

	if ( new_size < length -2 ) {
		compressed[new_size] = last;
		new_size++;
		compressed[new_size] = size +'0';
		new_size++;
		compressed[new_size] = '\0';
	} else {
		return str;
	}

	return compressed;

}


int main() {

	char *str = "aaaaaaxbbbccd";

	printf("%s\n", str);
	printf("%s\n", compress(str) );

	return 0;
}