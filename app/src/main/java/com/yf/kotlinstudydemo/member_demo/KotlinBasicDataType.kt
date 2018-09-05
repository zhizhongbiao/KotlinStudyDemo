package com.yf.kotlinstudydemo.member_demo

/**
 * FileName :  KotlinBasicDataType
 * Author   :  zhizhongbiao
 * Date     :  2018/9/5
 * Describe :
 */
class KotlinBasicDataType {


    /**
     * 不同与Java，Kotlin的基本数据类型为
     * Byte、Short、Int、Long、Float、Double,
     * Char 不是一个数值类型，是属于一个独立类型
     */

    val a: Byte = 1

    val b: Short = 2;

    val c: Int = 3

    val d: Long = 4L//Long类型用大写的L结尾

    val e: Float = 5f//Float类型后面用f结尾

    val f: Double = 123.5 //支持传统的写法比如123.5e10

    val g: Double = 123.5e10


    /**
     * 数字值可以用下划线来隔分，使其更容易读
     */

    val oneMillion = 1_000_000


    /**
     * 两个数据比较，Kotlin中没有基本数据，全是对象，基本数据都被封装成对象了
     *
     * 两个对象比较是否相等时候用==，比较数值用====
     */


    var h = f == g//这里比较的是对象是否相同，地址相同和数值相同则对象相同

    var I = f === g//这里比较的是数值是否相同

    /**
     * 因为Kotlin会自动为每一个变量封装成一个对象，所以数据之间基本是不能自动转换类型的
     * ，但是有些特许情况是可以自动转换类型的，但更多的时候我们是显示区转换用toInt()、toDouble()..等方法
     */

    val j: Byte = 1;

//    val k:Int=j;  这是不行的，会报编译错的

    val o: Int = j.toInt()//强制转换

    //特殊情况下，也是存在自动转换
    val p = 8L + 4//Long+Int=>Long


    /**
     * 对于Int和Long类型，还有一些列的位操作符，可以使用，分别是
     * shl(bits)
     *
     */

    var aa = 6.shl(2)//左移两位，shl(位数)相当于Java<<

    val bb = 4L.shr(6)//右移6位，shr(位数)相当于Java>>

    val cc = 89.ushr(2)//无符号右移两位，ushr(位数)相当于Java的>>>

    var dd = 4.and(4)   //相当于Java 4&4

    var ee = 5.or(3)//相当于Java 5|3

    var ff = 4.xor(3)//异或

    var gg = 8.inv()//反向


    /**
     * Char 与Java的char有所不一样，Kotlin的Char不能与Int类型直接比较的
     *，Kotlin必须使用单引号包起来
     */


    fun check(c: Char) {
//        if (1 == c)//这是不行的，回报编译错误的
//        {
//
//        }
    }

    fun decimalDigitalValue(c: Char): Int? {
        if (c !in '0'..'9') {
            throw IllegalArgumentException("Out of range")
        }
        return null
    }


    /**
     * 布尔值Boolean ：true：false
     *
     *  || - 短路逻辑或
     *  && - 短路逻辑与
     *  ! -
     *
     */


    /**
     * 数组，Kotlin中的数组用Array表示，
     * 其中Array基本的属性和方法有size、get()、set()
     * 创建数组Array有两种方法一种是用arrayOf()函数，
     * 第二种使用工厂函数，如下列两种方法
     */

    fun main(array: Array<String>)
    {
        //[1,2,3]
        var a= arrayOf(1,2,3,4)//第一种方法

        //[0,2,4]
        var b=Array(3,{i->(i*2)})//第二种方法

        print(a[0])//1
        print(b[1])//2
    }

    /**
     *
     * 如上所述，[] 运算符代表调用成员函数 get() 和 set()。
     * 注意: 与 Java 不同的是，Kotlin 中数组是不型变的（invariant）。
     * 除了Array，还有IntArray，ByteArray, ShortArray，用来表示各个类型的数组，省去了装箱操作，因此效率更高，其用法同Array一样：
     */


    fun arrayDemo()
    {
        val x:IntArray=intArrayOf(1,2,3,4)
        x[0]=x[1]+x[2]//x[0]值为5
    }

}