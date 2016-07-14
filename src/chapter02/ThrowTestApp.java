package chapter02;

import java.io.IOException;

public class ThrowTestApp {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// ThrowTest tt = new ThrowTest();
		// try {
		// tt.suspiciousMethod();
		// } catch (Exception e) {
		// e.printStackTrace();
		//
		// }
	}

	public static void test() throws Exception {

		ThrowTest tt = new ThrowTest();
		tt.suspiciousMethod();

	}
}
