package com.back.global.extention

fun <T : Any> T?.getOrThrow(): T {
    return this ?: throw NoSuchElementException()
}