package `in`.iot.lab.teacherreview.feature_teacherlist.domain.models.remote

/**
 * This is the structure of the review Data which will be posted by users
 *
 * @param review Review Data given by the user
 * @param rating Rating Data which contains the data of the ratings
 * @param faculty Faculty Id generated by the database
 */
data class ReviewPostData(
    val review: String? = null,
    val rating: RatingData? = null,
    val faculty: String,
)