package com.syntax.class36;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WhyTryCatch {
    public static void main(String[] args) throws IOException {
        String path="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class36\\TestFile2.xlsx";
        String backUpFile="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class36\\TestDataBackUp.xlsx";
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        } catch(java.lang.Exception e){
            System.out.println("File not found");
            FileInputStream fileInputStream=new FileInputStream(backUpFile);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        }

    }
}
