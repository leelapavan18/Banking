package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Exceldataprovider extends ExcelDataReader {
	@DataProvider(name = "Data1")
	public Object[][] DataTransfor() throws IOException {
		String Filepath="C:\\Users\\lpkum\\OneDrive\\Desktop\\Banking Project\\BankIDPassword.xlsx";
		String Sheetname="Sheet1";
		return ExcelDataReader.getExcelData(Filepath, Sheetname);
	}
}
