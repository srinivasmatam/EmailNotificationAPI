package com.verizon.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.controller.model.EmailNotificationServiceRequest;
import com.verizon.controller.model.EmailNotificationServiceResponse;


@RestController
@RequestMapping("EmailNotificationAPI")
public class EmailNotificationRestController {

	    @RequestMapping(value="/sendEmailNotification",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	    public EmailNotificationServiceResponse sendEmailNotification(@RequestBody EmailNotificationServiceRequest request) {
	    	EmailNotificationServiceResponse response=new EmailNotificationServiceResponse();
	    	response.setSuccess(true);
	        return response;
	    }
	    
	    @RequestMapping("/sendBulkEmailNotification")
	    public EmailNotificationServiceResponse sendBulkEmailNotification(@RequestBody EmailNotificationServiceRequest request) {
	    	EmailNotificationServiceResponse response=new EmailNotificationServiceResponse();
	    	
	        return response;
	    }
}
