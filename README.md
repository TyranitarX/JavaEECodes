#Servelt开发环境设置
***
####EE版本开发基本流程（Eclipse）
1.把开发选项切换到JavaEE
2.可以在Window->Show View 中找到 Package Explorer,并把其拖拽到开发区的左边粗体
3.在Servers面板中新建Tomcat服务器，一定要关联到Tomcat安装的根目录
4.新建一个Dynamic Web Project ，其中Target Runtime  需要选择 Tomcat6.0
5.开发Java WEB应用
6.可以通过run on server 来运行 WEB项目.
####SE版本开发基本流程（Eclipse）
1.新建JavaSE项目
2.右键项目，导入TomCat中servelt-api.jar包
3.在项目下建立web文件夹，在web文件夹下建立WEB-INF文件夹，并在WEB-INF文件夹下创建classes文件夹
4.右键项目选择Properties，点击左边的JAVA Build Path，选择Source选项，更改output folder为WEB-INF下的classes文件夹
5.WEB-INF文件夹创建web.xml配置文件
6.打开tomcat根目录中conf文件夹中的server.xml，在   `<Host name="localhost"  appBase="webapps"
        unpackWARs="true" autoDeploy="true"> `语句之后
        添加`<Context path="/" docBase="E:\\EclipseWorkspace\\JAVAServlet\\web" debug="0" reloadable="false"/>`
        其中的路径为你的WEB项目的web文件夹的路径。
7.开发 JAVA WEB应用
8.通过http://127.0.0.1/ tomcat服务器与xml文档中配置的url-pattern来访问所开发的应用