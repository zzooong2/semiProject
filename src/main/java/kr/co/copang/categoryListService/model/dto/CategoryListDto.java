package kr.co.copang.categoryListService.model.dto;

public class CategoryListDto {
	
	private int boardNo;
	private String boardTitle;
	private String company;
	private String filePath;
	private String price;
	private String categoryType;
	private String fileName;
	private String priceOption;
	
	
	
	
	public String getPriceOption() {
		return priceOption;
	}
	public void setPriceOption(String priceOption) {
		this.priceOption = priceOption;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getType() {
		return categoryType;
	}
	public void setType(String type) {
		this.categoryType = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	
}