package com.raywenderlich.droidquiz

import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.raywenderlich.droidquiz.data.db.QuizDAO
import com.raywenderlich.droidquiz.data.provider.QuestionInfoProvider

import com.raywenderlich.droidquiz.data.db.QuizDatabase
import com.raywenderlich.droidquiz.data.model.Question
import org.junit.*
import org.junit.rules.TestRule
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val rule: TestRule = InstantTaskExecutorRule()

    private lateinit var database: QuizDatabase
    private lateinit var quizDAO: QuizDAO

    @Before
    fun setUp() {
        val context: Context = InstrumentationRegistry.getInstrumentation().context
        try {
            database = Room.inMemoryDatabaseBuilder(context, QuizDatabase::class.java)
                .allowMainThreadQueries()
                .build()
        }catch (e: Exception) {
            Log.i(this.javaClass.simpleName, e.message)
        }
        quizDAO = database.quizDAO()
    }

    @Test
    fun testInsertQuestion() {
        val previusNumberOfQuestions = quizDAO.getAllQuestions().size

        val question = Question(1, "What is your name?")
        quizDAO.insert(question)

        val numberOfQuestions = quizDAO.getAllQuestions().size

        val numberOfNewQuestions = numberOfQuestions - previusNumberOfQuestions

        Assert.assertEquals(1, numberOfNewQuestions)

        quizDAO.clearQuestions()

        Assert.assertEquals(0, quizDAO.getAllQuestions().size)
    }

    @Test
    fun testClearQuestions() {
        for (question in QuestionInfoProvider.questionList) {
            quizDAO.insert(question)
        }
        Assert.assertTrue(quizDAO.getAllQuestions().isNotEmpty())
        Log.d("testData", quizDAO.getAllQuestions().toString())
        quizDAO.clearQuestions()
        Assert.assertTrue(quizDAO.getAllQuestions().isEmpty())
    }

    @After
    fun testDown() {
        database.close()
    }

}
