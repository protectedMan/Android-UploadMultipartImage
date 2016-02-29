package com.zs.action;

import java.awt.Graphics;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import freemarker.log.Logger;
import io.rong.models.FormatType;
import io.rong.models.SdkHttpResult;
import io.rong.utils.ApiHttpClient;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@Controller
public class GetToken extends  ActionSupport {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private String userID;
//	private String username;
//	public String getUserID() {
//		return userID;
//	}
//
//	public void setUserID(String userID) {
//		this.userID = userID;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//
//
//	@Action("/getToken")
//	public void login()  {
//		HttpServletResponse response = ServletActionContext.getResponse();
//		String key = "mgb7ka1nb0vrg";
//		String secret = "wPOOei4SHB2";
//
//		SdkHttpResult result = null;
//		try {
//			result = ApiHttpClient.getToken(key, secret, userID, username,
//					"http://aa.com/a.png", FormatType.json);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		String c = result.getResult();
//		try {
//			response.setContentType("text/json");
//			response.setCharacterEncoding("UTF-8");
//			response.getWriter().write(c);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		 System.out.println("查询任务输出：  " + c);
//	}
//	
//	
	private File[] file;
	private String description;
	public File[] getFile() {
		return file;
	}
	public void setFile(File[] file) {
		this.file = file;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Action("/upload")
	public void login()  {
		System.out.println("------"+Arrays.toString(file));
		System.out.println("------"+description);
	}
	
	
	
}
