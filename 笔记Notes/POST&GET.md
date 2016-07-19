#POST&GET请求
***
####**使用Get请求传递参数：**
1. 在浏览器地址栏中输入某个URL地址或单击网页上的一个超链接时，浏览器发出的HTTP请求消息的请求方式为GET。
2. 如果在网页中的<form>表单元素的method 属性被设置为了“GET”，浏览器提交这个FORM表单时生成的HTTP请求消息的请求方式也为GET。
3. 使用GET请求方式给WEB服务器传递参数的格式：http://www.xxxx.com/counter.jsp?name=xxx&password=xxx。
4. 使用GET方式传送的数据量一般限制在1KB以下。

####**使用POST方式传递参数：**
1. POST 请求方式主要用于向WEB 服务器端程序提交FORM表单中的数据：form表单的method设置为POST
2. POST 方式将各个表单字段元素机器数据作为HTTP消息的实体内容发送给WEB服务器，传送的数据量比使用GET方式传送的数据量大得多。