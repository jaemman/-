package chapter16;
import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
public class exam16_repo {
	private static exam16_repo ex16=new exam16_repo();
	public static exam16_repo getInstance() {
		return ex16;
	}
	
	public Connection dbconn() throws ClassNotFoundException {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bookkk";
			String id="root";
			String pass="1234";
			conn=DriverManager.getConnection(url, id, pass);
			}
		catch (SQLException e) {System.out.println(e.getMessage());}
		
		return conn;
	}
	
	public void insertmem(String[] info) throws ClassNotFoundException {
		
		
		try {
			Connection conn=dbconn();
			Statement stmt=conn.createStatement();
			System.out.println("삽입 시도");
			String sql="insert into member(id,passwd,name) values('"+info[0]+"','"+info[1]+"','"+info[2]+"')";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			System.out.println("삽입 성공");
			stmt.close();
			conn.close();
			}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			
			System.out.println("삽입 실패");
			}
	}
	
	public void insertpre(String[] info) {
			Connection conn=null;
			try {
				conn = dbconn();
				String sql="insert into member (id,passwd,name) values(?,?,?)";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, info[0]);
				ps.setString(2, info[1]);
				ps.setString(3, info[2]);
				ps.executeUpdate();
				ps.close();
				}
			catch (Exception e) {
				System.out.println(e.getMessage());
				}
			
	}

	public ArrayList selectmem() {
		Connection conn=null;
		ArrayList arr=new ArrayList();
		PreparedStatement ps=null;
		try { 
			ResultSet rs=null;
			conn=dbconn();
			String sql="select * from member";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
		
			while(rs.next()) {
				String id=rs.getString("id");
				String pass=rs.getString("passwd");
				String name=rs.getString("name");
				String[] member= {id,pass,name};
				arr.add(member);
			}
		
		}catch(Exception e) {System.out.println(e.getMessage());}
		return arr;
	}
	public void updatemem(String[] member) {
		Connection conn=null;
		PreparedStatement ps=null;

		try {
			conn=dbconn();
			String sql="update member set id=?,passwd=?,name=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, member[0]);
			ps.setString(2, member[1]);
			ps.setString(3, member[2]);
			ps.setString(4, member[0]);
			ps.executeUpdate();
			System.out.println("수정 완료");
			ps.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("수정 실패");
		}
	}
	public void deletemem(String[] member) {
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn=dbconn();
			String sql="delete from member where id=? and passwd=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, member[0]);
			System.out.println(member[0]);
			ps.setString(2, member[1]);
			System.out.println(sql);
			ps.executeUpdate();
			ps.close();
			conn.close();
			System.out.println("제거됨");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("제거안됨");
		}
	}
}
