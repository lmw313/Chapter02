package paint;

public abstract class Shape {

	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

//	public void draw() {
//		System.out.println("구체적인 도형을 그릴 수 없습니다.");
//	}
	
//	public abstract void draw() {
//		System.out.println("구체적인 도형을 그릴 수 없습니다.");
//	}

}
