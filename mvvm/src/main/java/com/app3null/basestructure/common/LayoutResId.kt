package com.app3null.basestructure.common


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class LayoutResId(
    val value: Int
)