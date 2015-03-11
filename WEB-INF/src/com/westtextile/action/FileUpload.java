package com.westtextile.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.propertyeditors.PatternEditor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8439698596957321993L;
	private List<File> upload;
	private List<String> uploadFileName; // 文件名称    
	private List<String> uploadContentType; // 文件类型
	private String savePath;
	
	@Override
	public void addActionError(String anErrorMessage){
		 //判断是否是文件上传超过限制大小异常 
		 if (anErrorMessage.startsWith("Request exceeded allowed size limit")) {  
			 ActionContext.getContext().put("error", "上传的文件大小总共不能超过5M");
			 super.addActionError("上传的文件大小不能超过5M！");  
		   
		 } else { 
		 //如果不是文件上传大小异常则按原来的方法处理 
			 ActionContext.getContext().put("error", anErrorMessage);
		 super.addActionError(anErrorMessage);  
		}  
	}
	@Override
	public void addFieldError(String fieldName, String anErrorMessage) {
		// 判断是否是文件上传超过限制大小异常
		if (anErrorMessage.startsWith("File upload is too large to be uploaded")) {
			Pattern pattern=Pattern.compile("[^0-9,]");
			Matcher matcher=pattern.matcher(anErrorMessage);
			String bytesize=matcher.replaceAll("");
			ActionContext.getContext().put("error", "上传的文件大小不能超过"+bytesize+"bytes!");
			super.addFieldError(fieldName, "上传的文件大小不能超过"+bytesize+"bytes!");

		} else if (anErrorMessage
				.startsWith("CONTENT-TYPE NOT ALLOWED")) {
			ActionContext.getContext().put("error", "上传的文件类型只能为图片，文本!");
			super.addFieldError(fieldName, "上传的文件类型只能为图片，文本!");

		} else {
			// 如果不是文件上传大小异常则按原来的方法处理
			ActionContext.getContext().put("error", anErrorMessage);
			super.addFieldError(fieldName, anErrorMessage);
		}
	}	
    @Override
    public String execute() throws Exception {
        ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
        try {
			// 取得需要上传的文件数组
			List<File> files = getUpload();
			if (files != null && files.size() > 0) {
			    for (int i = 0; i < files.size(); i++) {
			    	String fileName=getSavePath() + "\\" + getUploadFileName().get(i);
			    	//create parent folders
			    	File uploadedFile=new File(fileName);
			    	if(!uploadedFile.getParentFile().exists()){
			    		uploadedFile.getParentFile().mkdirs();
			    	}
			        FileOutputStream fos = new FileOutputStream(fileName);
			        FileInputStream fis = new FileInputStream(files.get(i));
			        
			        byte[] buffer = new byte[1024];
			        int len = 0;
			        while ((len = fis.read(buffer)) > 0) {
			            fos.write(buffer, 0, len);
			        }
			        fis.close();
			        fos.close();
			    }
			}
			ActionContext.getContext().put("message", "上传成功！");
		} catch (Exception e) {
			ActionContext.getContext().put("message", "上传失败！");
			e.printStackTrace();
		}
        
        return SUCCESS;
    }



	public String getSavePath() {
		return savePath;
	}



	public void setSavePath(String savePath) {
		savePath=ServletActionContext.getServletContext().getRealPath(savePath);
		this.savePath = savePath;
	}



	public List<String> getUploadFileName() {
		return uploadFileName;
	}



	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}



	public List<String> getUploadContentType() {
		return uploadContentType;
	}



	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}



	public List<File> getUpload() {
		return upload;
	}



	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

}