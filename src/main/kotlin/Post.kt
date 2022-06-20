package ru.netology

data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean
) {

    object WallService {
        private var posts = emptyArray<Post>()
        fun add(post: Post): Post {
            val postWithId: Post = post.copy(id = post.id + 1)
            posts += postWithId
            return posts.last()
        }

        fun update(id: Int): Boolean {
            for (post in posts) {

                if (post.id == id) {
                    posts[post.id] = post.copy(
                        ownerId = post.ownerId, fromId = post.fromId,
                        createdBy = post.createdBy, text = post.text, replyOwnerId = post.replyOwnerId,
                        replyPostId = post.replyPostId, friendsOnly = post.friendsOnly
                    )
                    return true
                } else {
                    return false

                }
            }
            return update(id)
        }
    }
}