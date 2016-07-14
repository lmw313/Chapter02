package chapter02;

public class ArrayException {
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = (0);

		for (int i = 0; i < 5; i++) {
			try {
				intArray[i + 1] = i + 1 + intArray[i]; // i = 4인 경우 예외 발생
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			} catch (Exception ex) {
				System.out.println("error: " + ex);
				System.out.println("죄송합니다. 비정상 상황이 발생하여 종료합니다.");
				ex.printStackTrace();
			}
		}
	}
}
