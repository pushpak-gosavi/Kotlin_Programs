fun main() {
    val str1 = "ezupkr"
    val str2 = "ubmrapg"
    var count = 0

   println(longestCommonSubsequence(text1 = str1, text2 = str2))
}

fun longestCommonSubsequence(text1: String, text2: String): Int =
    (if (text1.length < text2.length) Pair(text2, text1) else Pair(text1, text2)).let { (t1, t2) ->
        (1..t1.length).fold(Array(2) { IntArray(t2.length + 1) }) { m, i ->
            (1..t2.length).forEach { j ->
                m[i % 2][j] =
                    if (t1[i - 1] == t2[j - 1]) m[(i - 1) % 2][j - 1] + 1 else maxOf(m[(i - 1) % 2][j], m[i % 2][j - 1])
            }
            m
        }[t1.length % 2].last()
    }

