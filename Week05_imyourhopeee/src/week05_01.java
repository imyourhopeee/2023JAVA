class Container<T>{
	private T data;
	public void set(T data) {this.data=data;}
	public T get() {return data;}
}

public class week05_01 {

	public static void main(String[] args) {
		Container<String> container1=new Container<String>();
		container1.set("홍길동");
		String str=container1.get();
	
		Container<Integer> container2=new Container<Integer>();
		container2.set(6);
		int value=container2.get();

	}

}