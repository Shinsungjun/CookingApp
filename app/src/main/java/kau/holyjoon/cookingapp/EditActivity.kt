package kau.holyjoon.cookingapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.edit_main.*


class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_main)

        aboutView()
    }
    private fun aboutView(){
        text_myCook.text = "메모화면"
    }
}