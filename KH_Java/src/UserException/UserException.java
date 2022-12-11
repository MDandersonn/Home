package UserException;

public class UserException extends Exception{
	//RuntimeException을 상속하면 throws 강제하지않음. 
	UserException(){}
	UserException(String message){
		super(message);
	}
	

}
