
public class Employee //Assignment 1(Java)
{   String name,age,city;
   Employee(String name,String age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
        System.out.println("The Name is "+name);
        System.out.println("The Age is "+age);
        System.out.println("The City is "+city+"\n");
        System.out.println("--------------------\n");
    }
    
	public static void main(String[] args) {
		Employee emp1= new Employee("Gowtham","20","Namakkal");
		Employee emp2= new Employee("Kishor","20","Namakkal");
	}
}


