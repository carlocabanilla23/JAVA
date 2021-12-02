import java.util.*;
import java.io.*;
public class PersonalityTest {
	public static String Patient;
	public static void main(String[] args)
	throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.println("Please Enter your name : ");
		 Patient = console.next();
		test();
		
		
	}
	
	public static void test()
			throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		Scanner input = new Scanner (new File("personalitytest.txt"));
		String[] a = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",
				"","","","","","","","","","","","","","","","","","","","","","",""
				,"","","","","","","","","","","","","","","","","","","","","","","",""};
		int count=0;
		int i=0;
		int x= 1;
		double NofA=0;
		int NofB=0;
		int NaN = 0;
		while(input.hasNextLine() && x==1){
			String y = input.nextLine();
			count++;
			String Select;
	
			if(count%3==1 ){
			Select = "";
				
			}else if(count%3==2){
			Select = "	A";	
				
			}else{
				Select= "	B";
				
			}
			
				System.out.println(Select+" "+y);
				
				if(count%3==0){
					x=0;
					
					//////////////
						
					
					a[i] = console.next();
					if(a[i].equalsIgnoreCase("a")){
						NofA+=1;
						
					}
					else if(a[i].equalsIgnoreCase("b")){
						NofB+=1;
						
					}else{
						NaN+=1;
						
					}
				///////////////////////////////////////////////////
					x=1;
					i++;
				
				}
				
				
				}
		
		System.out.println("Patient's Name  " + Patient);
			for(int k=0;k<a.length;k++){
				if((a[k].equalsIgnoreCase("a")==false) && (a[k].equalsIgnoreCase("b")==false)){
					a[k] = "-";
					
				}
				String www= a[k];
				System.out.print(www);
				
				
				
			}
			System.out.println();
			System.out.println("Total Number of A's "+ NofA );
			System.out.println("Total Number of B's "+ NofB );
			System.out.println("Total Number of Blanks "+ NaN );
			
			
			///  the results //
			
			String d1,d2,d3,d4;
			double x1=0.0;
			double x2= 0.0;
				if(NofA>NofB){
					x1 = Math.round((NofA/NofA+NofB));
					d1 = "E-"+ x1;	
					d2="S-"+ x1;
					d3="T-"+ x1;
					d4="J-"+ x1;
					
				}else{
					x2= Math.round ((NofB/NofA+NofB));
					d1="I-"+ x2;
					d2="N-"+ x2;
					d3="F-"+ x2;
					d4="P-"+ x2;
					
				}
				System.out.println("Results");
				System.out.println(d1  + d2  + d3  + d4 );
				
			}
		
		
		
		
		
	}
	
		
		
	

