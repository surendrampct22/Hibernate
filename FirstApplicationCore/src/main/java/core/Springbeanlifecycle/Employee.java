package core.Springbeanlifecycle;

public class Employee {
	private int id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Creating the object");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	public void init() {
		System.out.println(" Init method invoked ");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}

}
