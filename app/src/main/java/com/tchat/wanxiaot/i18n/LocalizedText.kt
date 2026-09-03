package com.tchat.wanxiaot.i18n

/**
 * Перевод интерфейсных строк, переданных в Compose напрямую.
 */
@Volatile
private var activeStrings: Strings = StringsZhCN

internal fun setActiveStrings(strings: Strings) {
    activeStrings = strings
}

fun localized(text: String): String = activeStrings.translate(text)
