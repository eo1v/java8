package src2;

public class cast1 {
	public static void main(String[] args) {
		int a=1004, b; 	// 4byte 
		short c, d;		// 2byte
		long e, f;
		b = a;
		//c = a; 
		c = 500;
		a = c; // shot -> int = 자동 형 변환 (auto casting)
		d = (short) b; //형 변환 연산자에 의한 형 변환 (force casting) -> ()강제 형 변환
		System.out.println ("d="+d);
		e = b;
		
	}

}
