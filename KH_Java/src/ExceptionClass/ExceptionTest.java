package ExceptionClass;

import java.util.zip.DataFormatException;

public class ExceptionTest {

	public static void main(String[] args) throws DataFormatException {
		
		String strDate= "199012102";
		if(strDate.length() !=8) {
			throw new DataFormatException("잘못된데이터형식");
		}

	}

}
 