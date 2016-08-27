package cn.tf.ongl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo1 extends ActionSupport {
	
	public String  m1(){
		//获取ActionContext的实例
		ActionContext ac = ActionContext.getContext();
		ac.getApplication().put("p", "ap");//相当于调用ServletContext.setAttribute("p","ap")
		ac.getSession().put("p", "sp");//相当于调用HttpSession.setAttribute("p","sp")
		ac.put("p", "ppp");
		
		return SUCCESS;
	}

}
