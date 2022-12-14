import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem15_Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try{
				int n=scanner.nextInt();
				int m=scanner.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break; //정수 곱셈 정상 출력된 경우 반복 그만
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine(); //버퍼 비우기
			}
		}
		scanner.close();
	}
}
