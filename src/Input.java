import java.util.Scanner;

public class Input {
	static void input(Emp [] employee){
		Scanner sc = new Scanner(System.in);
		char io;
		for(int i = 0; i<employee.length; i++) {
			employee[i]= new Emp();
			System.out.print("사원번호 : ");
			employee[i].empno = sc.nextInt();
			System.out.print("급 : ");
			employee[i].rank = sc.nextInt();
			System.out.println("호 : ");
			employee[i].ho = sc.nextInt();
			System.out.println("수당 : ");
			employee[i].salery = sc.nextInt();
			System.out.println("입력/출력(I/O)?: ");
			io = sc.next().charAt(0);
			
			if(io=='O') {
				break;
			}
		
		}
	}
}
