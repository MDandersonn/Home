package SubjectException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Subject s1 = new Subject("국어", 10);
			System.out.println(s1.toString());
			
			Subject s2 = new Subject("수학", 63);
			
			System.out.println(s1.greatThen(s2));
		} catch (NumberRangeOverException e) {
			e.printStackTrace();
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		

	}

}
