import java.util.Scanner;
public class Student_Report_and_Employee_Details // java Assignment Day3
{
	public static void main(String[] args) {
	    System.out.println("-----Student Report-----");
		Scanner s = new Scanner(System.in);
		float Subject1_marks=s.nextFloat();
		float Subject2_marks=s.nextFloat();
		float Subject3_marks=s.nextFloat();
		float Subject4_marks=s.nextFloat();
		float Subject5_marks=s.nextFloat();
		float totalmarks_persubject=100;
		float totalmarks_ofAllsubject=500;
		float totalmarks_required=0;
		float percentage=0;
		
		if(Subject1_marks<=totalmarks_persubject &&
	       Subject2_marks<=totalmarks_persubject &&
	       Subject3_marks<=totalmarks_persubject &&
	       Subject4_marks<=totalmarks_persubject &&
	       Subject5_marks<=totalmarks_persubject ){
	           totalmarks_required=Subject1_marks+Subject2_marks+Subject3_marks+Subject4_marks+Subject5_marks;
	           percentage=((totalmarks_required/totalmarks_ofAllsubject)*100);
	           
	       }
	       else{
	           System.out.println("Enter Valid Subect Marks");
	           System.exit(0);
	       }
	       
	       if(percentage>=90){
	           System.out.println("Grade is A and percentage is "+percentage);
	       }
	       else if(percentage>=70){
	           System.out.println("Grade is B and percentage is "+percentage);
	       }
	       else if(percentage>=50){
	           System.out.println("Grade is c and percentage is "+percentage);
	       }
	       else{
	           System.out.println("Fail");
	       }
	       
	       System.out.println();
	       System.out.println("-----Employee Details-----");
	       employee();
	}
	static void employee(){
	    Scanner s = new Scanner(System.in);
	    System.out.print("Name: ");
		String Employee_name=s.next();
		System.out.print("Birth Date: ");
		int date_ofBirth=s.nextInt();
		System.out.print("Birth Month: ");
		String month_ofBirth=s.next();
		System.out.print("Birth Year: ");
		int birth_year=s.nextInt();
		System.out.print("Monthly Salary: ");
		int monthly_salary=s.nextInt();
		int annual_salary=monthly_salary*12;
		int age=2020-birth_year;
		int tax_amount=0;
		if(annual_salary>=500000){
		    tax_amount=annual_salary/20;
		}
		else if(annual_salary>=400000){
		    tax_amount=annual_salary/15;
		}
		else if(annual_salary>=300000){
		    tax_amount=annual_salary/10;
		}
		else if(annual_salary>=200000){
		    tax_amount=annual_salary/5;
		}
		else{
		    tax_amount=0;
		}
	   System.out.println("Employee_name : "+Employee_name);
	   System.out.println("Age : "+age);
	   System.out.println("Annual_salary : "+annual_salary);
	   System.out.println("tax_amount : "+tax_amount); 
	}
}

