import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		ArrayList<String> a=new ArrayList<String>();
		
		// requires FileInputStream argument 
		FileInputStream fis=new FileInputStream("D://Downloads//demodata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				//identify the Testcases column by scanning the entire first row
			Iterator<Row> rows=sheet.iterator();  //sheet is the collection of rows
			Row firstrow=rows.next();
		    Iterator<Cell> cell= firstrow.cellIterator(); // row is the collection of cells
		    int k=0;
		    int coloumn=0;
			while(cell.hasNext()) 
			{
			Cell value=cell.next();
			if(value.getStringCellValue().equalsIgnoreCase("Testcases")) 
			{
				coloumn=k;			
				
			}
			k++;
			}				
				System.out.println(coloumn);
				// once the column is identified then scan entire test case column to identify purchase test case row
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) 
					{
						// after you grab purchase test case row= 
					Iterator<Cell> c=r.cellIterator();
						while(c.hasNext())
						{
							Cell c1=c.next();
							if(c1.getCellType()==CellType.STRING) {
							a.add(c1.getStringCellValue());
							}
							else
							{
	                         a.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
							}
						}
						
					}
				}
				
				
			}
		}
		return a;
		
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
				
	}

}
