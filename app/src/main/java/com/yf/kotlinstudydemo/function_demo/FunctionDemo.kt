package com.yf.kotlinstudydemo.function_demo

/**
 * FileName :  FunctionDemo
 * Author   :  zhizhongbiao
 * Date     :  2018/8/28
 * Describe :
 */


class FunctionDemo {


    /**
     * 函数的定义，用关键字fun
     * 括号内的是参数和参数的类型，
     * 括号往右的是函数返回的类型，
     * 当函数处于表达式时候，可以不用声明返回类型，让虚拟机自动判断，
     * 但是当函数被public修饰的时候，函数返回类型必须声明，
     * 函数无返回时候用Unit声明，类似Java中的void
     * 当函数无返回值时候可以省略返回类型Unit
     */

    fun funWithoutReturn(s: String): Unit {
        print("funWithoutReturn")
    }

    fun funWithoutReturnAndNoDeclare(s: String) {
        print("funWithoutReturn")
    }

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    /**
     * 不用声明返回类型
     */
    fun isEqualWithoutPublic(c: Int) = sum(1, 8) > c

    /**
     * 需要声明返回类型
     */
    public fun isEqualWithPublic(d: Int): Boolean = sum(48, 8) < d;


    /**
     * 可变参数函数
     * 可变参数用vararg 声明，如下
     */
    public fun varsFunction(vararg v:String)
    {
        for (e in v)
        {
            print(e)
        }
    }


}