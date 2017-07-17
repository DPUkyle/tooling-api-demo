package com.example.toolingapidemo;

import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;

@Component
public class GradleRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        GradleConnector gradleConnector = GradleConnector.newConnector()
                .forProjectDirectory(new File("."));
        ProjectConnection connection = gradleConnector.connect();
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            connection.newBuild()
                    .forTasks("hello")
                    .setStandardOutput(outputStream)
                    .run();
            String cmdLine = outputStream.toString(Charset.defaultCharset().toString());
            System.out.println(cmdLine);
        } finally {
            connection.close();
        }

    }
}
