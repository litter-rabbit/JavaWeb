### HTML 表单标签
    *作用：采集用户的输入的数据
        method:
            get:1. 请求参数会在地址栏显示
                2.请求的参数大小有限制
                3. 不太安全
            post:1. 请求参数不会显示在地址栏
                 2.大小没限制
                 3.较为安全
         *表单必须指明name属性
         
    *input标签:
        *type属性：
            1）text:
                *placeholder属性可以知道提示信息
            2）radio:
                1.多个单选，必须指定一样的name值
                2.一般要提供value属性，获取值
                3.checked 指定默认值
        *lable
            for属性可以与input的id对应，则点击lable，会让input获得焦点
            
### CSS
      选择器：
            id:#idname{}
            类：.classname{}
            元素：div{}
                优先级：id>类>元素
                
       扩展选择器：
            1.选择所有元素：*{}
            2.并集选择：选择器1，选择器2{}
            3.子选择器：选择器 选择器{}
            4.父选择器：选择器1>选择器2{}
            5.属性选择器：元素名称[属性名=“属性值”]{}
            6.伪类选择器：
                <a>
                    a:link{}
                    a:hover{}
                    a:active{}
                    a:vistied{}
### JavaScript
    *基本数据类型
        1）String
        2)boolean'
        3)number
        4)undefined
        5)null
        
     *特殊语法
        1）结尾可以以换行符，也可也分号结尾
        2） var 定义的是局部变量，不加var定义的是全局变量
        
    *基础对象
        *funtion对象
            1)属性：
                length
            2)特点
                1.返回值不用写，型参不用写
                2.定义一个相同的方法对象，会被覆盖
                3.js中，方法调用只与名称有关，与参数无关
                4.方法中有内置对象arguments,保存所有参数
        *Array对象
            1）创建
                1.var arr = new Array(1,23,3);
                2.var arr = new Array(默然长度)
                3.var arr = [1,2,3]
            2.特点
                1.长度是变化的
                2.可以保存任意类型
        *Date
            1.方法：
                getLocalString()
                getTime()获取与1970 1 1 零点的毫秒时间差
         
        *正则表达式对象
            1.单个字符[]
                如[a],[a-z0-9_] 
                    \d表示数字
                    \w表示[a-zA-Z0-9_]
                    
            2.量词符号
                ?:零次或者1次
                *零次或者多次
                +1次或者多次
                {m,n}m到n个
            *创建
                var reg = new RegExp("^\w{6,12}$")
                var reg =/\w^{6,12}$/
        *Global对象
            *方法
                1.decodeURL（）
                2.encodeURL（）
                3.decodeComponentURL（）
                4.encodeComponentURL（）
                对URL进行编码
                
                5.eval(string)将string转化为js代码执行
                6parseInt()
        *BOM对象
            1.windows对象
                方法：
                    1）alert()
                    2)prompt()
                    3)confirm()
                    
                 *定时调用
                    setTimeout(fun,3000)
                    setInteval(fun,3000)
            2.Location对象
                方法：
                    reload()
                    href属性
            3.history
                方法：
                    back()
                    forward()
                    go()
        *DOC对象
            1.获取元素
               getByElementId()
            2.创建元素
                createElement()
                
                
