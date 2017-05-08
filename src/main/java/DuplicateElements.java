import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		findDuplicateNumber();
	}
	
	public static void findDuplicateNumber() {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 8, 8, 9, 10, 12, 12, 18 };
		System.out.println("Origianl Array = " + Arrays.toString(array));

		for (int i = 0; i <= array.length - 2; i++) {
			if (array[i] == array[i + 1]) {
				System.out.print(array[i] + ",");
				i = i + 1;
			}

		}
	}
}
