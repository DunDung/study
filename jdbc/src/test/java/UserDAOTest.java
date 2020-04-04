

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
	private UserDAO userDao;

	@Before
	public void setup() {
		userDao = new UserDAO();
	}

	@Test
	public void totalTest() throws Exception{
		User user = new User("dundung22", "dundung");
		userDao.addUser(user);
		assertEquals(user, userDao.findByUserId("dundung22"));
		userDao.updateByUserId(user, "changeDundung");
		System.out.println(user);
		userDao.deleteByUserId("dundung22");
	}

	@Test
	public void connection() {
		Connection con = userDao.getConnection();
		assertNotNull(con);
	}

	@Test
	public void addUser() throws Exception {
		User user = new User("testUserId", "testUser");
		userDao.addUser(user);
	}

	@Test
	public void findByUserId() throws Exception {
		User findUser = userDao.findByUserId("testUserId");
		User exceptUser = new User("testUserId", "testUser");
		assertEquals(findUser, exceptUser);
	}

	@Test
	public void updateTest() throws Exception {
		User findUser = userDao.findByUserId("testUserId");
		assertTrue(userDao.updateByUserId(findUser, "testName") > 0);
	}

	@Test
	public void deleteTest() throws Exception {
		User findUser = userDao.findByUserId("testUserId");
		assertTrue(userDao.deleteByUserId(findUser.getUserId()) > 0);
	}
}