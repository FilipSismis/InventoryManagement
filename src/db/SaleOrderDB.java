package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import model.SaleOrder;

public class SaleOrderDB implements SaleOrderDBIF{
	public SaleOrderDB() {
		
	}
	
	public SaleOrder addSaleOrder(SaleOrder saleOrder) {
		String query = "insert SaleOrder (orderNo, saleDateTime) values(?, ?)";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
			pstmt.setString(1, saleOrder.getOrderNo());
			pstmt.setTimestamp(2, new Timestamp(saleOrder.getTimeLong()));
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				saleOrder.setSaleOrderId(rs.getInt(1));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return saleOrder;
	}
}
