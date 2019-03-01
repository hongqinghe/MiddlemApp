package middlem.person.middlemapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import middlem.person.systemmodule.SystemHomeActivity
import middlem.person.utilsmodule.UtilsHomeActivity
import person.middlem.viewmodule.ViewHomeActivity

class AppSplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_splash)
    }

    fun toSystemModule(view: View?) {
        startActivity(intent.setClass(this, SystemHomeActivity::class.java))
    }

    fun toViewModule(view: View?) {
        Toast.makeText(this,"hhhhh",Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, ViewHomeActivity::class.java))
    }

    fun toUtilsModule(view: View?) {
        startActivity(intent.setClass(this, UtilsHomeActivity::class.java))
    }
}
