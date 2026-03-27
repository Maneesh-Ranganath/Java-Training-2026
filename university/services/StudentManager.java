package university.services;

import university.models.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentManager{
   private  List<Student> students=new ArrayList<>();


public void addStudent(Student student){
  students.add(student);
}

public Student findByName(String searchName){
 for (Student s: students){
   if(s.getName().equalsIgnoreCase(searchName)){
return s;
}
}
return null;
}
public List<Student> getAllStudents(){
return students;
}
}
