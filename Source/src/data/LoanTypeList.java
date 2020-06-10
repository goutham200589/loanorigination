/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author tndkh_000
 */
public class LoanTypeList {
     public ArrayList<Loantype> getList() {
        ArrayList<Loantype> lList = new ArrayList<>();

        //tao ket noi den CSDL
        Connection cn = MyLib.getCon();

        if (cn != null) {
            try {
                //tao doi tuong Statement chua linh truy van SQL
                Statement st = cn.createStatement();

                //cho thi hanh linh truy van
                ResultSet rs = st.executeQuery("select * from tbLoanType");

                //xu ly ket qua: 
                //Duyet cac dong trong rs => bList
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String loanName = rs.getString(1);
                                      
                    int iRate = getBenchmarkRate(rs.getString(4)) + rs.getInt(3);
                    String benchMarkRate = rs.getString(4);
                    int creditSpread = rs.getInt(3);
                 
                    lList.add(new Loantype(loanName, iRate, creditSpread, benchMarkRate));


                }

                //dong resultset, connection
                rs.close();
                cn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        return lList;
    }

    public boolean insert(Loantype b) {

        Connection cn = MyLib.getCon();
        try {
            //tao doi tuong chua linh insert8
            String sql = "insert into tbLoanType values (?,0,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);

            //fill du lieu cho cac tham so


            pst.setString(1, b.loanName);
            pst.setInt(2, b.creditSpread);
            pst.setString(3, b.benchMarkType);
            



            //cho thi hanh linh 
            pst.executeUpdate();

            //dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean update(Loantype b) {

        Connection cn = MyLib.getCon();
        try {
            //tao doi tuong chua linh insert
            String sql = "update tbLoanType set creditspread=?, benchmarktype = ? where loanName=?";

            PreparedStatement pst = cn.prepareStatement(sql);

            //fill du lieu cho cac tham so

            pst.setInt(1, b.creditSpread);
            pst.setString(2, b.benchMarkType);
            pst.setString(3, b.loanName);
          

            //cho thi hanh lenh 
            pst.executeUpdate();

            //dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean delete(String gID) {

        Connection cn = MyLib.getCon();
        try {
            //tao doi tuong chua linh insert
            String sql = "delete from tbLoanType where loanName=?";
            PreparedStatement pst = cn.prepareStatement(sql);

            //fill du lieu cho cac tham so
            pst.setString(1, gID);


            //cho thi hanh lenh 
            pst.executeUpdate();

            //dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
    public int getBenchmarkRate(String type)
    {
    	int plr = 0;
    	Connection cn = MyLib.getCon();
    	String sql = "select plr from tbbenchmark where type = ?";
    	try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, type);
			ResultSet rs = pst.executeQuery();
            if (rs.next()) {
            	plr = rs.getInt(1);
            } 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return plr;
    }
    
    public int getARR()
    {
    	int plr = 0;
    	Connection cn = MyLib.getCon();
    	String sql = "select plr from tbarr";
    	try {
			PreparedStatement pst = cn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
            if (rs.next()) {
            	plr = rs.getInt(1);
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return plr;
    }
    public int getRate(String loanName) {

        int iRate = 0;


        //tao ket noi den CSDL
        Connection cn = MyLib.getCon();

        if (cn != null) {
            try {
                //tao doi tuong Statement chua linh truy van SQL

                String sql = "select * from tbLoanType where loanName=?";
                PreparedStatement pst = cn.prepareStatement(sql);
                //cho thi hanh linh truy van
                pst.setString(1, loanName);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    iRate = getBenchmarkRate(rs.getString(4)) + rs.getInt(3);
                }

                //dong resultset, connection
                rs.close();
                cn.close();





            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        return iRate;

    }
 
    public Loantype getLoanTypeData(String loantype)
    {
    	Loantype ret = new Loantype();
    	Connection con = MyLib.getCon();
    	try {
			PreparedStatement ps = con.prepareStatement("select * from tbloantype where loanname = ?");
			ps.setString(1, loantype);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String loanName = rs.getString(1);
                int iRate = getBenchmarkRate(rs.getString(4)) + rs.getInt(3);
                String benchMarkRate = rs.getString(4);
                int creditSpread = rs.getInt(3);
                ret = new Loantype(loanName, iRate, creditSpread, benchMarkRate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return ret;
    }
}
