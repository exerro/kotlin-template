package me.exerro

import kotlin.test.Test
import kotlin.test.assertEquals

class ExportedFunctionTest {
    @Test
    fun `exportedFunction returns 42`() {
        assertEquals(42, exportedFunction())
    }
}
