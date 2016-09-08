package MyPackage;

import java.io.FileInputStream;

import header.XSSFCell;
import header.XSSFSheet;
import header.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;

	public  void setExcelFile(String Path, String Sheetname) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(Sheetname);
		} catch (Exception e) {
			throw (e);
		}
	}

	public  String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}
}
