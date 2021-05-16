import java.util.Date;
 
public class CloneArrayListMain {
 
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rohan","102",new Date(2002, 02, 12)));
        studentList.add(new Student("David","105",new Date(1999, 05, 30)));
 
        ArrayList<Student> clonedStudentList = (ArrayList<Student>) studentList.clone();
 
        // Update cloned list
        clonedStudentList.get(0).setName("John");
        System.out.println("-----------Original List-----------");
        studentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));
        System.out.println("-----------Copied List----------");
        clonedStudentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));
    }
}
