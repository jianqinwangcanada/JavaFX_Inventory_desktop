package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import DAO.UserDAO;
import Database.Const;
import Database.DBConnection;
import JavaBean.User;

public class UserTable implements UserDAO{

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createUser(User user) {
		String query = "INSERT INTO " + Const.TABLE_USER + "(" + Const.USER_COLUMN_EMAIL+", "
				+ Const.USER_COLUMN_FNAME+", "+Const.USER_COLUMN_LNAME + ") VALUES ('"+
				user.getEmail()+"','"+user.getFirstname()+"','"+user.getLastname()+"')";
		try {
			DBConnection db = DBConnection.getInstance();
			db.getDbConnection().createStatement().execute(query);
			System.out.println("Inserted record!");
		}catch(SQLException  e) {
			e.printStackTrace();
		}
	}

}
