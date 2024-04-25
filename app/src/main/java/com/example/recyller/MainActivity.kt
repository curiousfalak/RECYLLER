import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyller.MyAdapter
import com.example.recyller.R
import com.example.recyller.User

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recyler)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val name= arrayOf("Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal","Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal")
        val lastMsg= arrayOf("hii","class @5","yes we'll go","ui check kar","done np","hello?","hii","class @5","yes we'll go","ui check kar","done np","hello?")
        val lastMsgTime= arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")
        val imageId= intArrayOf(R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1,R.drawable.p1)

        UserArrayList=ArrayList()


        for(i in name.indices)
        {
            val user=User(imageId[i],name[i],lastMsg[i],lastMsgTime[i])
            UserArrayList.add(user)
        }



        recyclerView.adapter= MyAdapter(this,UserArrayList)

    }
}
