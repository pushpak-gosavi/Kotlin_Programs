package leetcode_daily

import java.util.Stack

fun main(){
    val str = "lee)))(X((t(c)o)de)"
    val stack:Stack<Int> = Stack<Int>()
    val chAr= str.toCharArray()
    for (i in str.indices){
        if (str[i]=='('){
            stack.push(i)
        }else if (str[i]==')'){
            if (stack.size==0){
                chAr[i]='.'
            }else stack.pop()
        }
    }
    while (stack.size > 0){
        chAr[stack.pop()] ='.'
    }

    val sb = StringBuilder()
    for (i in chAr){
        if (i!='.')
            sb.append(i)
    }
    println(sb.toString())
}