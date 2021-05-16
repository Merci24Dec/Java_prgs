
import java.util.Date;
class Student implements Cloneable{
    String name;
    String id;
    Date dateOfBirth;
 
    public Student(String name, String id,Date dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth=dateOfBirth;
    }
 
    @Override
    public Student clone() {
        Student clonedStudent = null;
        try {
            clonedStudent = (Student) super.clone();
            clonedStudent.setDateOfBirth((Date)this.dateOfBirth.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        return clonedStudent;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
