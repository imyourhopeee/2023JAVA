interface Players{
	abstract void play();
	abstract void stop();

}

interface Explayer extends Players{
	abstract void slow();
}

class DVDPlayer implements Explayer{ // public class~~ 로 쓰면 안됨..
	public void play() {System.out.println("재생");}
	public void stop() {System.out.println("멈춤");}
	public void slow() {System.out.println("느리게 재생");}
}

public class DVDPlayerTest {
	public static void main(String[] args) {
		DVDPlayer a=new DVDPlayer();
		Explayer b=new DVDPlayer(); //이 코드의 장점활용X
		Players c=new DVDPlayer();

		a.play();
		a.stop();
		a.slow();

		b.play();
	
		c.stop();



	}}