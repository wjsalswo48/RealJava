
public class Give {
	void Give(Emp [] employee) {
		for(int i = 0 ; i<employee.length;i++) {
			int num = employee[i].ho;
			switch(num) {
			case 1:{
				if(employee[i].rank==1)employee[i].money=95000;
				else if(employee[i].rank==2)employee[i].money=80000;
			}
			case 2:{
				if(employee[i].rank==1)employee[i].money=92000;
				else if(employee[i].rank==2)employee[i].money=75000;
			}
			case 3:{
				if(employee[i].rank==1)employee[i].money=89000;
				else if(employee[i].rank==2)employee[i].money=70000;
			}
			case 4:{
				if(employee[i].rank==1)employee[i].money=86000;
				else if(employee[i].rank==2)employee[i].money=65000;
			}
			case 5:{
				if(employee[i].rank==1)employee[i].money=83000;
				else if(employee[i].rank==2)employee[i].money=60000;
			}
			}
		}
	}
}
