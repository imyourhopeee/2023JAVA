public class BoardExample1 {
	//Field
	
	//Constructor
	
	//Method		
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", 
				"1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s \n", 
				"2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴선택: ");
		System.out.println();
	}	

	switch (menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
	}
}
	public void create() {
		System.out.println("*** create 메소드 실행됨");
		list();
	}
	public void read() {
		System.out.println("*** read 메소드 실행됨");
		list();
	}
	public void clear() {
		System.out.println("*** clear 메소드 실행됨");
		list();
	}
	public void exit() {
		System.exit(0);
	}
	public static void main(String[] args) {
	BoardExample1 boardExample =new BoardExample1();
	boardExample.list();
}
}

//import java.util.ArrayList;
//import java.util.List;
//
//public class BoardExample1 {
//    // 필드
//    private List<Post> posts;
//
//    // 생성자
//    public BoardExample1() {
//        this.posts = new ArrayList<>();
//    }
//
//    // 나머지 코드는 이전과 동일
//
//    public static void main(String[] args) {
//        BoardExample1 boardExample = new BoardExample1();
//        boardExample.list();
//    }
//}
//
//class Post {
//    private int number;
//    private String writer;
//    private String date;
//    private String title;
//
//    // 생성자
//    public Post(int number, String writer, String date, String title) {
//        this.number = number;
//        this.writer = writer;
//        this.date = date;
//        this.title = title;
//    }
//
//    // 게터 및 세터 메소드는 필요에 따라 추가할 수 있음
//}
