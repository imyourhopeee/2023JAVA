class Circle{
	protected int radius;
	public Circle(int r) {radius=r;}
}
class Pizza extends Circle {
	String menu;
	
	public Pizza(String menu,int r) {super(r); this.menu=menu;}
	public void print() {
		 System.out.println("주문한 메뉴는 "+ menu +"크기는"+radius+"입니다");
	 }
	
public class Week02_01 {
	public static void main(String[] args) {
		Pizza obj=new Pizza("Pepperoni",20);
		obj.print();

	}

}}
