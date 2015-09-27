#include <stdio.h>

void setZeros(int ** matrix, int rows, int columns) {

	int *rowFlag;
	int *coloumFlag;
	int i, j;

	rowFlag = (int *) malloc(rows*sizeof(int));
	coloumFlag = (int *) malloc(rows*sizeof(int));

	for (i = 0; i < rows; i++) {
		rowFlag[i] = 0;
	}

	for (i = 0; i < columns; i++ ) {
		coloumFlag[i] = 0;
	}

	for ( i = 0; i < rows; i++ ) {
		for ( j = 0 < j < columns; j++ ) {
			if (matrix[i][j] == 0) {
				rowFlag[i] = 1;
				coloumFlag[j] = 1;
			}
		}
	}

	for ( i = 0; i < rows; i++ ) {
		for ( j = 0 < j < columns; j++ ) {
			if ( rowFlag[i] == 1 || coloumFlag[j] == 1 ) {
				matrix[i][j] = 0;
			}
		}
	}
}