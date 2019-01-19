package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class XL {
	
	public static String getCellValue(String path, String sheetname,int rowno, int colno)
	{
		String v="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheetname).getRow(rowno).getCell(colno).toString();
			
		} catch (Exception e) {}
			
		return v;
		} 
		
		
	}
	

