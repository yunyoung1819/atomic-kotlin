package com.atomic.kotlin.atomicTest

import kotlin.math.abs
import kotlin.reflect.KClass

const val ERROR_TAG = "[Error]: "

private fun <L, R> test(
    actual: L,
    expected: R,
    checkEquals: Boolean = true,
    predicate: () -> Boolean
) {
    println(actual)
    if (!predicate()) {
        print(ERROR_TAG)
        println("$actual " + (if (checkEquals) "!=" else "==") + " $expected")
    }
}

/**
 * this 객체의 문자열 표현을
 * rval 문자열과 비교한다
 */
infix fun Any.eq(rval: String) {
    test(this, rval) {
        toString().trim() == rval.trimIndent()
    }
}

/**
 * this가 rval과 같은지 검증한다
 */
infix fun <T> T.eq(rval: T) {
    test(this, rval) {
        this == rval
    }
}

/**
 * this != 'rval'인지 검증한다
 */
infix fun <T> T.neq(rval: T) {
    test(this, rval, checkEquals = false) {
        this != rval
    }
}

/**
 * 어떤 Double 값이 rval에 지정된 Double 값과 같은지 비교한다
 * 두 값의 차이가 작은 양숫값(0.0000001)보다 작으면 두 Double을 같다고 판정한다
 */
infix fun Double.eq(rval: Double) {
    test(this, rval) {
        abs(this - rval) < 0.0000001
    }
}

/**
 * 포획한 예외 정보를 저장하는 클래스
 *
 */
class CapturedException(
    private val exceptionClass: KClass<*>?,
    private val actualMessage: String
) {
    private val fullMessage: String
        get() {
            val className =
                exceptionClass?.simpleName ?: ""
            return className + actualMessage
        }
    infix fun eq(message: String) {
        fullMessage eq message
    }
    infix fun contains(parts: List<String>) {
        if (parts.any { it !in fullMessage }) {
            print(ERROR_TAG)
            println("Actual Message: $fullMessage")
            println("Expected parts: $parts")
        }
    }

    override fun toString() = fullMessage
}