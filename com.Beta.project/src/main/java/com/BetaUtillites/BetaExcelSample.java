package com.BetaUtillites;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BetaExcelSample {
	public static XSSFWorkbook wb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
try {
			

			File file = new File("./app.myfiles/login.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			int sheetcount = sheet.getLastRowNum();
			System.out.println(sheetcount);
				
				for(int i=0;i<=sheetcount;i++) {
					
					String username = sheet.getRow(i).getCell(0).getStringCellValue();
					System.out.println(username);
					
				}
			
			
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("file loaded susesfully");
		}
	
	}

		public String getsheetname(String sheetname,int rownum,int columnno) { 
			return wb.getSheet(sheetname).getRow(rownum).getCell(columnno).getStringCellValue();
			
		}
		
		public String getsheetname(int sheetno,int rownum,int columnno) {
			return wb.getSheetAt(sheetno).getRow(rownum).getCell(columnno).getStringCellValue();
			
		
		
		

	}

}
