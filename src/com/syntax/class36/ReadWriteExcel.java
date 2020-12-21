package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteExcel {
    public static void main(String[] args) throws IOException {
        String inputFilePath="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class36\\TestFile2.xlsx";
        System.out.println(inputFilePath);
        String outputFilePath="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class36\\OutputData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream=new FileOutputStream(outputFilePath);

        XSSFWorkbook inputXssfWorkbook=new XSSFWorkbook(fileInputStream);//to manipulate xlsx
        XSSFWorkbook outputXssfWorkbook=new XSSFWorkbook();

        Sheet sheet=inputXssfWorkbook.getSheet("Sheet1");

        List<PersonInfo> personInfoList=new ArrayList<>();

        for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++){
            Row row=sheet.getRow(i);
            PersonInfo personInfo=new PersonInfo();
            personInfo.setFirstName(row.getCell(0).toString());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int) row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if(personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
            }


        }

        System.out.println(personInfoList);

        XSSFSheet outputSheet = outputXssfWorkbook.createSheet("OutputSheet");

        for (int i=0; i<personInfoList.size(); i++){
            XSSFRow row = outputSheet.createRow(i);
            String firstName = personInfoList.get(i).getFirstName();
            row.createCell(0).setCellValue(firstName);
            row.createCell(1).setCellValue(personInfoList.get(i).getLastName());
            row.createCell(2).setCellValue(personInfoList.get(i).getAge());
            row.createCell(3).setCellValue(personInfoList.get(i).getSalary());

        }
        outputXssfWorkbook.write(fileOutputStream);

    }
}
