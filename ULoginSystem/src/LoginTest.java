import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testUsernameCorrectFormat() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertTrue(user.checkUserName());
    }

    @Test
    public void testUsernameIncorrectFormat() {
        Login user = new Login("kyle!!!!!!!", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertFalse(user.checkUserName());
    }

    @Test
    public void testPasswordMeetsComplexity() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testPasswordDoesNotMeetComplexity() {
        Login user = new Login("kyl_1", "password", "Kyle", "Smith");
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testLoginSuccess() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertFalse(user.loginUser("kyl_1", "wrongpassword"));
    }
}