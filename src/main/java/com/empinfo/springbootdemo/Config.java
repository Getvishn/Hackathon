package com.empinfo.springbootdemo;

import ch.qos.logback.core.util.FileUtil;
import jakarta.annotation.PostConstruct;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.stream.Stream;

@Configuration
public class Config {

    @PostConstruct
    public void postConstruct() throws IOException {
        Stream<String> lines=null;
                String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if(null!= os && os.contains("windows")){
            lines= Files.lines(Path.of("C:\\tmp\\employees.json"));
        } else {
            lines= Files.lines(Path.of("/tmp/employees.json"));
        }

    }
}
