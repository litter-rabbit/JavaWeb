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
            4.父选择器：选择器1<选择器2{}
            5.属性选择器：元素名称[属性名=“属性值”]{}
            6.伪类选择器：
                <a>
                    a:link{}
                    a:hover{}
                    a:active{}
                    a:vistied{}
                    
         