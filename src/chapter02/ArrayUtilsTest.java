package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] arrayInt = { 10, 20, 30, 40, 50 };

		// 1. ArrayUtils.intToDouble(..) 테스트
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for (double d : arrayDouble) {
			System.out.println(d);
		}

		// 2. ArrayUtils.doubleToInt(..) 테스트
		arrayInt = ArrayUtils.DoubleToInt(arrayDouble);
		for (int i : arrayInt) {
			System.out.println(i);
		}

		// 3. ArrayUtils.concat(..) 테스트
		double[] arrayConcat = ArrayUtils.concat(arrayInt, arrayDouble);
		for (double d2 : arrayConcat) {
			System.out.println(d2);
		}
	}
}
