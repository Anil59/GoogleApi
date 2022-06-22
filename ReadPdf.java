package com.pracrise;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class ReadPdf extends PDFTextStripper{
	 static List<String> lines = new ArrayList<String>();
	public ReadPdf() throws IOException {
	}
	
	//From downloaded file and set endpage
	
	public void read() throws IOException {
	
	try {
		File file = new File("F:\\sample.pdf");
		PDDocument document = Loader.loadPDF(file);
		System.out.println("Pages are "+document.getNumberOfPages());
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setEndPage(1);
        String allText = stripper.getText(document);
        System.out.println("DAta inside pdf is "+allText); 
    }
    finally {
        if( document != null ) {
            document.close();
        }
    }
	}
	
	
	}

