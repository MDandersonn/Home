package UserException;

public class Member {
	private String name;
	private String password;
	

	public String getName() {

		return name;
	}

	public void setName(String name) throws UserException {
		
		if( name.contains("*")) throw new UserException("사용자이름에는 *가 들어가면안됩니다");
		else this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordValidException{
		boolean sw1=false;
		boolean sw2=false;
		boolean sw3=false;
		for(int i=0 ;i<password.length();i++) {
			if( password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				sw1=true;
			}
			if( password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				sw2=true;
			}
			if( password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				sw3=true;
			}
		}
		
		if(password.length() <10) {
			throw new PasswordValidException("길이가10자 이상이어야합니다.");
		}
		else if( !(password.contains("*") ||
				password.contains("!")||
				password.contains("@")||
				password.contains("#")||
				password.contains("%")||
				password.contains("&")||
				password.contains("$"))
				) { 
			throw new PasswordValidException("특수문자를 포함해야합니다.");
		}
		
		else if(!sw1) {
			throw new PasswordValidException("숫자를 포함해야합니다.");
			
			
		}
		else if(!sw2) {
			throw new PasswordValidException("대문자를 포함해야합니다.");
		}
		else if(!sw3) {
			throw new PasswordValidException("소문자를 포함해야합니다.");
		}
		
		System.out.println("에러나면 멈추지?");
		this.password = password;
	}
	
	

}
