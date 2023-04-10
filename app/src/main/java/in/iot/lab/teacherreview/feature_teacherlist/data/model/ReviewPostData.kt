package `in`.iot.lab.teacherreview.feature_teacherlist.data.model

/**
 * This is the structure of the review Data which will be posted by users
 *
 * @param faculty Faculty Id generated by the database
 * @param rating Rating Data which contains the data of the ratings
 * @param review Review Data given by the user
 * @param subject Subject for which the teacher is rated
 */
data class ReviewPostData(
    val faculty: String,
    val rating: RatingData? = null,
    val review: String? = null,
    val subject: String
)