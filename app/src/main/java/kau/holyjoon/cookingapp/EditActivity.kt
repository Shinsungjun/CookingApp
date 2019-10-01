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
    private fun openPlusActivity() { //근데 dialog라서 Activity 취급이 아닌거같아
        val builder = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.plus_popup,null)
        val dialoghow = dialogView.findViewById<EditText>(R.id.edit_how)
        val dialogtime = dialogView.findViewById<EditText>(R.id.edit_time)
        builder.setView(dialogView)
            .setPositiveButton("DONE") {dialogInterface, i ->
                if(dialoghow.text == null) {
                //조리 방법을 선택해주셔야 합니다.
                }
                //조건이 만족한다면 Recipe 객체를 만들어, 해당 객체를 넘김 ..?
                //아니면 굳이 그럴 필요 없고 그냥 EditActivity에 객체를 만들어서 값을 넘겨주면 될듯
            } //내생각엔 PopupActivity는 쓸모 없어 보이는거 같기도 함.. 안쓰는거같아 Dialog에서는
            .setNegativeButton("CANCEL") {dialogInterface, i ->

            }
            .show()



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}