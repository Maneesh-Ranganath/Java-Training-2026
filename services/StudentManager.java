package university.services;

import university.models.Student;
import java.io.*;
import java.util.*;


public class StudentManager{
private List<Student> students=new ArrayList<>();
private final String FILE_NAME="students.txt";


public StudentManager(){
  loadFromFile();
}

public void addStudent(Student student){
   students.add(student);
   saveToFile();
}

public List<Student> getAllStudents(){
  return students;
}

private void saveToFile(){
try (PrintWriter  writer=new PrintWriter(new FileWriter(FILE_NAME))){
for (Student s: students){
  writer.println(s.getName()+","+s.getGpa());
}
}catch(IOException e){
  System.out.println("Error saving to file: "+e.getMessage());
}
}

private void loadFromFile(){
  File file=new File(FILE_NAME);
if(!file.exists()) return;
try (Scanner reader=new Scanner(file)){
  while(reader.hasNextLine()){
  String[] parts=reader.nextLine().split(",");
  if(parts.length==2){
    students.add(new Student(parts[0], Double.parseDouble(parts[1])));
}
}
}catch(FileNotFoundException e){
}
}
    public int getStudentCount() {
        return students.size();
    }

    public double getAverageGPA() {
        if (students.isEmpty()) return 0.0;
        double sum = 0;
        for (university.models.Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }
}
