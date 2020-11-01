import java.util.*;
class Employee{  // java Assignment Day8
    String name;
    int age;
    int salary;
    String designation;
    
   public void getDetails(){};
   public void displayDetails(){};
}
class Doctor extends Employee{
    Doctor(String name,int age,int salary,String designation){
    
        getDetails(name,age,salary,designation);
    }
     static void getDetails(String name,int age,int salary,String designation){
         System.out.println("------Doctor Details are------");
         displayDetails(name,age,salary,designation);
     }
     static void displayDetails(String name,int age,int salary,String designation){
         System.out.println("Doctor name        : " + name);
         System.out.println("Doctor age         : " + age);
         System.out.println("Doctor salary      : " + salary);
         System.out.println("Doctor designation : " + designation);
         System.out.println("-------------------------");
     }
}

class Engineer extends Employee{
    Engineer(String name,int age,int salary,String designation){
    
        getDetails(name,age,salary,designation);
    }
     static void getDetails(String name,int age,int salary,String designation){
         System.out.println("------Engineer Details are------");
         displayDetails(name,age,salary,designation);
     }
     static void displayDetails(String name,int age,int salary,String designation){
         System.out.println("Engineer name        : " + name);
         System.out.println("Engineer age         : " + age);
         System.out.println("Engineer salary      : " + salary);
         System.out.println("Engineer designation : " + designation);
         System.out.println("-------------------------");
     }
    
}

class Pilot extends Employee{
    Pilot(String name,int age,int salary,String designation){
    
        getDetails(name,age,salary,designation);
    }
     static void getDetails(String name,int age,int salary,String designation){
         System.out.println("------Pilot Details are------");
         displayDetails(name,age,salary,designation);
     }
     static void displayDetails(String name,int age,int salary,String designation){
         System.out.println("Pilot name        : " + name);
         System.out.println("Pilot age         : " + age);
         System.out.println("Pilot salary      : " + salary);
         System.out.println("Pilot designation : " + designation);
         System.out.println("-------------------------");
     }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Doctor[] doc = new Doctor[3];
	    Engineer[] eng = new Engineer[3];
	    Pilot[] pil = new Pilot[3];
	    System.out.println("---------- Doctor Details ----------");
	    for(int i=0;i<doc.length;i++){
	        System.out.println("Enter Doctor Details");
	        String name = s.next();
            int age = s.nextInt();
            int salary=s.nextInt();
            String designation=s.next();
	        doc[i]= new Doctor(name,age,salary,designation);
	    }
	    System.out.println("---------- Engineer Details ----------");
	    for(int i=0;i<doc.length;i++){
	        System.out.println("Enter Engineer Details");
	        String name = s.next();
            int age = s.nextInt();
            int salary=s.nextInt();
            String designation=s.next();
	        eng[i]= new Engineer(name,age,salary,designation);
	    }
	    System.out.println("---------- Pilot Details ----------");
	    for(int i=0;i<doc.length;i++){
	        System.out.println("Enter Pilot Details");
	        String name = s.next();
            int age = s.nextInt();
            int salary=s.nextInt();
            String designation=s.next();
	        pil[i]= new Pilot(name,age,salary,designation);
	    }
	    
	
	}
}
