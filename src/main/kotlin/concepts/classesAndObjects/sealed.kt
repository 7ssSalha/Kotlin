package concepts.classesAndObjects

sealed class Error(codeError: Int)

data class RecoverableError(val howToFixError:String,val codeError:Int) :Error(codeError)

data class NonRecoverableError(val errorMsg:String,val errorLine:String,val codeError:Int) :Error(codeError)

object SmallError :Error(1)

fun whatError(error: Error) = when(error){
    is RecoverableError -> println("recoverable error: ${error.howToFixError}")
    is NonRecoverableError -> println("non-recoverable error: ${error.errorLine}: ${error.errorMsg}")
       SmallError -> println("Small Error")
}

fun main(){
    val e1 = RecoverableError("you forget semicolon(;) in the end of the code",3000)
    whatError(e1)
}