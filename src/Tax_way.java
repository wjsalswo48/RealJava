
public class  Tax_way {
	static void Tax_way(Emp [] emp) {
		for(int i = 0 ; i< emp.length;i++) {
		int op=0; //조정액
		double ap=0.;//세율
	    Give give = new Give();//지급액
		
	    emp[i].give = emp[i].money+emp[i].salery;
		
		if(emp[i].give<70000) {
			op=0;
			ap=0.;
		}
		else if(emp[i].give>=70000 && emp[i].give<80000) {
			op=300;
			ap=0.005;
		}
		else if(emp[i].give>=80000 && emp[i].give<90000) {
			op=500;
			ap=0.007;
		}
		else if(emp[i].give>90000) {
			op=1000;
			ap=0.012;
		}
		emp[i].tax=(double)(emp[i].give*ap)-op;
		
		emp[i].m_tax=emp[i].give-emp[i].tax;
		}
	}
}
