package e.y.data;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class ViewData extends AppCompatActivity {
    Databaseclass db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);
       // db=Room.databaseBuilder(getApplicationContext(),Databaseclass.class,"DB").build();

        UserTable ut;
        List<UserTable> l1= MainActivity.db.daobj().ViewDataFromTable();
        String s="";
        for(UserTable u:l1)
        {
            s=s+u.getId()+"\n"+u.getName()+"\n"+u.getEmail()+"\n\n\n\n\n";
        }
        TextView t1=findViewById(R.id.txtview);
        t1.setText(s);

    }
}
