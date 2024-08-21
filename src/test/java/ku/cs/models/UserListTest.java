package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("admin", "123456");
        userList.addUser("Brian", "100");
        userList.addUser("Tiger", "2567");
        // TODO: find one of them
        User user = userList.findUserByUsername("Tiger");
        // TODO: assert that UserList found User
        String expected = "Tiger";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("admin", "123456");
        userList.addUser("Brian", "100");
        userList.addUser("Tiger", "2567");
        // TODO: change password of one user
        boolean actual = userList.changePassword("admin", "123456", "4747");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("admin", "123456");
        userList.addUser("Brian", "100");
        userList.addUser("Tiger", "2567");
        // TODO: call login() with correct username and password
        User expected = userList.findUserByUsername("Brian");
        User actual = userList.login("Brian", "100");
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("admin", "123456");
        userList.addUser("Brian", "100");
        userList.addUser("Tiger", "2567");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Brian", "1212312121");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}