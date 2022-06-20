package ru.netology

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class WallServiceTest {

    @Test
    fun addTest() {
        val service = Post.WallService
        val original = Post(0, 7, 1, 1, 171221, "balbla", 1, 1, true)
        val addedPost = service.add(original)
        val unexpectedId = 0
        assertNotEquals(unexpectedId, addedPost.id)
    }

    @Test
    fun updateExisting() {

        val service = Post.WallService

        service.add(Post(0, 5, 4, 7, 171221, "kurlikurli", 5, 2, true))
        service.add(Post(1, 10, 2, 3, 181221, "balbla1", 4, 3, true))


        val update = Post(1, 3, 6, 4, 171221, "kulibyaka", 5, 7, false)


        val result = service.update(update.id)


        assertTrue(result)
        //assertFalse(result)
    }


}
