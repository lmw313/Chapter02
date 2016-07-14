package kr.ac.sungkyul.paint.app;

import kr.ac.sungkyul.paint.i.Drawable;
import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;
import kr.ac.sungkyul.paint.shape.Circle;
import kr.ac.sungkyul.paint.shape.Pentagon;
import kr.ac.sungkyul.paint.shape.Rectangle;
import kr.ac.sungkyul.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point(100, 200);
		Point point2 = new Point(100, 200);
		// point1.setX(100);
		// point1.setY(200);
		//
		// point2.setX(100);
		// point2.setY(200);
		// point2.show();

		Point point3 = new ColorPoint(300, 200, "빨강");
		// point3.setX(50);
		// point3.setY(70);
		// ((ColorPoint) point3).setColor("빨강");

		draw(point1);
		draw(point2);
		draw(point3);

		draw(new Rectangle());
		draw(new Triangle());
		draw(new Circle());
		draw(new Pentagon());

	}

	public static void drawPoint(Point point) {
		point.show();
	}

	//
	// 안되는건 아니지만 앞으로 도형이 늘어날 때 마다 확장성이 별로 안좋음(도형 확장할 때 마다 메쏘드 추가해야함)
	// public static void drawRectangle(Rectangle rect){
	//
	// }

	// public static void drawShape(Shape shape) {
	// shape.draw();
	// }

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

}
