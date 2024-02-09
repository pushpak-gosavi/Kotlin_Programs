import javax.swing.tree.TreeNode as TreeNode

fun main() {
    val root: List<Int> = listOf<Int>(3, 4, 5, 10, 15)
    val sol = Solution()
    println(sol.rangeSumBST(root = root, low = 4, high = 15))
}

class Solution {
    fun rangeSumBST(root: List<Int>, low: Int, high: Int): Int? {
        val result: List<Int>? = root?.toList()?.subList(fromIndex = root.indexOf(low), toIndex = root.indexOf(high)+1)

        return result?.sum()
    }

}

