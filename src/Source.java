//import java.util.ArrayList;
import java.util.*;
//import java.util.List;
class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName()) ;
	}	
}
class SortByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeAge()-o2.getEmployeeAge();
	}
}
public class Source {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> lstemp=new ArrayList<Employee>();
		Employee emp1=new Employee(102, "Harsh", 20000, 20, "Developer");
		lstemp.add(emp1);
		lstemp.add(new Employee(101, "Asha", 22000, 21, "Java Developer"));
		lstemp.add(new Employee(104, "Varsha", 28000, 23, "Sr. Developer"));
		lstemp.add(new Employee(103, "Navya", 19000, 21, "Team Leader"));
		
		System.out.println("\n==using for each.. rawdata==");
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}
		
		System.out.println("\n==using iterator==");
		Iterator<Employee> itr=lstemp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n==sorting by employeeid as default==");
		Collections.sort(lstemp);
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}
		
		System.out.println("\n==list by name in ascending order==");
		Collections.sort(lstemp,new SortByName());
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}
		
		System.out.println(lstemp);
		
		System.out.println("\n==list by age in ascending order==");		
		Collections.sort(lstemp,new SortByAge());		
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}
		
		//implementing comparator interface anonymously
		System.out.println("\n==by implementing comparator interface anonymously==");
		Collections.sort(lstemp,new Comparator<Employee>() {
	        public int compare(Employee o1, Employee o2) {
	            return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	        }
	    });		
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}
		
		//implementing using lambda
		System.out.println("\n==using lambda==");
		Collections.sort(lstemp,(o1,o2)-> o1.getDesignation().compareTo(o2.getDesignation()));		
		for(Employee employee : lstemp) {
			System.out.println(employee);
		}


		System.out.println("\n====treeset====");
		
		Set<Employee> tsemp=new TreeSet<Employee>();
		Employee emp2=new Employee(102, "Harsh", 20000, 20, "Developer");
		tsemp.add(emp2);
		tsemp.add(new Employee(105, "Asha", 22000, 21, "Java Developer"));
		tsemp.add(new Employee(103, "Navya", 28000, 23, "Sr. Developer"));
		tsemp.add(new Employee(104, "Varsha", 19000, 21, "Team Leader"));
		for(Employee employee : tsemp) {
			System.out.println(employee);
		}
		
		System.out.println("\n==treeset by name==");		
		TreeSet<Employee> empName=new TreeSet<Employee>(new SortByName());
		empName.addAll(tsemp);
		for(Employee employee : empName) {
			System.out.println(employee);
		}
		
		System.out.println("\n====anonymously====");
		TreeSet<Employee> empNames=new TreeSet<Employee>(new TreeSet() {
			public int compare(Employee o1, Employee o2) {
	            return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}
		});		
		empNames.addAll(tsemp);
		for(Employee employee : empNames) {
			System.out.println(employee);
		}
		
		System.out.println("\n==tree set by designation using lambda====");
		TreeSet<Employee> tsDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
		tsDes.addAll(tsemp);		
		for(Employee employee : tsDes) {
			System.out.println(employee);
		}		
	}
}
//





