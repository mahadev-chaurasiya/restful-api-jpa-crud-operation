package com.mahadev.demojpacrudoperation.exception;

import lombok.Data;

import java.util.Date;

/**
 * @author MAHADEV CHAURASIYA
 */
@Data
public class ExceptionErrorResponse {
    private String description;
    private String message;

    private Date timestamp;
    private String statusCode;

    public ExceptionErrorResponse(Date timestamp, String statusCode, String message, String description) {
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.message = message;
        this.description = description;
    }
}
