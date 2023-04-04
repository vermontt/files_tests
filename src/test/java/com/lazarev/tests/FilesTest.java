package com.lazarev.tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;


import static com.lazarev.utils.Files.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FilesTest {

    @Test
    void txtSimpleTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/Example.txt";
        String expectedData = "Завтра будет пасмурно";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void xlsSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/file_example.xls";
        String expectedData = "Gender";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }

    @Test
    void pdfSimpleTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/sample.pdf";
        String expectedData = "And more text. And more text. And more text.";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }

}