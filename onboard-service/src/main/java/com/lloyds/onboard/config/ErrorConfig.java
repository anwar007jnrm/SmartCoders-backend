package com.lloyds.onboard.config;

import com.lloyds.onboard.exception.ErrorDetails;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "error-config")
public class ErrorConfig {

    private List<ErrorDetails> errorDetails;

}