package patternProgram;

public class NumPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 */
		
		int num=4;
		int p=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(p++ +" ");
			}
		System.out.println();
		}
	}

}
