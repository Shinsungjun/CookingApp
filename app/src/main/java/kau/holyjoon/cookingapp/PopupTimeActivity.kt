package kau.holyjoon.cookingapp

import android.os.Bundle
import android.view.Window
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager

class PopupTimeActivity : AppCompatActivity(){  //나중에 Time은 Edit이 아닌.. 선택으로 바꿀거임 ..
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.plus_popup)
    }
}