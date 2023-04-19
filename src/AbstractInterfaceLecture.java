public class AbstractInterfaceLecture {
	public static void main(String[] args) {
		//Employee newGuy = new Developer("Nolan", "Baby");
		//System.out.println(newGuy.work());
	}
}
abstract class Employee {
	protected String name;
	protected String department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public abstract String work();

}
class Developer extends Employee {
	public Developer(String name, String department) {
		super(name, department);
	}

	public String work() {
		return "I'm coding!";
	}
}

abstract class Notification {
	public abstract boolean optedIn();
	public abstract String unsubLink();
	public abstract String getPhysicalAddress();
	public abstract String getSenderInfo();
}

