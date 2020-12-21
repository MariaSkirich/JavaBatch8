package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class35\\TestFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("FirstPage");

        for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
            Row rowData = sheet.getRow(row);
            for (int j = 0; j < rowData.getPhysicalNumberOfCells(); j++) {
                System.out.print(rowData.getCell(j)+" ");
            }
            System.out.println();
        }
//        Cell cell=row.getCell(0);
//        String firstName = row.getCell(0).getStringCellValue();//getting the cell value in a String
//        String lastName = row.getCell(1).getStringCellValue();
//        String hobby = row.getCell(2).getStringCellValue();
//        int age = (int) row.getCell(3).getNumericCellValue();//casting to int because the method returns double value
//        int age1 = Integer.parseInt(row.getCell(3).getStringCellValue());


    }
}
