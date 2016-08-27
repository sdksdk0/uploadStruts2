package cn.tf.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport{

	private InputStream inStream;
	private String filename;//文件名
	private int filelength;//文件长度
	
	public InputStream getInStream() {
		return inStream;
	}

	public void setInStream(InputStream inStream) {
		this.inStream = inStream;
	}

	public String download(){
		String filepath=ServletActionContext.getServletContext().getRealPath("/WEB-INF/classes/0.jpg");
		try {
			
			
			//截取文件名
			filename = FilenameUtils.getName(filepath);
			//IE
			filename = URLEncoder.encode(filename, "UTF-8");//火狐自己处理
			inStream = new FileInputStream(filepath);
			//文件长度赋值
			filelength = inStream.available();
			return SUCCESS;
		} catch (Exception e) {
			
			e.printStackTrace();
			return ERROR;
		}
		
	}
	
	
	
}
