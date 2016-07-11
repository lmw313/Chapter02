package chapter02;

public class Student extends Person {
	public Student(){
		System.out.println("Strudent() called..");
	}
	
	public Student(int i){
		System.out.println("Strudent(int) called..");
	}
	
	public void showInfo() {
		System.out.println(age); // 부모의 default는 접근 O (동일 패키지 접근 가능)
		// System.out.println(name); 부모의 private 접근자는 접근 x
		System.out.println(height); //  public는 모든 데서 접근 O
		System.out.println(weight); // 부모의 protected 접근 O (자식만 접근 가능)
	}
}
