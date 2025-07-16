package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelData {
	
	public static HSSFSheet sheet;
		public static HSSFWorkbook workbook;
		public static int totalRows;
		public static int totalColumns;
	 
		public static String ExcelFilePath="C:\\Users\\Pradnya.Gund\\Desktop\\Regression Data Sheet.xls";
		public static String sheetName="Regression Data Sheet";
		

		public static String getExcelData(int row,int Col) throws IOException {
			
		//	String filePath=System.getProperty("user.dir")+ExcelFilePath;
			
			String filePath=ExcelFilePath;
			FileInputStream fis = new FileInputStream(filePath); // load File
			workbook = new HSSFWorkbook(fis); // load workbook
			sheet = workbook.getSheet(sheetName);// load sheet
			
			
			 totalRows=sheet.getPhysicalNumberOfRows();
			 totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
			
//			System.out.println("Total Rows: " + totalRows);
//			System.out.println("Totak Columns: " + totalColumns);
//			System.out.println("---------------------------------------------");
			
			workbook.close();
			fis.close();
			return sheet.getRow(row).getCell(Col).getStringCellValue();
		}
		
		public static void printExcelData() {
			
			String[] headers=new String[totalColumns];
			Row headerRow=sheet.getRow(0);
			Row row;
			Cell cell;
			for(int k=0;k<totalColumns;k++)
			{
				headers[k]=sheet.getRow(0).getCell(k).toString().trim();
			}
			
			for(int i=1;i<=totalRows;i++)
			{
				 row=sheet.getRow(i);
				
				if(row!=null)
				{
					for(int j=0;j<totalColumns;j++)
					{
						 cell=row.getCell(j);
						if(cell!=null)
						{
							System.out.println(headers[j]+": "+cell.toString());
						}
					}
					System.out.println("------------------------------------------");
				}
			}
				
		}
	
		public static void main(String[] args) throws IOException {
			getExcelData(1,0);
			printExcelData();
		
		}
}