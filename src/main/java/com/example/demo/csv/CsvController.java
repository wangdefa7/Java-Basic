package com.example.demo.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;

@Controller
public class CsvController {

    @GetMapping("/csv")
    public ResponseEntity<byte[]> csv() throws Exception {
        CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("请求域名", "源IP", "解析IP","时间","TTL",
                "请求次数","采样比","方向","请求类型","应答类型","权威应答标识","应答值","应答返回码",
                "来源城市","来源运营商","来源节点编码");
        File tempFile = File.createTempFile("vehicle", ".csv");
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        CSVPrinter csvPrinter = new CSVPrinter(new OutputStreamWriter(fileOutputStream), csvFormat);
        for (int i = 0; i < 10; i++) {
            csvPrinter.printRecord("q", "w", "e");
        }
        csvPrinter.flush();
        csvPrinter.close();
        fileOutputStream.close();
        FileInputStream fis = new FileInputStream(tempFile);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1)
        {
            bos.write(b, 0, n);
        }
        fis.close();
        bos.close();
        HttpHeaders httpHeaders = new HttpHeaders();
        String fileName = new String("测试.csv".getBytes("UTF-8"), "iso-8859-1");
        httpHeaders.setContentDispositionFormData("attachment", fileName);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> filebyte = new ResponseEntity<byte[]>(bos.toByteArray(), httpHeaders, HttpStatus.CREATED);
        return filebyte;
    }

}
