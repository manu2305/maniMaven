package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderLogIn {
	public static Object[][] lData() throws EncryptedDocumentException, IOException{
		File f=new File("C:/Users/QSP1/eclipse-workspace/SeleniumMaven/XLfiles/loginDetailsDWS.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);		
		Sheet sheet=wb.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int colom=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[row][colom];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colom; j++) {
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
}
