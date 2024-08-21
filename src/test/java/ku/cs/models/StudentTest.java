package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore() {
        Student s1 = new Student("55123", "david");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.changeName("1244");
        String expected = "1244";
        String actual = s.getName();
        assertEquals(expected, actual);
    }
}