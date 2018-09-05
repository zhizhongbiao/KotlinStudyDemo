package com.yf.kotlinstudydemo.member_demo

/**
 * FileName :  StringDemo
 * Author   :  zhizhongbiao
 * Date     :  2018/9/5
 * Describe :
 */
class StringDemo {


    /**
     * 字符串，和Java一样。String是不可变的，
     * 方括号[]语法可以很方便的获取字符串中的某一字符，
     * 当然也可以用for来遍历字符串
     * 如下例子
     */

    fun stringDemo(str: String)
    {
        //表示遍历字符串
        for (c in str )
        {
            println(c)
        }
    }


    /**
     * Kotlin支持三个引号"""括起来的多行字符串
     * 比如：
     */

    fun stingDemo2()
    {
        val  text="""
            jsdkfjldskjfkl
            sdfjdsklfjkl
            sdjfkldsjf
            """
        print(text)//打印出来前面有空格
    }

    /**
     * String可以用trimMargin()去掉多余的空格，
     * 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
     */

    fun stingDemo3()
    {
        val  text="""
            |jsdkfjldskjfkl
            |sdfjdsklfjkl
            |sdjfkldsjf
            """.trimMargin()
        print(text)//打印出来前面有空格
    }

    /**
     * 字符串模板：即字符串和结果合并输出，
     * 当字符合并的是变量、常量时候用美元符$开头,
     * 当字符合并的是函数结果返回值，此时用${有返回值的函数的调用}括起来
     */

    fun stringDemo4()
    {
        val i=19;
        print("i=$i")//输出为i=10

        val str="I love you"
        print("$str ${str.length} year" )//输出I love you 字符串的长度 year

    }

    /**
     * 当你需要$作为字符串输出时候，因为$符号不支持反斜杠转义，
     * 所以将$作为字符Char类型输出，如下列
     */

    fun stringDemo5()
    {
        print("${'$'} 9.99")//输出$9.99
    }


}