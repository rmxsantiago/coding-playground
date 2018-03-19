import java.lang.*;



public class HelloWorld {
	public static void main(String[] args){

	}

	public int[] arrayLeftRotation(int[] array, int arraySize, int rotations) {
		if(array == null){
			return new int[0];
		}

		int[] result = new int[arraySize];

		int[] head = new int[rotations];
		for (int i = 0; i < rotations ; i++ ) {
			head[i] = array[i];
		}

		for (int i = rotations ; i < arraySize ; i++) {
			result[i-rotations] = array[i];
		}

		for (int i = arraySize - rotations, j = 0; i < arraySize ; i++, j++ ) {
			result[i] = head[j];
		}

		return result;
	}
}
