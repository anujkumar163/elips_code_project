package app_java_4;

public class Programmer extends Employee{
	int bonus = 1000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("employee salaty is "+ p.salary);
		System.out.println("employee bonus is"+ p.bonus);
		System.out.println("employee name is "+ p.name);
	}
}

