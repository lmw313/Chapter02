package chapter02;

import java.io.IOException;

public class ThrowTest {
	public void suspiciousMethod() throws MyException, IOException {
		System.out.println("예외 발생 전");

		if (true) {
			throw new MyException();
		}
		
		System.out.println("예외 발생 후");
	}
}
