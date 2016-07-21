#HttpServletRequest
***
###常用方法（获取请求参数）：
1. String getParameter(String name):根据请求参数的名字，返回参数值。<若请求参数有多个参数值，如（checkbox），则返回第一个提交的参数值。
2. String[] getParameterValues(String name):根据请求参数的名字，返回对应的参数数组。
3. Map getParameterMap():返回请求参数的键值对，key：参数名。value：参数值（String[]类型)
4. Enumeration getParameterNames():返回参数名对应的Enumeration对象，类似于ServletConfig（Servletcontext）。

###获取请求的URL
* 强制转换为借口HttpServletRequset
* HttpServletRequset中的方法getRequsetURI

###获取请求的方式
* HttpServletRequest中的方法getMethod