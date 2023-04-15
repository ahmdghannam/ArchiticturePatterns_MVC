package com.example.architicturepatterns_mvc.model

import com.example.architicturepatterns_mvc.model.domain.Wisdom

class FakeApiService {
    private val wisdomsList= listOf(
        Wisdom("راح الليل طلع الفجر والعصفور صوصو","2023/7/22"),
        Wisdom("بطاطا لبيع","2023/2/2"),
        Wisdom("انا شايف الديزان اركتشر ده من قبل ؟","2023/3/1"),
        Wisdom("هل تتكلم العربية ؟","2023/5/4"),
    )

    fun getRandomWisdom():Wisdom{
        return wisdomsList.random()
    }
}