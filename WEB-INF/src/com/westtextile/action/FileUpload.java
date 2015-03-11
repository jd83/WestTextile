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
	private List<String> uploadFileName; // �ļ�����    
	private List<String> uploadContentType; // �ļ�����
	private String savePath;
	
	@Override
	public void addActionError(String anErrorMessage){
		 //�ж��Ƿ����ļ��ϴ��������ƴ�С�쳣 
		 if (anErrorMessage.startsWith("Request exceeded allowed size limit")) {  
			 ActionContext.getContext().put("error", "�ϴ����ļ���С�ܹ����ܳ���5M");
			 super.addActionError("�ϴ����ļ���С���ܳ���5M��");  
		   
		 } else { 
		 //��������ļ��ϴ���С�쳣��ԭ���ķ������� 
			 ActionContext.getContext().put("error", anErrorMessage);
		 super.addActionError(anErrorMessage);  
		}  
	}
	@Override
	public void addFieldError(String fieldName, String anErrorMessage) {
		// �ж��Ƿ����ļ��ϴ��������ƴ�С�쳣
		if (anErrorMessage.startsWith("File upload is too large to be uploaded")) {
			Pattern pattern=Pattern.compile("[^0-9,]");
			Matcher matcher=pattern.matcher(anErrorMessage);
			String bytesize=matcher.replaceAll("");
			ActionContext.getContext().put("error", "�ϴ����ļ���С���ܳ���"+bytesize+"bytes!");
			super.addFieldError(fieldName, "�ϴ����ļ���С���ܳ���"+bytesize+"bytes!");

		} else if (anErrorMessage
				.startsWith("CONTENT-TYPE NOT ALLOWED")) {
			ActionContext.getContext().put("error", "�ϴ����ļ�����ֻ��ΪͼƬ���ı�!");
			super.addFieldError(fieldName, "�ϴ����ļ�����ֻ��ΪͼƬ���ı�!");

		} else {
			// ��������ļ��ϴ���С�쳣��ԭ���ķ�������
			ActionContext.getContext().put("error", anErrorMessage);
			super.addFieldError(fieldName, anErrorMessage);
		}
	}	
    @Override
    public String execute() throws Exception {
        ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
        try {
			// ȡ����Ҫ�ϴ����ļ�����
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
			ActionContext.getContext().put("message", "�ϴ��ɹ���");
		} catch (Exception e) {
			ActionContext.getContext().put("message", "�ϴ�ʧ�ܣ�");
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