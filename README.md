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
        分类：
            *域对象
                1.PageContext pageContext 当前页面共享数据，获取其它内置对象
                2.HttpServletRquest request 一次请求访问多个资源共享数据
                3.HttpSession session 一次会话多个请求
                4.application ServletContext 所有用户共享数据
         
                  
                  
    4.指令
        作用：配置jsp页面，导入资源文件
        格式：<%@ 属性名称=“属性值”  %>
        分类：
            1.page:配置页面的，如格式，缓冲区大小
                1.contentType设置mime,和jsp编码格式
                2.import 导入java包
                3.errorPage：发生异常后跳转到指定的页面
                4.iserrorpage:表示是否是错误页面
            2.include：页面包含的。导入页面资源文件
            
            3.taglib：导入jstl包
    5.注释
        1.html注释
            <!-- -->
        2.jsp注释
            <%-- --%>




###EL表达式
    1。语法 ${}
    2。jsp中默认值支持el表达式的，要忽略它可以在配置isElignored=true;
        或者\${}
    3.运算符：
        1.算术：+ - 等 
        2.空运算符 empty ：用于判断字符串，集合，数组，是非为null
            
    4.获取值
        1.语法：
            ${域名.键名}
                域名：
                    pageScope
                    requestScope
                    sessionScope
                    applicationScope
            ${键名} 表示从最小的域中依次查到，找到为止
             
            
        2.获取对象
             普通对象  
            1.${域名.键名.属性名}（属性名就是对象对应的get方法名称去除get;)
              List对象
            1.${域名.键名[索引]}
               Map对象
            1.${域名.键名.key}
    4.动态获取虚拟目录
        ${pageContext.request.contextPath}
                            
                        
### JSTL
    1.if标签
        1.test属性必须要，接受一个boolean
            如<c:if test="${requestScope.number!=0}">
                <h1> ${number}为奇数</h1>
             </c:if>
    2.choose标签 ：相当于switch语句
    3.foreach标签
        属性：begin：
             end:
             var：
             step：步长
             varStatus:循环对象
             
             
             
             
