package com.spring_api.springbootapi;


import com.spring_api.springbootapi.entity.Employee;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

    public class UsersServiceTest {

        private Employee employee;

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @BeforeClass
        public static void globalSetUp() {
            System.out.println("Initial setup...");
            System.out.println("Code executes only once");
        }

        @Before
        public void setUp() {
            System.out.println("Code executes before each test method");
            Employee employee1 = new Employee("John", "Nekitov", "HR", 1700);
            Employee employee2 = new Employee("John", "Nekitov", "HR", 1700);
            Employee employee3 = new Employee("John", "Nekitov", "HR", 1700);
            Employee employee4 = new Employee("John", "Nekitov", "HR", 1700);

            List<Employee> usersList = new ArrayList<>();
            usersList.add(employee1);
            usersList.add(employee2);
            usersList.add(employee3);
            employee = new Employee(employee);
        }

//        @Test
//        public void whenCreateNewUserThenReturnListWithNewUser() throws Exception {
//            assertThat(usersService.getUsers().size(), is(3));
//            usersService.createNewUser("New User", LocalDate.of(1990, 2, 1));
//            assertThat(usersService.getUsers().size(), is(4));
//        }
//
//        @Test
//        public void whenRemoveUserWhenRemoveUserByName(){
//            usersService.removeUser("Melinda");
//            List<Users> usersList = usersService.getUsers();
//            assertThat(usersList.size(), is(2));
//        }
//
//        @Test
//        public void whenCreateNewUserWithoutNameThenThrowCustomFieldException() throws Exception {
//            thrown.expect(CustomFieldException.class);
//            thrown.expectMessage("Name could not be empty or null");
//            usersService.createNewUser(null, LocalDate.of(1990, 2, 1));
//        }
//
//        @Test
//        public void whenCreateNewUserWithoutDateOfBirthThenThrowCustomFieldException() throws Exception {
//            thrown.expect(CustomFieldException.class);
//            thrown.expectMessage("Date of birth could not be null");
//            usersService.createNewUser("Dave", null);
//        }
//
//        @Test
//        public void whenIsBirthDayWhenBirthdayThenReturnTrue() throws CustomFieldException {
//            boolean isBirthday = usersService.isBirthDay(usersService.getUsers().get(0), LocalDate.of(1990, 2, 1));
//            assertFalse(isBirthday);
//        }
//
//        @Test
//        public void whenIsBirthDayWhenNotBirthdayThenReturnFalse() throws CustomFieldException {
//            boolean isBirthday = usersService.isBirthDay(usersService.getUsers().get(0), LocalDate.of(1990, 3, 17));
//            assertTrue(isBirthday);
//        }
//
//        @AfterClass
//        public static void tearDown() {
//            System.out.println("Tests finished");
//        }
//
//        @After
//        public void afterMethod() {
//            System.out.println("Code executes after each test method");
//        }
    }
