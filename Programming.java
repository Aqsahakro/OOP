class FacultyOfEngineering{
	int subjects;
	int students;
	String majorSkills;

}
class DeptOfIIT extends FacultyOfEngineering{
	String nameofSkills;

}
class ComputerSystem extends DeptOfIIT{
	int gpaInSoftware;
	int gpaInHardware;
	
}
class Software extends ComputerSystem{
	String softwareNames;

}
class Programming extends Software{
	public static void main(String args[]){
		Programming p= new Programming();
		p.subjects=5;
		p.students=20;
		p.majorSkills="programming,design,database.";
		p.nameofSkills="Digital Marketing";
		p.gpaInSoftware=3;
		p.gpaInHardware=4;
		p.softwareNames="andriod based softwares.";
		
		System.out.println("list of Students selected in Programming clases:");
		System.out.println("------------------------------");
		System.out.println("Number of Students: " +  p.students);
		System.out.println("Major Skills in: " +  p.majorSkills);
		System.out.println("Subjects per Semester :" +  p.subjects);
		System.out.println("Skills of students: " +  p.nameofSkills);
		System.out.println("GPA AROUND IN HARDWARE SUBJECTS: " +  p.gpaInHardware);
		System.out.println("GPA AROUND IN SOFTWARE SUBJECTS: "+  p.gpaInSoftware);
		System.out.println("They will able to create:" +  p.softwareNames);
	}

}
