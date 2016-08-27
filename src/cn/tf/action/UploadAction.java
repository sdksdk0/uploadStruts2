package cn.tf.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport{
	private String name;
	private File photo;   //类型是file
	private String photoFileName;  //类型字符串
	private String photoContentType;   //固定ContentType上传的文件类型
	
	public String upload(){
		System.out.println("以上传到file目录中");
		String rootStoreDirectory=ServletActionContext.getServletContext().getRealPath("/file");
		try {
			//FileUtils.copyFile(photo, new File(rootStoreDirectory,photoFileName));
			FileUtils.moveFile(photo, new File(rootStoreDirectory,photoFileName));
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

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
	
	

}
