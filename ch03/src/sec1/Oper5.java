package sec1;

public class Oper5 {

	public static void main(String[] args) {
		// 비트 (2진) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h =c ^ d;
		System.out.println("c & d =>"+e); //2진수 and
		System.out.println("c & d =>"+f);
		System.out.println("d <<< 2는 존재하지 않음"); //왼쪽 이중시프트는 연산자가 없음
		//연산시 부정과 불능 그리고 예외처리
		System.out.println(a / 0); //Not a Number =>NaN  
		System.out.println('k' / 4); // "문자열"은 안되고 '문자'는 가능   
		System.out.println(a % 0);
			}
			}				 

