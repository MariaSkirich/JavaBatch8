package com.syntax.class27;

public abstract class File {
    public abstract void open();
    public void edit(){
        System.out.println("I can edit any file");
    }
    public void close(){
        System.out.println("I can close any file");
    }
}
class Java extends File{

    @Override
    public void open() {
        System.out.println("We need Notepad++ to open Java files");
    }
}
class WordFile extends File{

    @Override
    public void open() {
        System.out.println("Microsoft Word helps to open .docx files");
    }
}
class PDFFile extends File{

    @Override
    public void open() {
        System.out.println("Adobe Viewer is necessary to open PDF files");
    }
}
class callFile{
    public static void main(String[] args) {
        File[] allFiles={new Java(), new WordFile(), new PDFFile()};
        for (File file:allFiles){
            file.open();
            file.close();
            file.edit();
        }
    }
}
