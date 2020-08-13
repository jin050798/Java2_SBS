import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodies = new ArrayList<String>();

		System.out.print("게시판");
		while (true) {
			String s = sc.nextLine();

			if (s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else if (s.equals("add")) {
				System.out.println("게시물 제목을 입력해주세요");
				String title = sc.nextLine();
				System.out.println("게시물 내용을 입력해주세요");
				String body = sc.nextLine();

				titles.add(title);
				bodies.add(body);
			} else if (s.equals("list")) {
				for (int i = 0; i < titles.size(); i++) {
					System.out.println("번호 : " + (i + 1));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("---------------");
				}
			} else if (s.equals("read")) {

				System.out.print("번호 : ");
				int number = sc.nextInt();
				System.out.println("제목 : " + titles.get(number - 1));
				System.out.println("내용 : " + bodies.get(number - 1));

			} else if (s.equals("update")) {
				System.out.print("수정하실 게시글의 번호를 입력해 주세요: ");
				int number = sc.nextInt();
				while (number > titles.size() || number < 0) {
					System.out.println("게시글이 없습니다. 다시 입력해 주세요");
					number = sc.nextInt();
				}
				sc.nextLine();
				System.out.println("제목 : ");
				String title = sc.nextLine();
				titles.set(number - 1, title);
				System.out.println("내용 : ");
				String body = sc.nextLine();
				bodies.set(number - 1, body);
				System.out.println(number + "번이 수정 되었습니다.");
			}

			else if (s.equals("delete")) {
				System.out.println("삭제하실 게시글의 번호를 입력해 주세요: ");
				int number = sc.nextInt();
				while (number > titles.size() || number < 0) {
					System.out.println("게시글이 없습니다. 다시 입력해 주세요");
					number = sc.nextInt();
				}
				titles.remove(number - 1);
				bodies.remove(number - 1);
				System.out.println(number + "번이 삭제 되었습니다.");
			}
		}
	}
}
