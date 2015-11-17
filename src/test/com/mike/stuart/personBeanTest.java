package test.com.mike.stuart;

import com.mike.stuart.personBean;
import org.junit.*;

import static org.junit.Assert.*;
import java.lang.reflect.Field;

/***********************************************************************************************************************
 * personBean Tester.
 *
 * @author <Mike Stuart>
 * @since <pre>Nov 9, 2015</pre>
 * @version 1.0
 *
 * Asserts Used:
 * --------------------------------
 * assertNotNull()
 * assertEquals()
 * assertFalse()
 * assertTrue()
 * assertArrayEquals()
 * assertNull()
 * assertSame()
 * assertNotSame()
 **********************************************************************************************************************/
public class personBeanTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @BeforeClass
    public static void beforeClass() {
    }

    @AfterClass
    public static void afterClass() {
    }

    /*******************************************************************************************************************
     *
     * Method: getFirstName()
     *
     ******************************************************************************************************************/
    @Test
    public void testGetFirstName() throws Exception {
        // Create a personBean
        personBean aPersonBean = new personBean("Mike", null, 78);
        Field firstNameField = null;
        try {
            firstNameField = personBean.class.getDeclaredField("firstName");
        } catch (NoSuchFieldException|SecurityException e) {
            e.printStackTrace();
        }
        firstNameField.setAccessible(true);
        String aFirstName = null;
        try {
            aFirstName = (String)firstNameField.get(aPersonBean);
        } catch (IllegalArgumentException|IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(aFirstName);
        assertEquals("Mike", aFirstName);

        Field lastNameField = null;
        lastNameField = personBean.class.getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        String aLastName = (String)lastNameField.get(aPersonBean);
        assertNull(aLastName);
        assertSame(null, aLastName);
        assertNotSame(null, aFirstName);

//        fail("This is suppose to represent something that we know is going to fail.");
    }

    /*******************************************************************************************************************
     *
     * Method: setFirstName(String firstName)
     *
     ******************************************************************************************************************/
    @Test
    public void testSetFirstName() throws Exception {
        personBean aPersonBean = new personBean("Robert", "Francis", 34);

        Field firstNameField = personBean.class.getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String aFirstName = (String)firstNameField.get(aPersonBean);
        assertFalse(aFirstName == "Mike");
    }

    /*******************************************************************************************************************
     *
     * Method: getLastName()
     *
     ******************************************************************************************************************/
    @Test
    public void testGetLastName() throws Exception {
        personBean aPersonBean = new personBean("Robert", "Francis", 34);
        Field lastNameField = null;
        try {
            lastNameField = personBean.class.getDeclaredField("lastName");
        } catch (NoSuchFieldException|SecurityException e) {
            e.printStackTrace();
        }
        lastNameField.setAccessible(true);
        String aLastName = null;
        try {
            aLastName = (String)lastNameField.get(aPersonBean);
        } catch (IllegalArgumentException|IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(aLastName);
        assertEquals("Francis",aLastName);
    }

    /*******************************************************************************************************************
     *
     * Method: setLastName(String lastName)
     *
     ******************************************************************************************************************/
    @Test
    public void testSetLastName() throws Exception {
        personBean aPersonBean = new personBean("Robert", "Francis", 34);
        Field lastNameField = personBean.class.getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        String aLastName = (String)lastNameField.get(aPersonBean);
        assertFalse(aLastName == "Mike");
    }

    /*******************************************************************************************************************
     *
     * Method: getAge()
     *
     ******************************************************************************************************************/
    @Test
    public void testGetAge() throws Exception {
        personBean anotherPersonBean = new personBean("Joe", "Bob", 99);
        Field ageField = personBean.class.getDeclaredField("age");
        ageField.setAccessible(true);
        Integer ageNum = (Integer)ageField.get(anotherPersonBean);
        assertTrue(ageNum != 87);
    }

    /*******************************************************************************************************************
     *
     * Method: setAge(int age)
     *
     ******************************************************************************************************************/
    @Test
    public void testSetAge() throws Exception {
        personBean aPersonBean = new personBean("Robert", "Francis", 34);
        Field ageField = personBean.class.getDeclaredField("age");
        ageField.setAccessible(true);
        Integer ageNum = (Integer)ageField.get(aPersonBean);
        assertFalse(ageNum < 0 & ageNum > 100);
    }

    /*******************************************************************************************************************
     *
     * Method: toString()
     *
     ******************************************************************************************************************/
    @Test
    public void testToString() throws Exception {
        personBean aPersonBean = new personBean("Robert", "Francis", 34);
        Field firstNameField = personBean.class.getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String aFirstName = (String)firstNameField.get(aPersonBean);
        assertFalse(aFirstName == "");
    }

    /*******************************************************************************************************************
     *
     * Methods to Ignore:
     *
     ******************************************************************************************************************/

    @Ignore
    public void testGetAgeIgnore() throws Exception {
        personBean anotherPersonBean = new personBean("Joe", "Bob", 99);
        Field ageField = personBean.class.getDeclaredField("age");
        ageField.setAccessible(true);
        String anAge = (String)ageField.get(anotherPersonBean);
        Integer ageNum = Integer.parseInt(anAge);
        assertTrue(anAge == null);

        fail("This is supposed to fail.");
    }

    /*******************************************************************************************************************
     *
     * Method: testArray()
     *
     ******************************************************************************************************************/

    @After
    public void testArray() throws Exception {
        Integer[] numberList = {1,2,3,4,5,6,7,8,9,10};
        Integer[] secondNumberList = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(numberList, secondNumberList);
    }

} 
