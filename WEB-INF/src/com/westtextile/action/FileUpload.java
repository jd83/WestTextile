package com.westtextile.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

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
    public String execute() throws Exception {
        ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
//        String absolutePath=ServletActionContext.getServletContext().getRealPath(""); 
        // 取得需要上传的文件数组
        List<File> files = getUpload();
        if (files != null && files.size() > 0) {
            for (int i = 0; i < files.size(); i++) {
            	//if folder not exist, create
            	String fileName=getSavePath() + "\\" + getUploadFileName().get(i);
            	File uploadedFile=new File(fileName);
            	if(!uploadedFile.getParentFile().exists()){
            		uploadedFile.getParentFile().mkdirs();
            	}
            	if(uploadedFile.length()>2097152){
            		this.addFieldError("upload", "上传文件大小不能超过2M！");
            	}
                FileOutputStream fos = new FileOutputStream(uploadedFile);
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