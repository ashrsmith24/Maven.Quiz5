package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> studentList = new ArrayList<Student>();
    public void enroll(Student student) {
      studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
     return this.studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student : studentList) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student student : studentList) {
            studyMap.put(student,student.totalStudyTime);

        }
        return studyMap;
    }
}
