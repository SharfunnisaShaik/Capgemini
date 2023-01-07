import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
public class Source {
	public static void main(String[] args) {
		Set<Employee> tsemp = new TreeSet<Employee>();
		Employee emp1=new Employee(102,"Doreamon",32000,34,"Sr.Developer");
		tsemp.add(emp1);
		tsemp.add(new Employee(103,"Nobita",31000,32,"Developer"));
		tsemp.add(new Employee(109,"Suzuka",34000,30,"Java Developer"));
		tsemp.add(new Employee(105,"PeachGomu",37000,23,"HR"));
		
		for(Employee employee : tsemp) {
			System.out.println(employee);
		}
		System.out.println("=========Tree Set By Name=======");
		TreeSet<Employee> empName=new TreeSet<Employee>(new SortByName());
		empName.addAll(tsemp);
		for(Employee employee : empName) {
			System.out.println(employee);
			
		}
		System.out.println("=========Tree Set By Designation====");
		TreeSet<Employee> tsDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
	
		tsDes.addAll(tsemp);
		for(Employee employee: tsDes) {
			System.out.println(employee);
		}
	}
	

}
