package com.yf.kotlinstudydemo.member_demo

/**
 * FileName :  MemberAndConstant
 * Author   :  zhizhongbiao
 * Date     :  2018/8/28
 * Describe :
 */
abstract class MemberAndConstant {

    /**
     * 变量的定义:主要是用var关键字，
     * 以下是一个变量的声明
     */

    var a: Int = 10;


    /**
     * 定义常量是：主要用用val关键字，类似Java中的final，
     * 以下是一个常量的声明
     *
     */

    val constantA: String = "hello kotlin !"

    /**
     * 值得注意的是：变量和常量都可以没有初始化值，
     * 但在使用之前必须要初始化，kotlin编译器支持自动转化类型，
     * 所以声明变量时候可以不用声明变量类型，但必须要为其初始化赋值，当为其赋值时候，编译器动态判断
     */


    var d = 1;


    /**
     * 字符串模板 ,
     * $关键字为引用的意思可引用变量
     * ${varName.fun()}表示引用变量varName调用方法fun的返回值
     */

    var f = 1;

    var s1 = "a is $f";


    var s2 = "${s1.replace("is", "was")},but now is $a";


    /**
     * null检查机制
     *
     * 类型后面加？表示该变量可为空
     */

    var age: String? = "23";

    /**
     * 如果age为空抛出空指针异常
     */
    val ages = age!!.toInt();


    /**
     * 判断是否为空，如果为空直接返回null
     */
    val ages1 = age?.toInt()

    /**
     * 判断是否为空，如果为空返回指定的值
     */

    val ages2 = age?.toInt() ?: -1;


    /**
     * 当一个引用可能为null时候，对应的类型声明必须明确地标记为可为null
     * ，比如
     */

    fun parseInt(s: String): Int? {
        return s?.toInt()
    }


    fun main(args: ArrayList<String>) {
        if (args.size < 2) {
            print("two integer expected at least")
            return
        }

        val x = parseInt(args[0])
        val y = parseInt(args[1])

        if (x != null && y != null) {
            print(x * y)
        }
    }


    /**
     * 类型检测以及类型转换
     */

    fun getStingLength(obj: Any): Int? {
        if (obj is String) {
            //做过类型判断后，obj会被系统自动转换成为String类型
            return obj.length
        }

        //但此处的obj没被转换
        return null
    }

    fun getStingLength2(obj: Any): Int? {
        /**
         * 其中is 的否定为!is
         */

        if (obj !is String) {
            return null
        }

        //此处的obj会被转换成String的
        return obj.length
    }

    fun getStringLength(obj: Any): Int? {
        //在“&&”运算符的右侧，“obj"的类型会被自动转换为String类型
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }


    /**
     * Kotlin表示区间的方式为：in+".."这一操作符形式的rangTo函数，
     * 区间是为了任何可比较类型定义的，但对于整数型原生类型，它有一个优化的实现
     */

    fun quJianDemo(i:Int) {
        for (i in 1..4)
        {
            //打印1234
            print(i)
        }



        for (i in 4..1)
        {
            print(i)//什么都不打印
        }


        if (i in 1..10)//等价于 1<=i&&i<=10
        {
            print(i)
        }

        //用step关键词代表步长
        for (i in 1..4 step 2)
        {
            print(i)//输出13
        }

        for (i in 4 downTo 1 step 2)
        {
            print(i)//打印42
        }


        for (i in 1 until 10)//表示i in [1,10)排除了10
        {
            print(i)
        }

    }

}