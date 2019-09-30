package kau.holyjoon.cookingapp

import android.os.Bundle
import android.view.Window
import android.widget.BaseAdapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.plus_popup.*

class PlusActivity :AppCompatActivity() {   //+ 버튼 클릭 시 나타나는 popup형식 Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.plus_popup)

        val gridLayoutManager = GridLayoutManager(this,5)

        val gridView : GridView = findViewById(R.id.grid_image)
    }
}