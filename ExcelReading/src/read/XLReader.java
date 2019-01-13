package read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLReader {

	public static void main(String[] args) throws IOException 
	{
		/*FileInputStream file= new FileInputStream("D:\\TestData.xls");
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheetAt(0);
		
		HSSFRow     row=sheet.getRow(0);
		
		String str=row.getCell(0).getStringCellValue();
		
		System.out.println(str);
		
		int rows=sheet.getLastRowNum();
		int cols=row.getLastCellNum();
		
		
		for(int r=0; r<=rows; r++)
		{
			
			for(int c=0; c<cols; c++)
			{
				
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue() +" ");
			}
			System.out.println();
		}
		*/
		
		/*System.out.println(rows);
		System.out.println(cols);
*/
		
		Xls_Reader xl= new Xls_Reader("D:\\TestData.xls");
		String str1=xl.getCellData("Data", 1, 1);
		System.out.println(str1);
		
	}

}
