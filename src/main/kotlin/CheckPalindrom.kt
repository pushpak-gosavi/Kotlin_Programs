class CheckPalindrom {
    fun isPalindrom(string: String) : Boolean{
        var result = true
        var i = 0
        var j = string.length-1
        while (i<j){
            if(string[i] != string[j]){
                result = false
                break
            }
            i++
            j--
        }
        return result
    }
    

}