package edu.skku.emp;

public class EmpMain {

	public static void main(String[] args) {
		EmployeeManager mgr =new EmployeeManager();
		mgr.add(new Employee(1002,"kim",50000));
		mgr.add(1001,"lee",70000);
		mgr.add(new Employee(1003,"Park",8000));
		
		mgr.search();
		mgr.search(60000);
		
		Employee[] es = mgr.allEmp();
		for (Employee e:es) {
			System.out.println(e);
		}
		System.out.println("====°Ë»ö:1003====");
		System.out.println(mgr.search(1003));
		
		Math.sin(3.12);
		Math.max(3, 5);
		Math.round(3.456);

	}

}
