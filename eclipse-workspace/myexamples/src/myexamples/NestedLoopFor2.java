package myexamples;

public class NestedLoopFor2 {

	public static void main(String[] args) {
		for(int a=1; a<=10; a++) {
			System.out.print(a);
			for(int b=10; b>a;b--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
