package sec1;

public class Var03 {

	public static void main(String[] args) {
		//primitive type (기본 자료형/원시타입 ) : 하나의 데이터만 저장가능한 구조 
		boolean a=true;		// 1바이트 표현범위 
		byte b=20, c=127;	// -128~127 사이만가능 
							//  -> 1byte (8bit =2의 8승 =256가지)
		short d=6450; 		// 2byte 
		int e=65000; 		// 4byte(32bit)
		long f=65000; 		// 8byte(64bit)
		float g=314f; 		// 4byte(32bit)
		double h=3.14; 		// 8byte(64bit)
		//문자/문자열
		char i='k';			// 2byte(16bit)
		
		String j="kim";		// 3byte  
	}

}
