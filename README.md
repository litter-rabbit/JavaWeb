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
               
             
                    
                    
                    
                 
                
                
                                
            
        
                 
                
                         
         

          
                    
         