### XML
    *基本语法
        1.xml第一行必须为文档声明<?xml version="1.0"?>
        2.xml有且只有一个根标签
        3.属性值必须使用引号（单双都可以）
        4.区分大小写
    *组成部分
        1）文档声明
            1.格式<? 属性列表?>
            2.属性列表
                *version="1.0"必须有
                *encoding 默认是ISO-8859-1
                *standlone="yes" 是否依赖与其他文件
        *属性值唯一
        *文本
            *CDATA区:格式：<![CDATA[文本]]>
    *约束
        DTD
            *引入dtd文件到xml中
                *本地<!DOCTYPE 跟标签名 SYSTEM "dtd文件的位置">
                *<!DOUCTYPE 根标签名 PUBLIC “dtd文件名称” “dtd URL地址”>
                
        
    *JSoup
        quickstart
            1.导入jar包
            2.String path = ClassExample.class.getClassLoader().gerRerourse("example.xml").getPath();
            Document doucment = Jsoup.parse(new File(path,"utf-8");
            Elements elements=document.getElementByTag("name");
               
                    
### Servlet:
    概念：Servlet就是一个接口，定义Java类被tomcat识别的规则
    quick start：
        1.定义一个class类实现servlet接口
        2.实现servlet中的抽象方法
        3.配置servlet
      
            <servlet>
                <servlet-name>demo1</servlet-name>
                <servlet-class>com.java.web.hello<servlet-class>
            </servlet>
            <servlet-mapping>
                <servlet-name>demo1</servlet-name>
                <servlet-patern>/hello</servlet-patern>
            </servlet-mapping>
    执行原理：通过url路径找到对应的Java类名称，然后Class.forName()加载进内存
             之后cls.newInstance();然后调用cls.service();
             
             详细过程：
                1.tomcat根据url找到对应的类，生成实列，然后根据浏览器传递的reques参数创建
                    reque对象和response对象，然后将request对象和response对象传递给service()方法
                    。
             
    Servlet生命周期：init()一开始被调用，而且只会调用一次
                            1.<load-on-startup>值为正整数是服务器启动就会调用init(),负数不会。
                    service()之后被调用，可以执行多次
                    destroy()tomcat关闭是调用一次
                            1.只有在服务器正常关闭时才会调用destroy();
    Servlet3.0
        1.可以使用注解
            如@WebServlet(urlparttern="/demo")
                public class demo implements Servlet{
                           
                          public void init(){
                          
                          }
                          public void service(){
                          }
                          public void destroy(){};  
                
                }
                            
     Servlet体系结构
        1.Servlet - GenericServlet - HttpServlet;
        
        HttpServlet对http协议进行了封装，我们只需要实现doGet(),和doPost()
        
                                    
### Http
    1.0短链接每次请求之后会断开连接
    1.1:长连接，一直连接
    
    * 请求消息格式
        1.请求行
            *请求方式有7种
                get:参数在请求行中
                psot:参数在请求体中
        2.请求头 键名：键值
            Referer:
                *作用告诉服务器请求来自哪个页面
                    *防止盗链
                    *统计
        3.请求空行
        4.请求体
            *封装Post的参数消息
     reques对象
        1.获取请求行数据
            *如 GET /day/demo/name=xiaoming HTTP/1.1
            方法：
                1）String gerMethod()  :GET
                2)String getContextPath() /day
                3)String getServletPaht() /demo
                4)String getQueryString()   name=xiaoming
                5)String getRequestURI(): /day/demo
                         getRequestURL()?http://localhost/day/demo
                6)String gerProtocal() HTTP/1.1
                7)获取客户的IP地址
                   String gerRemoteAddr()   
            
        2.获取请求头
            1.String getHeader(String name)
            2.getHeaderNames();
            
        3.获取请求体(Post请求)
            BufferedReader br = requeset.getReader();
            br.readLine();
         获取参数通用方法
            1）getParametr(String name)
            2)String[] getParameterValues(String name)
            3)Enumeration<String> getParameter()获取所有参数名称
            4）Map<String,String[]> getParameterMap();
                
        中文乱码问题：
            psot方法的参数是通过流获取的，所以需要指定编码格式
            reques.setCharacterEncoding("UTF-8");
            
        2.请求转发：一种在服务器内部资源跳转的方式
            1.Request.getDispatcher(String uri);
            2.Requestdispatcher.forward(request,response)  
            
            *特点
                1.浏览器的地址栏不会发生变化
                2.只能访问内部服务器的uri
                3.只发送一次请求
                
         3.共享数据
            *代表一次请求的范围，用于转发资源共享
            *方法
                setAtribute(String name ,Onject obj);
                getAttribute();
                       
         4.ServletContext对象
            request.getServletContext()
            获取Application对象   
        
                  
    response对象
        1.数据格式
            1）响应行
                状态码：
                    1XX:服务器接收没有完成，询问客户端
                    2xx:成功
                    3xx:302(重定向) 304（访问缓存）            
                    4xx:客户端错误
                        *404没有对应的资源
                        *405请求没有对应的doXxx()
                    5xx:服务器内部错误
                    
            2）响应头：
                content-type：告诉浏览器的编码格式
                content-disposition:in-line默认值
                                    attachment：以附件形式打开
        2.设置数据
            1.设置相应行
                1）setStatus(int sc)
            2.设置响应头
                1）setHeader(String name,String value)    
            1.设置响应体：
                1.获取输出流
                    字符输出流：PrintWtiter getWriter()
                    字节输出流： ServletOutputStream getOutputSteam()
                                 
        3.重定向
            1.设置状态码         
            2.设置响应头location
                    这两步相当与response.sendrRedirect("");
                  
             特点：
                1.重定向地址栏是发生变化的
                2.可以访问外部的资源
                3.重定向是两次请求
                
        4。路径
            绝对路径
                1）给服务器使用不需要加虚拟目录 转发
                2）客户端需要加虚拟目录    重定向
        5.中文乱码问题
            response.setContentType（"text/html;utf-8"）
            
    ServletContext对象
          获取：
                通过request或者HttpServlet
        1.功能
            1）获取mime类型
            2）域对象
                所有用户都可以共享数据
                 setAttrubute()
            3）获取服务器路径   getRealPath();
                *wbe目录下         
                    getRealPaht("/example.properties")
                *scr下
                    getRealPath("/WEB-INF/classes/example.properties")
              
                   
