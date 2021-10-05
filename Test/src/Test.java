import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "a", 15000.0);
		Employee emp2 = new Employee(102, "b", 16000.0);
		Employee emp3 = new Employee(103, "c", 12000.0);
		Employee emp4 = new Employee(104, "d", 18000.0);
		Employee emp5 = new Employee(105, "e", 19000.0);
  
		 
		List<Employee> empList = new ArrayList<Employee>();
	empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		empList.stream().filter(e -> e.getSalary() >= 18000.0).forEach(e -> System.out.println(e));

		Double maxsalary = empList.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(maxsalary);

		Double thirdmaxsalary =  empList.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(thirdmaxsalary);
		
		empList.stream().map(e -> e.getName()).sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		
		
		// Test t = new Test();
		// t.reverseString("umesh nadargi");
	}

	/*
	 * public void reverseString(String str) {
	 * 
	 * if(str.length() <= 1 || str == null) System.out.print( str); else {
	 * System.out.print(str.charAt(str.length() - 1));
	 * reverseString(str.substring(0, str.length() - 1)); }
	 * 
	 * }
	 */

}
