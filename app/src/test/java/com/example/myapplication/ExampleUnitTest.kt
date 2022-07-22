package com.example.myapplication

import org.junit.Test
import org.junit.Assert.assertTrue

class ExampleUnitTest {
    @Test
    fun generates_number () {
        val dice1 =Dice(6)
        val x = dice1.roll()
        assertTrue("YO Bro.",x in 1..6)
    }
}