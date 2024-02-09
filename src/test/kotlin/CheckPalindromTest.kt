import org.junit.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class CheckPalindromTest {

    @Test
    fun checkPass(){
        val objPalindorm = CheckPalindrom()
        val expectedOutput = objPalindorm.isPalindrom("level")
        assertEquals(actual = expectedOutput, expected = true, message = "this test is pass")

    }

    @Test
    fun checkNotPass(){
        val objPalindrom = CheckPalindrom()
        val expectOutput= objPalindrom.isPalindrom("Hello")
        assertEquals(actual = expectOutput, expected = false)
    }
}