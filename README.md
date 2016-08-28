# uploadStruts2
通过struts2框架实现文件上传下载功能！
#OGNL表达式
对象图导航语言，struts2使用OGNL表达式做为默认的表达式语言。
支持普通对象的方法调用。

<!-- 相当于jstl中的c:out，作用是把value中的表达式的值输出到页面上 -->
    	<s:property  value="'abcdf'.length()"/> <br />
    	<s:property  value="'abcdf'.charAt(2)"/> <br />
    	
    	<s:property  value="@java.lang.Integer@MAX_VALUE"/> <br />
    	<s:property  value="@java.lang.Math@abs(-100)"/> <br />
    	
    	<!-- 创建List或者Map对象 -->
    	<s:radio  list="{'男','女'}"  name="gender"  label="性别"  /><br />
    	
    	<s:radio list="#{0:'女',1:'男' }"   name="姓名"></s:radio>
    	

##OGNL上下文

就是一个Map<String,Object>数据的中心,每次动作的请求，struts2框架都会为每个线程创建一个OGNL上下文对象，存放了所有的有关数据.


根中的数据:
<s:property value="username" />username是一个OGNL表达式,搜索根中所有对象的username属性，直到找到为止。

其他contextMap中的数据,
<s:property value="#session" />

用户发出一次动作请求时，Struts2框架每次都会产生ActionContext对象（引用了contextMap），ValueStack对象，同时还会实例化动作类。

##ActionContext和ValueStack
互相引用。


	private Map<String, Object> context:contextMap
	public Map<String, Object> getApplication():获取ServletContext中的所有Attributes
	public Map<String, Object> getContextMap()：获取contextMap的引用
	public Map<String, Object> getParameters()：获取请求参数的Map
	public Map<String, Object> getSession()：获取HttpSession中的所有Attributes
	public ValueStack getValueStack()：获得ValueStack对象的引用
	public Object get(String key)：从contextMap中根据key获得对象
	public void put(String key, Object value)：向contextMap中存放数据


#ValueStack
setValue:以#存在contextMap中，不以#开头，相当于设置栈中对象的属性（从栈顶到栈底).
