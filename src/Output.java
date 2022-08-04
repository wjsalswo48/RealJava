
public class Output {
	static void output(Emp[]employee) {
		System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
		for(int i =0; i<employee.length;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t.2f\t.2f\n",
					employee[i].empno,employee[i].rank,employee[i].ho,employee[i].salery,employee[i].give,
					employee[i].tax,employee[i].m_tax);
		}
	}
}
