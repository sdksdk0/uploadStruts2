package cn.tf.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Upload2Action extends ActionSupport {
	private String name;
	private File[] photo;
	private String[] photoFileName;
	private String[] photoContentType;
	public String upload(){
		try {
			
			for(int i=0;photo!=null&&i<photo.length;i++){
				
				String rootStoreDirectory = ServletActionContext.getServletContext().getRealPath("/files");
				FileUtils.moveFile(photo[i], new File(rootStoreDirectory,photoFileName[i]));//����
			}
			return SUCCESS;
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public File[] getPhoto() {
		return photo;
	}
	public void setPhoto(File[] photo) {
		this.photo = photo;
	}
	public String[] getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String[] photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String[] getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String[] photoContentType) {
		this.photoContentType = photoContentType;
	}

	

	
}
