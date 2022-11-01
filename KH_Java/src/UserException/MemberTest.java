package UserException;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m = new Member();
		try {
			m.setName("홍길동");
		} catch (UserException e) {
			e.printStackTrace();
		}
		System.out.println(m.getName());
		try {
			m.setPassword("blue1990!");
		} catch (PasswordValidException e) {
			e.printStackTrace();
		}

	}

}
