package com.hamitmizrak.error;
import lombok.Data;

import java.util.Date;
import java.util.Map;
@Data

public class ApiResult {
    //Pırasa Vali MESC

    private String patch;
    private Map<String,String> validationErrors;
    private String message;
    private String error;
    private int status;
    private Date systemDate;





}
