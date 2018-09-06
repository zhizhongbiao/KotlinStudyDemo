package com.yf.kotlinstudydemo.member_demo

/**
 * FileName :  ConditionControl
 * Author   :  zhizhongbiao
 * Date     :  2018/9/5
 * Describe :
 */
class ConditionControl {


    /**
     * 条件控制
     */

    //if
    fun conditionDemo1(a: Int) {
        var max = a;
        var b = 2;

        if (b > a) {
            max = b
        }
    }

    //if-else
    fun conditionDemo2() {
        var a = 1
        var b = 2
        var max: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }
    }


    /**
     * if -else可以作为表达式,
     * 给max赋值
     */

    var a = 1;
    var b = 2

    var max = if (a > b) a else b

    /**
     * 给min赋值
     */
    var min = if (a > b) {
        a
        print("choose a")
    } else {
        print("choose b")
        b
    }


    /**
     * if-else语句可以用作表达式，
     * 意味着我们可以用if-else语句来代替Java中的？true：false这一三元操作符，
     * 如下列
     */

    var c = if (true) a else b

    /**
     * if-else if-else 用法和Java一样
     */

    fun main(array: Array<String>) {
        var x = 0
        if (x > 0) {
            print("x=$x")
        } else if (x === 0) {
            print("x=0")
        } else {
            print("x<0")
        }
    }

    /**
     * if 语句结合区间使用
     */

    fun conditionDemo(a: Int) {
        if (a in 1..10) {
            print("1<=a<=10")
        }
    }

    /**
     * when(参数)关键字：有点像Java中switch语句，将参数和分支进行比较
     * ，与when参数相匹配的分支将会被执行，如果分支都不匹配的话，
     * 将执行else 分支，else有点像Java的default分支
     * ，当不同分支有相同的处理时候，可以将这些分支集中一起处理
     * ，具体做法就是将分支的值放在一起，并用逗号隔开
     *
     * 注意：与Java不同的是，when语句既可以作为语句使用，
     * 也可以用作表达式使用，二返回值就是相匹配的分支的值
     *
     */


    fun whenDemo(x: Int) {
        when (x) {
            1 -> print("x=1")
            2 -> print("x=2")
            3 -> print("x=3")
            else -> {
                print("x既不是1也不是2更不是3")
            }
        }
    }


    /**
     * 多个分支有着一样的处理，将其集中一起处理
     */
    fun whenDmeo2(x: Int) {
        when (x) {
            1, 2 -> print("x小于3")//此处集中处理了1,2分支
            3 -> print("x=3")
            else -> {
                print("x大于3")
            }
        }


        /**
         * 将when语句作为表达式使用
         */
        var y = when (2) {
            1 -> print("1")
            2 -> print("2")
            else -> {
                print("else")
            }
        }
    }


    /**
     * when语句和关键字in配合区间使用
     */
    fun whenDemo3(x: Int) {
        when (x) {
            in 1..9 -> {
                print("1<=x<=9")
            }
            !in 12..90 -> print("不在此区间")
            else -> {
                print("none of above")
            }
        }
    }

    /**
     * when结合is 判断该值是否是特定类型，
     * 注意当判定结果为true时候会发生自动转换，
     * 所以直接当做该值为该特定类型处理
     */

    fun whenDemo4(x: Any) {
        when (x) {
            is String -> print("x.length = ${x.length}")
        }
    }

    /**
     * when语句也可以用来替代if-else if-else,而此时很when不用参数，
     * 每个分支都是一个简单的布尔值表达式，当该表达式为true时候，执行该分支
     */
    fun whenDemo5(x: String) {
        when {
            x.isEmpty() -> print("x is empty")
            x.isBlank() -> print("x is blank")
            else -> print("x is funny")
        }
    }


    /**
     * when语句和in关机字，判断集合中是否存在某一元素
     */

    fun whenDemo6(x: String) {
        var items = setOf<String>("apple", "banana", "kiwi")
        when (x) {
             in items -> print("x is in the items")
            else -> print("x is not in there")
        }
    }

}