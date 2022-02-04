package concepts.types

fun printTypeAndValue(obj:Any?){
    println("variable type: ${obj?.javaClass} variable value: $obj")
}

fun main(){

    //Numbers - Integer types

    val oneByte: Byte = 1 //Byte
    val oneShort :Short = -30000 //Short
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long

    println("\nInteger types\n")
    printTypeAndValue(oneByte)
    printTypeAndValue(oneShort)
    printTypeAndValue(one)
    printTypeAndValue(threeBillion)
    printTypeAndValue(oneLong)

    //Numbers - Floating-point types

    val pi = 3.14 // Double
    val e = 2.718281828 // Double
    val eFloat = 2.7182817f // Float // must end with f

    println("\nFloating-point types\n")
    printTypeAndValue(pi)
    printTypeAndValue(e)
    printTypeAndValue(eFloat)

    //Literal constants

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("\nLiteral constants\n")
    printTypeAndValue(oneMillion)
    printTypeAndValue(creditCardNumber)
    printTypeAndValue(socialSecurityNumber)
    printTypeAndValue(hexBytes)
    printTypeAndValue(bytes)

    //Unsigned Integers

    val oneUnsignedInt : UInt = 55555555u
    val oneUnsignedByte :UByte = 1u
    val oneUnsignedShort :UShort = 65535u
    val oneUnsignedLong :ULong = 3000000000u
    val a = 1U

    println("\nUnsigned Integers\n")
    printTypeAndValue(oneUnsignedInt)
    printTypeAndValue(oneUnsignedByte)
    printTypeAndValue(oneUnsignedShort)
    printTypeAndValue(oneUnsignedLong)
    printTypeAndValue(a)

    //Booleans

    val boolNull: Boolean? = null

    printTypeAndValue(boolNull)

    //Characters

    val aChar: Char = 'a'
    val char4: Char = '4'
    val convert = char4.digitToInt()

    println("\nCharacters\n")
    printTypeAndValue(aChar)
    println("\nConvert Char to Integer using digitToInt()\n")
    println("Before :")
    printTypeAndValue(char4)
    println("After :")
    printTypeAndValue(convert)

    //Strings

    val str = "abed 123"

    println("\nStrings\n")
    printTypeAndValue(str)
    for (c in str) {
        println(c)
    }
    println(str.uppercase())

    //Arrays

    println("\nArrays\n")

    println("Using arrayOf:")
    var intArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    intArray.forEach { i -> print("$i ") }

    intArray = Array(10) { i -> i+1 }
    println("\nUsing Array constructor:")
    intArray.forEach { i -> print("$i ") }

    val nullArray = arrayOfNulls<Int>(5)
    println("\nArray of Nulls")
    nullArray.forEach { i-> print("$i ")}

    println("\n\nPrimitive type arrays\n")
    var array = IntArray(10)
    array.forEach { print("$it ") }
    println()
    array = IntArray(10){7}
    array.forEach { print("$it ") }
    println()
    array = IntArray(10){(it+1)*(it+1)}
    array.forEach { print("$it ") }
}



