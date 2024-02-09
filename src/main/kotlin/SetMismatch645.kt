fun main(){
    val nums = mutableListOf<Int>(1,2,2,4)
    val nextNum= mutableListOf<Int>()
    for (i in nums.indices){
        for (j in i+1 until nums.size){
            if(nums[i] == nums[j]){
                nextNum.add(nums[i])
                nextNum.add(nums[j]+1)
            }
        }
    }

    println(nextNum)
}