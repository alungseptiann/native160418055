package id.ac.ubaya.informatika.native160418055

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
private var nama:String = "Septian"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Toast.makeText(this, "Wellcome to Android $nama", Toast.LENGTH_SHORT).show()
    }
}