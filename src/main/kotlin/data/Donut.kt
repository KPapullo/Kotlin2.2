package data

object Donut {
    val isDonut = true //запись доступна только платным подписчикам VK Donut
    val paidDuration = 0 //время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    //object  placeholder {

    //} .


    val canPublisFreeCopy = true //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;


    var editMode: String = "all"  /*информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    all — всю информацию о VK Donut.
    duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
    */
}