package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		double d = 0;
		try {
			d = 100 / a;
		} catch (ArithmeticException ex) {
			// 예외처리 (예외가 발생하면 실행되는 코드)

			// 1. logging (파일, DB 저장)
			System.out.println("error: " + ex);

			// 2. 자원정리
			// 3. 사용자에게 메세지
			System.out.println("죄송합니다. 비정상 상황이 발생하여 종료합니다.");

			// 4. 정상종료
			return;
		} finally {
			System.out.println("자원정리!!!");
		}

		System.out.println(d);
	}
}