###CookieSession

    *Cookie
        1.quickstart
            1)创建cookie
                new Cookie(String name,String value)
            2)发送Cookie
                response.addCookie(Cookie cookie)
            3)获取Cookie
                Cookie[] request.getCookies()
    
        2.保存时间
            1.默认情况，浏览器关闭之后就被销毁
            2.持久化保存
                *setMaxage(int seconds)
                    seconds 为负数时等于默认情况
                    secounds 正数表示存活多少秒
                    seconds 为0表示删除cookie
                    
         3.共享问题
            1。同一服务器
                同一个服务器类的多个项目是不能共享cooki的
                如果要共享需要设置setPath("/");
             2.不同服务器
                需要设置一级域名相同就可以cookie共享
                    setDomain("baidu.com");
         4.作用特点
            1.cookie一般用于少量不太敏感的数据
            2.在不登录的情况下，完成对用户的识别
            
    *Session
        概念：在一次会话中多次共享数据，将数据保存在服务端HttpSession
        quickstart;
            1.获取Session
                request.getSession();
            2.使用
                setAttribute()
                getAttrrubute();
        *细节：
            1.默认情况下当客户端关闭后，再次连接时，sesssion是不同的
                所以需要在cookie中设置JSESSIONID的值。
                
            2.服务器关闭之后Session都会被销毁
                   *Session的钝化
                        *在服务器关闭之前将Session对象序列化保存在work目录下
                        
                   *Session的活化
                        *在服务器启动时读取Session.ser把session对象加载进内存中
                       ideal无法完成，需要tomcat目录下完成
                       
        *什么时候被销毁
            1.服务器关闭
            2.session对象调用invalidate（）
            3.默认失效时间为30分钟
                可以在web.xml中更改
                
        
                 
    
         
                                
### JSP
    1.原理：
        本质上就是一个Servlet类，当jsp被访问时，会被转化成java类，继承与HttpBase
    2.脚本
        *<% 代码 %> 
            定义在service（）方法中，service可以写什么，里面就可以写什么                              
        
        *<%! 代码 %>
            定义在类的成员变量中，成员变量可以写什么，他就可以写什么
        
        *<%= 代码%>    
                输出语句，相当于response.write()
                
    3.JSP内置对象
        *request
        *response
        *out:字符输出流对象
            与respnose.getWrite区别
                服务器会先寻找response的缓冲区内容打印出来，之后再打印out的缓冲区内容
                  
            
                 
                
                         
         

          
                    
         