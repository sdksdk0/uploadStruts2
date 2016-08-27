package cn.tf.ongl;

import java.util.Calendar;
import java.util.Date;

import cn.tf.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class ActionDemo2 extends ActionSupport  implements ModelDriven<User>{
	
	public User user=new User();
	private String username;
	private String address;
	
	
	public String m3(){
		ActionContext  ac=ActionContext.getContext();
		ValueStack  vs1=ac.getValueStack();
		
		vs1.setValue("username","张三");
		
		ac.put("p", "ppp");
		return SUCCESS;
	}
	
	
	
	public String m2(){
		ActionContext  ac=ActionContext.getContext();
		ValueStack  vs1=ac.getValueStack();
		
		
		//setValue是一个ognl表达式,给栈顶对象设置属性值。
		vs1.setValue("username","张三");
		
		
		
		return SUCCESS;
	}
	
	
	
	
	
	public String m1(){
		ActionContext  ac=ActionContext.getContext();
		ValueStack  vs1=ac.getValueStack();
		
	/*	Map<String,Object> requestScope=(Map<String,Object>)  ac.get("request");
		ValueStack vs2=(ValueStack) requestScope.get("struts.valueStack");
		*/
		
		//把一个日期压入根
		Date d1=new Date();
		vs1.push(d1);
		
		//压入一个其他对象
		vs1.push("shit");
		//压入一个日期
		Calendar c = Calendar.getInstance();
		c.set(2016, 8, 27, 10, 38);
		Date d2 = c.getTime();
		vs1.push(d2);
	
		return SUCCESS;
		
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public User getUser() {
		return user;
	}





	public void setUser(User user) {
		this.user = user;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	@Override
	public String toString() {
		return "ActionDemo2 [user=" + user + ", username=" + username
				+ ", address=" + address + "]";
	}





	@Override
	public User getModel() {
		
		return user;
	}
	
	

}
