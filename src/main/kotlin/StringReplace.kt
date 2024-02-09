import java.lang.StringBuilder

fun main() {
    var name = "919 00 709%2 92 9"
    var ans = StringBuilder()

    for(i in name){
        if(i == '9'){
            ans.append('0')
        }else if(i == '0'){
            ans.append('9')
        }else{
            ans.append(i)
        }

    }
    println(ans.toString())



}