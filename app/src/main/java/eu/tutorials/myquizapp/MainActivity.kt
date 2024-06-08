package eu.tutorials.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart:Button = findViewById(R.id.btn_start)
        val etName: TextView = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.isEmpty()){
                Toast.makeText(this,"Please enter a name", Toast.LENGTH_LONG).show()
            }
            else{ //Intent is basically jumping from one activity to another activity, in this case from activity to QuizQuestionsActiovity
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME , etName.text.toString())
                startActivity(intent) //we need to start intent to go over the next screen but it wont close the main activity
                finish()
            }
        }

    }
}