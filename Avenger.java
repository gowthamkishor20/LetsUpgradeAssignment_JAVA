import java.util.Scanner;
public class Avenger   // java Day4 Assignment
{       String name,power,weapon,planet;
        int age;
        Avenger(String name,int age,String power,String weapon,String planet){
            this.name=name;
            this.age=age;
            this.power=power;
            this.weapon=weapon;
            this.planet=planet;
        }
	public static void main(String[] args) {
		getDetails();
		System.out.println("-----question2-----\n");
		int a[]=new int[]{1,2,3,4,5};
		question2(a);
		System.out.println("-----question3-----\n");
		question3();
	}
	static void getDetails(){
	    Scanner s=new Scanner(System.in);
	    System.out.print("Name: ");
	    String name=s.next();
	    System.out.print("Age: ");
	    int age=s.nextInt();
	    System.out.print("Power: ");
	    String power=s.next();
	    System.out.print("Weapon: ");
	    String weapon=s.next();
	    System.out.print("Planet: ");
	    String planet=s.next();
	    Avenger m = new Avenger(name,age,power,weapon,planet);
	    displayDetails(m.name,m.age,m.power,m.weapon,m.planet);
	}
	static void displayDetails(String name,int age,String power,String weapon,String planet){
	    System.out.println("-----Avenger Details-----\n");
	    System.out.println("Avenger Name="+name);
	    System.out.println("Avenger Age="+age);
	    System.out.println("Avenger Power="+power);
	    System.out.println("Avenger Weapon="+weapon);
	    System.out.println("Avenger Planet="+planet+"\n");
	    
	}
	static void question2(int a[]){
	    for(int i=0;i<a.length;i++){
	    	 System.out.println("Odd Values in Array {1,2,3,4,5}:");
	        if(i%2==0){
	            System.out.println(a[i]);
	        }
	    } }
	static void question3(){
	    Scanner s=new Scanner(System.in);
	    int a[] =new int[5];
	    int sum=0;
	    for(int i=0;i<a.length;i++){
	        a[i]=s.nextInt();
	       }
	    for(int i=0;i<a.length;i++){
	        sum+=a[i];
	       }
	       System.out.println("sum of all values in array : "+sum);
	}    
	
}

