package com.mrh.ktdemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Test

/**
 * Example lockotlin.Anyal unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        GlobalScope.launch {
            println("2")
            test()
        }
        println("1")
    }

    suspend fun test() {
        println("test")
    }
}