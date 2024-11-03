package com.mohaberabi.composeresponsive.domain

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.mohaberabi.composeresponsive.R
import kotlinx.parcelize.Parcelize


@Parcelize
data class TopicModel(

    val title: String,
    val body: String,
    @DrawableRes val img: Int
) : Parcelable


object DummyTopics {
    val topic = listOf(
        TopicModel(
            "Android is an Amazing Platform",
            "Android is an amazing platform. I wish I could become better at it or find a job related to Android development.",
            R.drawable.img1
        ),
        TopicModel(
            "Kotlin is My Favorite Language",
            "Kotlin makes Android development more expressive and concise. I enjoy using it for building apps.",
            R.drawable.img2
        ),
        TopicModel(
            "Compose Simplifies UI Development",
            "Jetpack Compose has changed the way I create user interfaces, making it more intuitive and faster.",
            R.drawable.img3
        ),
        TopicModel(
            "Exploring Multiplatform Development",
            "Kotlin Multiplatform is a powerful tool that allows code sharing across Android and iOS.",
            R.drawable.img4
        ),
        TopicModel(
            "Why I Love Android Studio",
            "Android Studio is packed with features that make app development easier, such as debugging and layout previews.",
            R.drawable.img3
        ),
        TopicModel(
            "The Importance of Clean Code",
            "Writing clean code in Android helps with maintainability and readability, improving overall project quality.",
            R.drawable.img1
        ),
        TopicModel(
            "Learning Android Animations",
            "Working with animations in Android brings life to my apps and enhances the user experience.",
            R.drawable.img2
        ),
        TopicModel(
            "Using Databases in Android",
            "Integrating Room or SQLite helps manage app data efficiently and improve data persistence.",
            R.drawable.img1
        ),
        TopicModel(
            "Mastering Dependency Injection",
            "DI frameworks like Dagger and Koin simplify object creation and improve scalability in my projects.",
            R.drawable.img4
        ),
        TopicModel(
            "The Power of Background Processing",
            "Understanding WorkManager and coroutines helps in efficiently managing background tasks in my apps.",
            R.drawable.img3
        )
    )
}