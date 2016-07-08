package paint;

public class Point {

	private int x;
	private int y;

	public void show() {
		System.out.println("[x= " + x + ", y= " + y + "]에 점을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible) {
			show();
			return;
		}
		System.out.println("[x= " + x + ", y= " + y + "]에 점을 지웠습니다.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
