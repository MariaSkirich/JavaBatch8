package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class35\\TestFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("SecondPage");
        Row row=sheet.getRow(1);
        Cell cell= row.getCell(2);
        System.out.println(cell.toString());
        cell.setCellValue("Diana");
        System.out.println(cell);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);




    }
}
