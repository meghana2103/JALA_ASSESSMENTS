import org.apache.poi.ss.usermodel.*;
import java.io.*;
public class ReadExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
        wb.close();
        fis.close();
    }
}