package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DWSDataProviderLogin {
@DataProvider(name="loginData")
public Object[][] lData(){
	File f=new File("XLfiles//loginDetailsDWS.xlsx");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Sheet sheet=wb.getSheet("Sheet1");
	int row=sheet.getPhysicalNumberOfRows();
	int colom=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[row-1][colom];
	for (int i = 1; i < row; i++) {
		for (int j = 0; j < colom; j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
	return data;
}
}
