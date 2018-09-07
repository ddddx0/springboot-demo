package com.xxd.boot.bootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesTest {
/*
    private static String targetFile = "D://file/a.txt";

    public void openLocalFile(String fileName) {
        String bf = "";
        File file = new File(targetFile + fileName);
        try {
            BufferedInputStream inputStream =  new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D://file/b.txt"));
            byte[] buff = new byte[20];
            while (inputStream.read(buff, 0, buff.length) != -1) {
                outputStream.write(buff,0,buff.length);
                System.out.println(buff.toString());
            }
            System.out.println(bf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testMain() {
        openLocalFile("a.txt");
    }*/
}
