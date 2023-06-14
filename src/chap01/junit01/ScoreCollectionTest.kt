package chap01.junit01

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import kotlin.test.fail

class ScoreCollectionTest {

    @Test
    fun answerArithmeticMeanOfTwoNumbers() {

        //준비
        val collection = ScoreCollection()
        collection.add(object : Scoreable {
            override fun getScore(): Int {
                return 5
            }
        })

        collection.add(object : Scoreable {
            override fun getScore(): Int {
                return 7
            }
        })

        // 실행
        val actualResult = collection.arithmeticMean()

        //단언
        assertThat(actualResult, equalTo(6))
    }
}
