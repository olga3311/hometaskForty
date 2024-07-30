import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("test", "newTest", "testTest@test.com");

@Test
public void test_set_getLogin_success() {
    user.setLogin("test1");

    assertEquals("test1", user.getLogin());

    }

    @Test
    public void test_set_getValidPassword_success(){

    user.setPassword("newTest1");

        assertEquals("newTest1", user.getPassword());

    }

    @Test
    public void test_set_getValidEmail_success(){

        user.setEmail( "1testTest@test.com");

        assertEquals("1testTest@test.com", user.getEmail());
    }

    @Test
    public void test_isValidPassword_success(){

        user.setPassword("newTest2");

        assertTrue(user.isValidPassword(user.getPassword()));
        assertFalse(user.isValidPassword("112456"));
    }

    @Test
    public void test_setLogin_fail_throwException(){

assertThrows(IllegalArgumentException.class, () -> user.setLogin("12"));

    }

    @Test
    public void test_setPassword_fail_throwException(){

    assertThrows(IllegalArgumentException.class, ()-> user.setPassword("test12"));

    }

@Test
    public void test_setEmail_fail_throwException(){

    assertThrows(IllegalArgumentException.class, () -> user.setEmail("123email"));

}


}