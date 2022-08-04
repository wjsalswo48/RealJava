public class Main {

	public static void main(String[] args) {

		Emp[]emp=new Emp[5];

		Input input= new Input();

		input.input(emp);

		

		Give give= new Give();

		give.Give(emp);

		

		Tax_way t =new Tax_way();

		t.Tax_way(emp);

 

	

		Output output= new Output();

		Output.output(emp);

	}

}
