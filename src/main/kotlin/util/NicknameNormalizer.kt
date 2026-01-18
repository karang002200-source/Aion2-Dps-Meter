package com.tbread.util

import java.text.Normalizer

object NicknameNormalizer {
    private val whitespaceRegex = Regex("[\\p{Z}\\s\\u200B\\u200C\\u200D\\uFEFF\\u180E]")

    fun normalize(nickname: String): String {
        val normalized = Normalizer.normalize(nickname, Normalizer.Form.NFKC)
        return normalized
            .replace("\u0000", "")
            .replace(whitespaceRegex, "")
    }
}
