package chapter02;

public class ArrayUtils {

	public static double[] intToDouble(int[] arrayInt) {
		if (arrayInt == null) {
			return null;
		}
		int length = arrayInt.length;
		double[] arrayDouble = new double[length];
		for (int i = 0; i < length; i++) {
			arrayDouble[i] = arrayInt[i];
		}
		return arrayDouble;
	}

	public static int[] DoubleToInt(double[] arrayDouble) {
		if (arrayDouble == null) {
			return null;
		}
		int length = arrayDouble.length;
		int[] arrayInt = new int[length];

		for (int i = 0; i < length; i++) {
			arrayInt[i] = (int) arrayDouble[i];
		}
		return arrayInt;
	}

	public static double[] concat(int[] arrayInt, double[] arrayDouble) {
		if (arrayInt == null || arrayDouble == null) {
			return null;
		}

		int length = arrayInt.length + arrayDouble.length;
		int lengthInt = arrayInt.length;
		int lengthDouble = arrayDouble.length;
		int i = 0;
		double[] concat = new double[length];

		for (i = 0; i < lengthInt; i++) {
			concat[i] = (double) arrayInt[i];
		}
		i = i -1;
		for (int j = 0; j < lengthDouble; j++) {
			i++;
			concat[i] = arrayDouble[j];
		}

		return concat;
	}

}
