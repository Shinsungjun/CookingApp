package kau.holyjoon.cookingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlusActivity :AppCompatActivity() {   //+ 버튼 클릭 시 나타나는 popup형식 Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plus_popup)
    }
}