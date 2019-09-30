package kau.holyjoon.cookingapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.edit_main.*


class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_main)

        aboutView()
    }

    private fun aboutView(){
        bt_plus.setOnClickListener{ //메모버튼 눌렀을때
            openPlusActivity()
        }
    }
    private fun openPlusActivity() {
        val builder = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.plus_popup,null)
        val dialogText = dialogView.findViewById<EditText>(R.id.edit_how)

        builder.setView(dialogView).show()


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}