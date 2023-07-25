package CoreJavaAssgin1;

import java.util.ArrayList;
import java.util.List;

public class StudentsMarksQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(30,80,60);
		Student s2 = new Student(90,90,70);
		Student s3 = new Student(20,60,50);
		List<Student> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		System.out.println("Total of First Students MArks is : "+(s1.getS1()+s1.getS2()+s1.getS3()));
		System.out.println("Average of marks of  First Students : "+(double)(s1.getS1()+s1.getS2()+s1.getS3())/3);
		System.out.println("\nTotal of Second Students MArks is : "+(s2.getS1()+s2.getS2()+s2.getS3()));
		System.out.println("Average of marks of  Second Students : "+(double)(s2.getS1()+s2.getS2()+s2.getS3())/3);
		System.out.println("\nTotal of Third Students MArks is : "+(s3.getS1()+s3.getS2()+s3.getS3()));
		System.out.println("Average of marks of  Third Students : "+(double)(s3.getS1()+s3.getS2()+s3.getS3())/3);
		
		System.out.println("\nTotal in subject 1 : "+(s1.getS1()+s2.getS1()+s3.getS1()));
		System.out.println("Average of subject 1 : "+(double)(s1.getS1()+s2.getS1()+s3.getS1())/3);
		System.out.println("\nTotal in subject 2 : "+(s1.getS2()+s2.getS2()+s3.getS2()));
		System.out.println("Average of subject 1 : "+(double)(s1.getS2()+s2.getS2()+s3.getS2())/3);
		System.out.println("\nTotal in subject 3 : "+(s1.getS3()+s2.getS3()+s3.getS3()));
		System.out.println("Average of subject 1 : "+(double)(s1.getS3()+s2.getS3()+s3.getS3())/3);

	}

}

class Student
{
	int m1;
	int m2;
	int m3;
	
	
	public Student(int s1, int s2, int s3) {
		super();
		this.m1 = s1;
		this.m2 = s2;
		this.m3 = s3;
	}
	public int getS1() {
		return m1;
	}
	public void setS1(int s1) {
		this.m1 = s1;
	}
	public int getS2() {
		return m2;
	}
	public void setS2(int s2) {
		this.m2 = s2;
	}
	public int getS3() {
		return m3;
	}
	public void setS3(int s3) {
		this.m3 = s3;
	}
	
	
}
