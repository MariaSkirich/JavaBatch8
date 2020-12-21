package com.syntax.class34;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutputFiles {
    public static void main(String[] args) throws IOException {
        String path1="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class34\\Credentials1.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path1);

        Properties properties=new Properties();
        properties.setProperty("phoneNumber", "111111");
        properties.store(fileOutputStream, "changing the phone number");
    }
}
