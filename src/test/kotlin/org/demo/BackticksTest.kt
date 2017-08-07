package org.demo

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class BackticksTest {
    @Test
    fun `I can be focused`() {
        assert(1 == 1)
    }

    @Nested
    inner class ImNestedButNotBackticked {
        @Test
        fun `I can also be focused`() {
            assert(1 == 1)
        }
    }

    @Nested
    inner class `Im nested with backticks` {
        @Test
        fun `I can not be focused`() {
            assert(1 == 1)
        }
    }
}