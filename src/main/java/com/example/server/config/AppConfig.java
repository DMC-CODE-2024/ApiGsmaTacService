package com.example.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${file.path:#{null}}")
    private String path;

    @Value("${file.name:#{null}}")
    private String fileName;

    @Value("${eirs.alert.url}")
    String alertUrl;

    public String getPath() {
        if (this.path == null || this.path.equals("${file.name}"))
            throw new IllegalArgumentException("File Path must be configured at the server.");
        return path;
    }

    public String getFileName() {
        if (this.fileName == null || this.fileName.equals("${file.name}"))
            throw new IllegalArgumentException("File Name must be configured at the server.");
        return fileName;
    }

    public String geturl() {
        if (this.alertUrl == null || this.alertUrl.equals("${eirs.alert.url}"))
            throw new IllegalArgumentException("eirs.alert.url  must be configured at the server.");
        return alertUrl;
    }


}