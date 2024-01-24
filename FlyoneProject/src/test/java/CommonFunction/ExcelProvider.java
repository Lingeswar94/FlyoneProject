package CommonFunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelProvider {
	XSSFWorkbook workbook;
	static WebDriver driver;
	public ExcelProvider() throws IOException {
		File file = new File("./TestData/Flyone.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileInputStream);
	}

	public String getstringdata(String Sheetname, int Row, int colunm) {
		XSSFCell Celldata = workbook.getSheet(Sheetname).getRow(Row).getCell(colunm);
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(Celldata);
		return data;
	}
}
