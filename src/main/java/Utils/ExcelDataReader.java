package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {

        FileInputStream fs = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int totalRows = sheet.getPhysicalNumberOfRows();
        int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[totalRows - 1][totalCols];

        for (int i = 1; i < totalRows; i++) { // start from Row 1 (skip header)
            Row row = sheet.getRow(i);

            for (int j = 0; j < totalCols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = getCellValue(cell);  // store in 2D array
            }
        }

        workbook.close();
        fs.close();
        return data;
    }
    public static String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();

            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()); // removes decimal (.0)

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case FORMULA:
                return cell.getCellFormula();

            case BLANK:
                return "";

            default:
                return "";
        }
    }

}
