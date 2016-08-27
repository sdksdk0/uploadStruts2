package cn.tf.ongl;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo3 extends ActionSupport {
	private String username = "张索尼";
	public String execute() throws Exception {
		ActionContext ac = ActionContext.getContext();
		ac.getSession().put("p", "sp");
		ServletActionContext.getRequest().setAttribute("username", "李四");
		return SUCCESS;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