### Filter
    qucikstart:
        1.定义一个类，实现filter接口
        2.配置
        3.放行doFilter(req,resp);
        
        
    生命周期：
        服务器启动时，创建Filter对象，同时调用init()方法
        访问页面时，调用doFilter()
        服务器关闭时调用destory（）
        
        
    拦截路径：
        1.具体资源：/index。jsp
        2.拦截目录 /user/*
        3.后缀名：*.jsp
        4拦截所有资源 /*
    拦截方式：
        *设置dispatcherTypes属性
            1.REQUEST 默认值，浏览器直接访问
            2.FORWARD :转发访问资源
            3.INCLUDE:包含访问资源
            4.ERROR:错误跳转资源
            5.ASYNC:异步访问资源
    拦截顺序：
        注解配置下：
            同样的拦截路径安装类名小的先执行
         web.xml下：
            同样的拦截路径安装谁在上面谁先执行
            
        代理模式：
            动态代理:
                1.动态代理
                
            
                   
### JQuery

    1。基本语法
        var div1 = $("选择器")；
        div1.html()
        
    2.js对象和jq对象转化
        js ->jq对象：$(div1);
        jq ->js对象 jq对象[索引];
        
        
    3.选择器
        1.基本语法
            1.事件绑定
                    $("#button").click(funtion(){
                    }) 
            2.入口函数
                $(funtion(){
                    
                })
                可以定义多次
                与window.onload(funtion(){})只能定义一次，后面的覆盖前面定义的
            3.$("#id").css("backGroudColor","pink");    
        分类：
            1.基本选择器
                1）标签选择器：$("html标签") 
                2）id选择器：$(“#id”)
                3)类选择器：$(”.class“)
                4)并集选择器：$(”.class,#id,div“ );
                
            2. 层级选择器
                1）$(div span)div标间下的所有span标签
                2）$(div >span)div下的儿子span标签
            3.属性选择器
                1）选着有属性id,而且属性值包含“te”
                    $("div[id][title*='te']")
                        ^=：以什么开头
                        $=：以什么结尾的属性值
            4.过滤选择器：
                1）$("div:first")选择第一个       
                2）$("div:last")最后一个       
                3）$("div:not(.one)")不包含class属性为one的       
                4）$("div:eq(3)")等于3的       
                5）$("div:lt(3)")小于3 gt(3)大于3       
                6）$("div:even")偶数       
                7）$("div:odd")奇数       
                8）$("div:header")获取标题元素       
                9）$("div:first")
            5.表单过滤器
                1.enable
                2.disable 
                3.checked
                4.selecked
                
    4.DOM操作
        1.内容操作
            1.html()
            2.text()
            3.val()
        2.属性操作
            1.attr():获取/设置元素值
            2.removeAttr()
            3.prop();获取/设置元素值
            4.removeProp()
            *attr和prop区别：
                1.如果操作的时固有属性，建议使用prop()
                2.如果时自定义属性，建议使用attr():如有些selecked和option无法获取到
                
                    
            对class操作：
                1.addClass()
                2.removeClass();
                3.toggleClass();
                                      
            CRUD操作:
                1.a.append(b)添加到内部    
                2.a.prepend(b);
                3.a.after(b)平级
                4.a.befroe(b)
                
                a.empty()子元素删除
                a.remove()删除所有
    5。动画
        1，显示与隐藏
            1.show(speed,[easing],fun) speed有slow,normal,fast,也可以自定义时间，
                                        easing::默认时swing，可以改成匀速的linear
            2.hide
            3.toggle
            4.slideUp
            5.slideDown
            6.fadeIn
            7.fadeOut
            8.fadeToggle
            
        2.遍历
            1.$(#id).each(fun(index,element){})
            2.for(li fo citys){}
            
    6.事件绑定
        1.jq对象.事件方法（fun(){}）
            *如果没有fun()则会触发浏览器默认方法
        2.on/off
            jq对象.on("事件名称"，fun(){})                               
            jq对象.off("事件名称")
        3.toggle 需要引入插件
            jq对象.toggle(fun1,fn2,fn3)依次调用，没有参数默认解绑所有事件
           
    6.插件
        1.对象增强
        $.fn.extend({
                方法名：function(){
                        this.prop()    
                }
        })；
        2.全局增强
         $.extend({
            方法名：function(){
                
            }
         });
### AJAX

       1.实现方式
            $.({
                url:"ajaxServlet11",
                type:"POST,
                data:{"username":"xiao","age":23},
                success:funtion(data){       data时服务器返回的response数据
                    
                }
                error:function(){
                
                }
                dataType:设置接受的数据格式
            
            });
            
            或者
                $.get(url,data,fun,type);
                $.post(url,data,fun,type); 
    
### JSON
    概念：保存对象
    1.语法
        1.基本规则
            多个键值都好隔开
            键名可以加引号，也可以不加
    2.Java转化为JSON
        1.导入jackson相关的jar包
        2.创建jackjson核心对象，objectmapper
        3.调用objectmapper相关方法
        
        *注解
            @JsonIngnore
            @JsonFormart(pattern="yyyy-MM-dd")
        
        复杂对象:
            List转化为一个数组
            Map:转化为普通的json对象
     中文乱码问题：
        1.在$.get()中指定json数据格式
        2.response.setContentType("application/html;charset=utf-8");
        
                
            
### Redis
    1.数据格式
        key ,value
           key是字符串
           value:
                1.字符串
                2.hash  相当于map
                3list  相当于linklist
                4.set
                5.sortedset
    2.基本命令
        *通用命令：
            key *获取所有key
            type key 查看数据类型
    
        1.string类型数据
            1.存储：set key value
            2.获取 get key
            3.删除 del key
        2.hash类型
            1.存储：hset hashname key value
            2.获取 hget hashname key
                    1.hgetall hashname
            3.删除 hdel key hashname 
            
        3.list类型
           *存储
            1.lpush key value
            2.rpush key value
           *获取
            1.lrange key start end
           *删除
            1.lpop key
            2.rpop key
         4.set类型
            *存储
                1.sadd key value
            *获取
                1smembers key              
            *删除
                1.srem key value
                             
         5.sortedset类型
            *存储 zadd key score value
            *获取 zrange key start end
            *删除 zrem key value
            
    3.持久化
        *RDB模式
        1.save 900 1 在900秒内，数据改变了1次则保存一次
        2.save 300 10   在300秒内，数据改变了10次则保存一次
        *AOF模式
            开启：appendonly yes
            
            appendfsync always 每一次操作都持久化
            appendfsync everysec 每隔一秒
            appendfsync no 不进行持久化
            
        
    4.jedis
        *quickstart                            
            Jedis jedis = new Jedis（“localhost”，6379）；
            Jedis.setex（“key”，20,“value”）；
            Jedis.close（）
        *连接池
            JedisPool jedispool = new JedisPool(config,"localhost",6379)；
            Jedis = jdesipool.getResourse()
            
            
            
### Maven
    1.常用命令
        mvn clean 删除target目录
        mvn compile 编译源代码
        mvn test 编译测试代码
        mvn package 生成war包和编译test，和src
        mvn installl 编译所有，在仓库中生成本地bao
        
    2.生命周期
    编译，测试，打包，安装，发布deploy
    
                        
         
         
         
                 
                
                
                
                
    
                
                
     
        
        
                     
                 
            
                  
                 
                
                         
         

          
                    
         