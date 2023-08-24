package oops;
import java.lang.*;
import java.util.Scanner;

public class ResumePreparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

interface IMandatoryFields
{
	void lastName();
	void firstName();
	void mobileNo();
	void emailID();
	void heightEducation();
	void skills();
	void currentAddress();
}

interface IOptionalFields
{
	void linkedProfileID();
	void projects();
	void certifications();
	void interests();
	void passOutYear();
	void languagesKnown();
}

class FieldsToFill implements IMandatoryFields, IOptionalFields
{
	Scanner objScanner = new Scanner(System.in);
	FieldsToFill objFieldsToFill = new FieldsToFill();
	@Override
	public void linkedProfileID() {
		// TODO Auto-generated method stub
		System.out.println("Linked Profile: ");
		String linkedID = objScanner.nextLine();
	}

	@Override
	public void projects() {
		// TODO Auto-generated method stub
		System.out.println("Enter Project Details: ");
		String projectDetails = objScanner.nextLine();
	}

	@Override
	public void certifications() {
		// TODO Auto-generated method stub
		System.out.println("Enter Certifications and Achievements: ");
		String certifications = objScanner.nextLine();
	}

	@Override
	public void interests() {
		// TODO Auto-generated method stub
		System.out.println("Enter your interests and hobbies: ");
		String interestHobbies = objScanner.nextLine();
	}

	@Override
	public void passOutYear() {
		// TODO Auto-generated method stub
		System.out.println("Enter passout year: ");
		int passYear = objScanner.nextInt();
	}

	@Override
	public void languagesKnown() {
		// TODO Auto-generated method stub
		System.out.println("Enter Languages known: ");
		String language = objScanner.nextLine();
	}

	@Override
	public void lastName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Last Name: ");
		String lastName = objScanner.nextLine();
	}

	@Override
	public void firstName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileNo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heightEducation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skills() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currentAddress() {
		// TODO Auto-generated method stub
		
	}
	
}
