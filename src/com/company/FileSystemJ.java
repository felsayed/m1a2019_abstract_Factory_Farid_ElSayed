package com.company;

import Factory.AbstractFile;
import Factory.AbstractFileFactory;
import Factory.AbstractOrdinaryFile;
import Factory.LinuxOrdinaryFile;

public class FileSystemJ {

    public static void main(String[] args) {
        AbstractFileFactory fileFactory=AbstractFileFactory.getFactory();
        AbstractFile abstractFile=fileFactory.createAbstractFile();
        abstractFile.setCaption("File");
        abstractFile.open();

    }
}
