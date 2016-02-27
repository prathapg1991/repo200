package pack123;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test() throws BiffException, IOException {
	 
	  
	  
	  File src=new File("D:\\MOVIES\\input.xls");
	  Workbook  wb=Workbook.getWorkbook(src);
	  Sheet sh1=wb.getSheet(0);
	  Cell c=sh1.getCell(1,1);
	  String data=c.getContents();
	  System.out.println("data is "+data);
	  
	  
  }
}
