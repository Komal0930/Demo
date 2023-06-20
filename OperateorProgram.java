public class OperateorProgram {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		int c=3;
		// a++ will be 5 because of postincrement and ++c will be 4 because pre increment
		// 5+4*4 1st *will be done
		System.out.println(a++ + b*++c);
		// * will be done 8*6=48 then -5+48 action will be done i.e 43
		System.out.println(-5+8*6);
		// 1st 55+9 =64 will be done and 64*9=576 will be done
		System.out.println((55+9)*9);

	}
}