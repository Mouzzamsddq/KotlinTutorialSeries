// we need two values to perform the addition

// syntax of variable declaration
// (const val var) ABC = 123

// what is the variable name?

// 1) var -> A var is a keyword which is used to declare the variable.
// 2) val -> A val is also a keyword which is used to declare the variable but we can not reassign the values.
// val is run-time-constant.
// 3) const -> A const is used with val keyword which is used to decalare the variable but we can npt reassign the values.


// we can declare the const variable only two ways.
// 1) top level declaration
// 2) Inside object class


// const is compile time constant where as val is run time constant.
// we can only declare string and primitive type value through const.
const val c = "hello"

fun main() {
    // var a: Int = 10
    // println(a)
    // a = 50
    // println(a)

    val b  = add(100, 200)
    println(b)

   println(c)

//    c = 100
//    println(c)

}

fun add(a: Int, b: Int): Int {
    return a+b;
}
