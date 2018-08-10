package com.xcwang.kt


import io.kotlintest.matchers.string.shouldHaveMinLength
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec


class My1stKtTest : WordSpec() {
    init {
        "A My1stKt" should {
            "name should be xcwang" {
                val my1stKt = My1stKt()
                my1stKt.name shouldBe "xcwang"
            }
            "url length should be more than 10" {
                val my1stKt = My1stKt()
                my1stKt.url.shouldHaveMinLength(10)
            }
        }
    }
}
