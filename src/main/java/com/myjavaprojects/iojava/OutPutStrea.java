package com.myjavaprojects.iojava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class OutPutStrea {
    public void writeFile() {
        String outputFile = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Helloooooo");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void readPdf() {
        File file = new File("test.pdf");

        try (PDDocument document = Loader.loadPDF(file)) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            System.out.println(text);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void writePdf() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("hello.pdf"));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Chunk chunk = new Chunk("Hello World", font);

            document.add(chunk);
            document.close();
        } catch (FileNotFoundException | DocumentException e) {

            e.printStackTrace();
        }

    }
}
