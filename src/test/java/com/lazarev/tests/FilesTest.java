package com.lazarev.tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.lazarev.utils.Files.readTextFromPath;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FilesTest {

    @Test
    void assertTxtFile() throws IOException {
        String txtFilePath = "./src/test/resources/files/Example.txt";
        String expectedData = "Завтра будет пасмурно";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void assertExcelFile() {

    }

    @Test
    void assertPdfFile() {

    }

}
