package data

object WallService {
    private var postId = 1
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size +1)
        return posts.last()
    }

    fun update(postToUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postToUpdate.id) {
                posts[index] = postToUpdate.copy(
                    ownerId = posts[index].ownerId,
                    date = posts[index].date
                )
                return true
            }
        }
        return false
    }

}
