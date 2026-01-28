
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class GradingSystem {
static	HashMap<String,String>display= new HashMap<String,String>();
	// subject grade variables 
	static String mathGrade;
	static String engGrade;
	static String phycGrade;
	static String chemGrade;
	static String bioGrade;
	static String kiswaGrade;
	static String geoGrade;
	static String b_sGrade;
	
	//average variables
	static Integer totalScores=0;
	static Integer avScores;
	static Character avGrade;
	
	//Subject grade scale and calculation
	  //English method
			static void eng (Integer es) {
				if(es>=80 && es<=100) {
					engGrade="A";
				} else if (es>=75 && es<=79) {
					engGrade="A"+"-";
				}else if (es>=70 && es<=79) {
					engGrade="B"+"+";
				}else if (es>=65 && es<=69) {
					engGrade="B";
				}else if (es>=60 && es<=64) {
					engGrade="B"+"-";
				}else if (es>=55 && es<=59) {
					engGrade="C"+"+";
				}else if (es>=50 && es<=54) {
					engGrade="C";
				}else if (es>=45 && es<=49) {
					engGrade="C"+"-";
				}else if (es>=40 && es<=44) {
					engGrade="D"+"+";
				}else if (es>=35 && es<=39) {
					engGrade="D";
				}else if (es>=30 && es<=34) {
					engGrade="D"+"-";
				}else if (es>=0 && es<=29) {
					engGrade="E";
				}else {
					engGrade="Y";
				}
				}
			//Kiswahili method
			static void kiswa (Integer ks) {
				if(ks>=78&&ks<=100) {
					kiswaGrade="A";
				}else if(ks>=73&&ks<=77) {
					kiswaGrade="A"+"-";
				}else if(ks>=68&&ks<=72) {
					kiswaGrade="B"+"+";
				}else if(ks>=63&&ks<=67) {
					kiswaGrade="B";
				}else if(ks>=58&&ks<=62) {
					kiswaGrade="B"+"-";
				}else if(ks>=53&&ks<=57) {
					kiswaGrade="C"+"+";
				}else if(ks>=48&&ks<=52) {
					kiswaGrade="C";
				}else if(ks>=43&&ks<=47) {
					kiswaGrade="C"+"-";
				}else if(ks>=38&&ks<=42) {
					kiswaGrade="D"+"+";
				}else if(ks>=33&&ks<=37) {
					kiswaGrade="D";
				}else if(ks>=28&&ks<=32) {
					kiswaGrade="D"+"-";
				}else if(ks>=0&&ks<=27) {
					kiswaGrade="E";
				}else {
					kiswaGrade="Y";
				}
			}
			
			//Mathematics calculation
			static void math (Integer ms) {
				if(ms>=70&&ms<=100) {
					mathGrade="A";
				}else if(ms>=65&&ms<=69) {
					mathGrade="A"+'-';
				}else if(ms>=60&&ms<=64) {
					mathGrade="B"+"+";
				}else if(ms>=55&&ms<=59) {
					mathGrade="B";
				}else if(ms>=49&&ms<=54) {
					mathGrade="B"+"-";
				}else if(ms>=43&&ms<=48) {
					mathGrade="C"+"+";
				}else if(ms>=37&&ms<=42) {
					mathGrade="C";
				}else if(ms>=31&&ms<=36) {
					mathGrade="C"+"-";
				}else if(ms>=25&&ms<=30) {
					mathGrade="D"+"+";
				}else if(ms>=19&&ms<=24) {
					mathGrade="D";
				}else if(ms>=12&&ms<=18) {
					mathGrade="D"+"-";
				}else if(ms>=0&&ms<=11) {
					mathGrade="E";
				}else {
					mathGrade="Y";
				}
			}
			//Biology calculation
			
	
	public static void main (String[] args) {
		//arrays
		HashMap<String,Integer> store= new HashMap<String,Integer>();
		ArrayList<String>schoolSubjects= new ArrayList<String>();
		
		
		// input section
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name please : ");
		String name = input.nextLine();
		System.out.print("Enter your index number : ");
		String index = input.nextLine();
		System.out.println("______________________________________________________________________");
		
		//display subject offered
		schoolSubjects.add("MATHEMATICS");
		schoolSubjects.add("PHYSICS");
		schoolSubjects.add("CHEMISTRY");
		schoolSubjects.add("BIOLOGY");
		schoolSubjects.add("KISWAHILI");
		schoolSubjects.add("ENGLISH");
		schoolSubjects.add("GEOGRAPHY");
		schoolSubjects.add("BUSINESS STUDIES");
		System.out.print("\nSubjects offered in the school  "+"\n"+schoolSubjects);
		System.out.println("\n--------------------------------------------------------------------");

	
		//number of subject done by the student
		System.out.print("\nHow many subject do you study: ");
		int no_Subjects=input.nextInt();
		System.out.println("_______________________________________________________________________");

		
		//Student input subject 
		System.out.println("\nEnter the full name of the subjects in capital letters and score below");
		for(int i=1;i<=no_Subjects;i++) {
			System.out.print("\n=====>"+"Subject");
			String sub = input.next();
			System.out.print("==>"+"Scores");
			Integer score = input.nextInt();
			store.put(sub, score);
		}
		
		// subject methods in action
	
		for(String subs:store.keySet()) {
			switch(subs) {
			case "MATHEMATICS":
				math(store.get(subs));
				display.put("MATHEMATICS",mathGrade);
				break;
			case "ENGLISH":
				eng(store.get(subs));
				display.put("ENGLISH", engGrade);
				break;
			case "KISWAHILI":
				kiswa(store.get(subs));
				display.put("KISWAHILI",kiswaGrade);
				break;
			}
		}
		
		//average grade calculation
		for(Integer scores:store.values()) {
			totalScores+=scores;
		}
		System.out.println(totalScores);
		avScores=totalScores/no_Subjects;
		
		if (avScores>0 && avScores<20) {
			avGrade='E';
		}else if (avScores>21 && avScores<40) {
			avGrade='D';
		}else if (avScores>41 && avScores<60) {
			avGrade='C';
		}else if (avScores>61 && avScores<80) {
			avGrade='B';
		}else if (avScores>81 && avScores<100) {
			avGrade='A';
		}else {
		
		}
		
		//display output
		System.out.println("============================================================");
		System.out.println("NAME:  "+name+"   INDEX: "+index);
		System.out.println("SUBJECT  " + "          GRADE");
		System.out.println("-----------"+"     "+"-------------");

		
		for (String f :display.keySet()) {
		System.out.println(f+"            "+display.get(f));
		}
		
		System.out.println(" \nAVERAGE GRADE : "+avGrade +"\n__________________________"+"\nTHANK YOU...");
		System.out.println("============================================================");

	}
}
