package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void viewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("001", "jason", 40.5);
        studentList.addNewStudent("002", "freddy", 70);
        studentList.addNewStudent("003", "mickey", 93);

        String expected = "A";
        String actual = studentList.viewGradeOfId("003");

        assertEquals(expected, actual);
    }
}