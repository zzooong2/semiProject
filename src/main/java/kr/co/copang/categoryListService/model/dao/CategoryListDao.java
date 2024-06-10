package kr.co.copang.categoryListService.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.copang.categoryListService.model.dto.CategoryListDtoImpl;
import kr.co.copang.common.DatabaseConnection;
import kr.co.copang.common.PageInfo;

public class CategoryListDao {
	private Connection con;
	private DatabaseConnection dc;
	private PreparedStatement pstmt;
	
	public CategoryListDao() {
		dc = new DatabaseConnection();
		con = dc.connDB();
	}
	
	
	public ArrayList<CategoryListDtoImpl> getList(String type, PageInfo pi) {
		
		ArrayList<CategoryListDtoImpl> result = new ArrayList<>();
		String query = "SELECT cb.B_no, B_TITLE, BM_PAY, u.FILE_NAME, u.FILE_PATH, B_COMPANY, B_CATEGORY, bm.BM_TYPE FROM CATEGORY_BOARD cb"
			+ " JOIN UPLOAD u ON u.B_NO = cb.B_NO"
			+ " JOIN BUSINESS_MENU bm ON bm.B_NO = cb.B_NO "
			+ " JOIN MEMBER m ON m.USER_NO = cb.USER_NO"
			+ " where B_CATEGORY = ? "
			+ "	ORDER BY B_CATEGORY DESC"
			+ "	OFFSET ? ROWS FETCH FIRST ? ROWS ONLY";

	 
		try {
			
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, type);
			pstmt.setInt(2, pi.getOffset());
			pstmt.setInt(3, pi.getBoardLimit());
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int no = rs.getInt("B_NO");
				String title = rs.getString("B_TITLE");
				String price = rs.getString("BM_PAY");
				String file = rs.getString("FILE_PATH");
				String user = rs.getString("B_COMPANY");
				String categoryType = rs.getString("B_CATEGORY");
				String fileName = rs.getString("FILE_NAME");
				String priceOption = rs.getString("BM_TYPE");

				CategoryListDtoImpl categoryListDto = new CategoryListDtoImpl();
				categoryListDto.setBoardNo(no);
				categoryListDto.setBoardTitle(title);
				categoryListDto.setPrice(price);
				categoryListDto.setFilePath(file);
				categoryListDto.setCompany(user);
				categoryListDto.setType(categoryType);
				categoryListDto.setFileName(fileName);
				categoryListDto.setPriceOption(priceOption);
				result.add(categoryListDto);
				
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}


	public int getListCount(String type) {
		String query = "SELECT COUNT(*) AS cnt FROM CATEGORY_BOARD cb"
				+ " JOIN UPLOAD u ON u.B_NO = cb.B_NO"
				+ " JOIN BUSINESS_MENU bm ON bm.B_NO = cb.B_NO "
				+ " JOIN MEMBER m ON m.USER_NO = cb.USER_NO"
				+ " where B_CATEGORY = ? ";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, type);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int result = rs.getInt("CNT");
				return result;
			}
				
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	

	
}