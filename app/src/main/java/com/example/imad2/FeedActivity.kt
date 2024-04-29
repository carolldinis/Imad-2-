import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.imad2.R
import kotlinx.android.synthetic.main.activity_second.*

class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
var image =findViewById<ImageView>(R.id.imageView2)
        feedButton.setOnClickListener {
            // Change image for feed action
            imageView.setImageResource(R.drawable.feed_image)
        }

        cleanButton.setOnClickListener {
            // Change image for clean action
            imageView.setImageResource(R.drawable.clean_image)
        }

        playButton.setOnClickListener {
            // Change image for play action
            imageView.setImageResource(R.drawable.play_image)
        }
    }
}
