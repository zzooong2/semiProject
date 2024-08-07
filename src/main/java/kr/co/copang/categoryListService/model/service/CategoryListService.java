package kr.co.copang.categoryListService.model.service;

import java.util.ArrayList;

import kr.co.copang.categoryListService.model.dto.CategoryListDtoImpl;
import kr.co.copang.common.PageInfo;

public interface CategoryListService {
	
//	대분류 리스트 불러오기
	public ArrayList<CategoryListDtoImpl>getMainList(String type, PageInfo pi, String searchText);
//	중분류 리스트 불러오기
	public ArrayList<CategoryListDtoImpl>getMiddleList(String middleCategory, PageInfo pi, String searchText);
//  소분류 리스트 불러오기
	public ArrayList<CategoryListDtoImpl>getSubList(String subCategory, PageInfo pi, String searchText);
//  대분류 리스트 카운트 
	public int getMainListCount(String type, String searchText);
//  중분류 리스트 카운트
	public int getMiddleListCount(String middleCategory, String searchText);
//  소분류 리스트 카운트	
	public int getSubListCount(String subCategory, String searchText);

	
}
