package gradingSystem;
import java.util.Scanner;
public class GradingSym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String studentName;
int marks =0;
String grade;
Scanner user=new Scanner(System.in);
System.out.println("Enter studentName:");
studentName=user.next();
System.out.println("Enter marks:");
marks =user.nextInt();
System.out.print("Enter grade:");
grade=user.next();
do {
	System.out.println("The mark:"+marks);
	marks++;
}while(marks<50);
if(marks>=90) {
	System.out.println(grade+"A");
}
else if(marks>=80){
	System.out.println(grade+"B");
}
else if(marks>=70){
	System.out.println(grade+"c");
}
else if(marks>=60) {
	System.out.println(grade+"D");
}
else if(marks>=50) {
	System.out.println(grade+"E");
}
else if(marks>=40) {
	System.out.println(grade+"F");
}
		
		
		
		
		
		
		
		
		
		
	}

}
