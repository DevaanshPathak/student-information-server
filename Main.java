import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{

		//This program forms a student information server for Study Hall School, Vipul Khand, GN, Lko.

        String studentsName;
		String fathersName;
		String mothersName;
		int contactNumber;
		String dateOfBirth;
		String bloodGroup;
		String modeOfTransport;
		String vehicleNumber;
		String localAddress;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Student's name:");
		studentsName = scanner.nextLine();

		if(studentsName.equalsIgnoreCase("Abhishyant Mishra"))
		{
			System.out.println("Class : X      Section : B");
			System.out.println("Father's Name : Abhishek Mishra");
			System.out.println("Mother's Name : Vandana Mishra");
			System.out.println("Contact No. : 9451201289 ; 7355380560");
			System.out.println("Date of Birth : 8th November, 2007");
			System.out.println("Blood Group : A+");
			System.out.println("Mode of Transport : Self");
			System.out.println("Vehicle Number : UP32 DX 8694");
			System.out.println("Local Address : 3/44 Viram Khand, Gomti Nagar, Lucknow-226010");
		}
		else if(studentsName.equalsIgnoreCase("Ayush Upadhyay"))
		{
			System.out.println("Class : X      Section : B");
			System.out.println("Father's Name : Ashutosh Upadhyay");
			System.out.println("Mother's Name : Preeti Upadhyay");
			System.out.println("Contact No. : : 9004694340 ; 9920339955");
			System.out.println("Date of Birth : 28th November, 2007");
			System.out.println("Blood Group : A-");
			System.out.println("Mode of Transport : Self");
			System.out.println("Vehicle Number : Nil");
			System.out.println("Local Address : 4/110, Vipul Khand-3, Gomti Nagar, Lucknow-226010");
		}
		else if(studentsName.equalsIgnoreCase("Devaansh Pathak"))
	    {
			System.out.println("Class : IX      Section : D");
			System.out.println("Father's Name : Nirmal Pathak");
			System.out.println("Mother's Name : Reena Pathak");
			System.out.println("Contact No. : : 9919001880 ; 7985366411");
			System.out.println("Date of Birth : 4th March , 2008");
			System.out.println("Blood Group : B+");
			System.out.println("Mode of Transport : Van");
			System.out.println("Vehicle Number : Nil");
			System.out.println("Local Address : 305, Sunshine-C, Omaxe Residency 1, Arjunganj");
		}
		else if(studentsName.equalsIgnoreCase("Udisha Singh"))
		{
			System.out.println("Class : X      Section : B");
			System.out.println("Father's Name : Ajit Kumar Singh");
			System.out.println("Mother's Name : Archana Singh");
			System.out.println("Contact No. : : 7897699373 ; 8299039364 ; 9569824995");
			System.out.println("Date of Birth : 25th December, 2007");
			System.out.println("Blood Group : A+");
			System.out.println("Mode of Transport : Self");
			System.out.println("Vehicle Number : Nil");
			System.out.println("Local Address : ");
		}
		else if(studentsName.equalsIgnoreCase("Naisha Sral"))
		{
			System.out.println("Class : X      Section : B");
			System.out.println("Father's Name : Vikram Sral");
			System.out.println("Mother's Name : Ekta Sral");
			System.out.println("Contact No. : : 8429200972 ; 8800720835");
			System.out.println("Date of Birth : 3rd May, 2007");
			System.out.println("Blood Group : O+");
			System.out.println("Mode of Transport : Army Bus");
			System.out.println("Vehicle Number : 52");
			System.out.println("Local Address : 3/25, MGSF, Lucknow Cantt");
		}
		else if(studentsName.equalsIgnoreCase("Saima Bhan"))
		{
			System.out.println("Class : X      Section : B");
			System.out.println("Father's Name : Ajay Bhan");
			System.out.println("Mother's Name : Jyoti Bhan");
			System.out.println("Contact No. : : 9305109811");
			System.out.println("Date of Birth : 3rd May, 2007");
			System.out.println("Blood Group : AB+");
			System.out.println("Mode of Transport : Self");
			System.out.println("Vehicle Number : Nil");
			System.out.println("Local Address : 3/51, Vipul Khand-3, Gomti Nagar, Lucknow-226010");
		}

		scanner.close();
		
	}
}