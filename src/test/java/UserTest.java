import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {



    @Test
    public void testCreateUser() {
        User user = new User("Henke","asd123");
    }

    @Test
    public void testGetUserName() {
        User user = new User("Henke","asd123");

        String actual = user.getNam();
        String expected = "Henke";

        assertEquals(expected,actual);
    }

    @Test
    public void testGetPassword() {
        User user = new User("Henke","asd123");

        String actual = user.getPassword();
        String expected = "asd123";

        assertEquals(expected,actual);
    }

    @Test
    public void testChangeUserName() {
        User user = new User("Henke","asd123");

        user.changeName("Erik");

        String actual = user.getName();
        String expected = "Erik";

        assertEquals(expected, actual);

    }

}
