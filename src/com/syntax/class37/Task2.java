package com.syntax.class37;
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
public class Task2 {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class37\\GenderTest.xlsx";
        String maleOutputPath = "C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class37\\SortedTask.xlsx";
        String femaleOutputPath = "C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class37\\SortedTask.xlsx";
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream maleFileOutputStream = new FileOutputStream(maleOutputPath);
        FileOutputStream femaleFileOutputStream = new FileOutputStream(femaleOutputPath);
        XSSFWorkbook inputXSSFWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFWorkbook outputXSSFWorkbook = new XSSFWorkbook();

        Sheet sheet = inputXSSFWorkbook.getSheet("ReadData");

        List<MixedIndividuals> maleIndividualsList = new ArrayList<>();
        List<MixedIndividuals> femaleIndividualsList = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row rowData = sheet.getRow(i);
            MixedIndividuals mixedIndividuals = new MixedIndividuals();
            mixedIndividuals.setFirstName(rowData.getCell(0).getStringCellValue());
            mixedIndividuals.setLastName(rowData.getCell(1).getStringCellValue());
            mixedIndividuals.setAge((int) rowData.getCell(2).getNumericCellValue());
            mixedIndividuals.setGender(rowData.getCell(3).getStringCellValue().charAt(0));
            mixedIndividuals.setSalary(rowData.getCell(4).getNumericCellValue());

            if (mixedIndividuals.getGender() == 'M') {
                maleIndividualsList.add(mixedIndividuals);
            } else {
                femaleIndividualsList.add(mixedIndividuals);
            }
        }

        System.out.println(femaleIndividualsList);
        System.out.println(maleIndividualsList);

        XSSFSheet outputMaleSheet = outputXSSFWorkbook.createSheet("Males");
        for (int i = 0; i < maleIndividualsList.size(); i++) {
            XSSFRow row = outputMaleSheet.createRow(i);
            row.createCell(0).setCellValue(maleIndividualsList.get(i).getFirstName());
            row.createCell(1).setCellValue(maleIndividualsList.get(1).getLastName());
            row.createCell(2).setCellValue(maleIndividualsList.get(i).getAge());
            row.createCell(3).setCellValue(maleIndividualsList.get(i).getGender());
            row.createCell(4).setCellValue(maleIndividualsList.get(i).getSalary());
        }
        outputXSSFWorkbook.write(maleFileOutputStream);

        XSSFSheet outputFemaleSheet = outputXSSFWorkbook.createSheet("Females");
        for (int i = 0; i < femaleIndividualsList.size(); i++) {
            XSSFRow row = outputFemaleSheet.createRow(i);
            row.createCell(0).setCellValue(femaleIndividualsList.get(i).getFirstName());
            row.createCell(1).setCellValue(femaleIndividualsList.get(i).getLastName());
            row.createCell(2).setCellValue(femaleIndividualsList.get(i).getAge());
            row.createCell(3).setCellValue(femaleIndividualsList.get(i).getGender());
            row.createCell(4).setCellValue(femaleIndividualsList.get(i).getSalary());
        }
        outputXSSFWorkbook.write(femaleFileOutputStream);

    }

}
