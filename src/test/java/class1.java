import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class class1 {
    class1(){
        //default constructor
    }
    public static String readDataFromExcel(int row,int column) throws IOException {
        //resource file path
        String resourcePath="src/test/resources/input/Credential.xlsx";
        //sheet name
        String sheetName="Credential";

        FileInputStream fileInputStream=new FileInputStream(resourcePath);
        Workbook workbook1=new XSSFWorkbook(fileInputStream);

        Sheet sheet=workbook1.getSheet(sheetName);
        //Sheet sheet1=workbook1.getSheetAt(0);

        Row row1=sheet.getRow(row);
        if (row1!=null){
            Cell cell=row1.getCell(column);
            if (cell!=null){
                switch (cell.getCellType()){
                    case STRING:
                        return cell.getStringCellValue();
                    case NUMERIC:
                        return String.valueOf(cell.getNumericCellValue());
                    case BOOLEAN:
                        return String.valueOf(cell.getBooleanCellValue());
                    default:
                        return null;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) throws IOException {
           /* utility.ReadExcelFile readExcelFile=new utility.ReadExcelFile();
            String value1=readExcelFile.readDataFromExcel(1,0);
            System.out.println("The value of cell at given row and column is :"+value1);

            */

        String value1=readDataFromExcel(1,0);
        System.out.println("The value of cell at given row and column is :"+value1);
    }



}
