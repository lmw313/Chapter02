package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(3000);
		camera.setCountSold(10);
		camera.setCountStock(50);

		System.out.println(camera.getName());
		System.out.println(Goods.countOfGoods);
		// camera.showInfo();
		System.out.println(camera.toString());

		int discaountPirce = camera.calcDiscountPrice(43);
		System.out.println(discaountPirce);
		
		Goods goods1 = new Goods("cannon", 300000, 0, 100);
		System.out.println(goods1);
		
	}
}
