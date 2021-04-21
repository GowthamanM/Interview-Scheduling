package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.cts.model.Canditate;
import org.cts.util.DBConstants;
import org.cts.util.DBUtil;

public class CanditateDao {

	public boolean register(Canditate canditate) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PASSWORD);
			if(con!=null)
			{
				pst=con.prepareStatement("insert into canditate(firstname,lastname,password,dob,address,city,state,pincode,phone,degree,yop,marks,email,yoe,company) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, canditate.getFirstName());
				pst.setString(2, canditate.getLastName());
				pst.setString(3, canditate.getPassword());
				pst.setString(4, canditate.getDob());
				pst.setString(5, canditate.getAddress());
				pst.setString(6, canditate.getCity());
				pst.setString(7, canditate.getState());
				pst.setString(8, canditate.getPincode());
				pst.setString(9, canditate.getPhone());
				pst.setString(10, canditate.getHighestDegree());
				pst.setString(11, canditate.getYearOfPassing());
				pst.setString(12, canditate.getMarks());
				pst.setString(13, canditate.getEmail());
				pst.setString(14, canditate.getYearOfExperience());
				pst.setString(15, canditate.getCompanyHistory());
				int a=pst.executeUpdate();
				System.out.println(a);
				if(a>0)
					isRegistered=true;
			}
		} catch (Exception e) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return isRegistered;
	}
}
