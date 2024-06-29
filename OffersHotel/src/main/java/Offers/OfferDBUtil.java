package Offers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OfferDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean insertOffer(String offerName, String description, String startDate, String endDate, int discountPercentage, String couponCode) {
		
		boolean isSuccess = false;
		
		
			
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into offers values (0,'"+offerName+"','"+description+"','"+startDate+"','"+endDate+"','"+discountPercentage+"','"+couponCode+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(isSuccess);
		
		return isSuccess;
		
		
	}
	
	public List<offers> retriveoffers(){
		ArrayList<offers> offerlist = new ArrayList<>();
		
			try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from offers";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int offerid = rs.getInt(1);
				String offername = rs.getString(2);
				String description = rs.getString(3);
				String startdate = rs.getString(4);
				String enddate = rs.getString(5);
				int percentage = rs.getInt(6);
				String couponcode = rs.getString(7);
				
				offers off = new offers(offerid,offername,description,startdate,enddate,percentage,couponcode);
				offerlist.add(off);
				System.out.println("off added to offerlist");
			}
			
			
			}catch (Exception e) {
			e.printStackTrace();
			}
			
			return offerlist;
	}
	
	public static boolean updateOffer(int offerID, String offerName, String description, String startDate, String endDate, int discountPercentage, String couponCode) {
		 
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement(); 
			System.out.println("YYYYYYYYYY");
			String sql = "update offers set offerName='"+offerName+"', description='"+description+"', startDate='"+startDate+"', endDate='"+endDate+"', discountPercentage ='"+discountPercentage+"', couponCode='"+couponCode+"' where offerID='"+offerID+"'"; 
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public List<offers> retrieveSelectedOffer(int offerID){
		ArrayList<offers> selectedOffer = new ArrayList<>();
		
			try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from offers where offerID='"+offerID+"'";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int offerid = rs.getInt(1);
				String offername = rs.getString(2);
				String description = rs.getString(3);
				String startdate = rs.getString(4);
				String enddate = rs.getString(5);
				int percentage = rs.getInt(6);
				String couponcode = rs.getString(7);
				
				offers off = new offers(offerid,offername,description,startdate,enddate,percentage,couponcode);
				selectedOffer.add(off);
				System.out.println("Retrieved Selected Offer");
			}
			
			}catch (Exception e) {
				e.printStackTrace();
				}
				
				return selectedOffer;
				
				
	}
	
	
	public static boolean deleteOffer(int offerID) {
		 
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement(); 
			System.out.println("YYYYYYYYYY");
			String sql = "delete from offers where offerID='"+offerID+"'" ;
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
}


