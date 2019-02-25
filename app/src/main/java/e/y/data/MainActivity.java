package e.y.data;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add,view,del,update;
    static Databaseclass db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db= Room.databaseBuilder(getApplicationContext(),Databaseclass.class,"DB").allowMainThreadQueries().build();

        setContentView(R.layout.activity_main);
        add=findViewById(R.id.btnadd);
        add.setOnClickListener(this);
        view=findViewById(R.id.btnview);
        view.setOnClickListener(this);
        del=findViewById(R.id.del);
        del.setOnClickListener(this);
        update=findViewById(R.id.btnupd);
        update.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnadd:
                startActivity(new Intent(getApplicationContext(),AddUser.class));
                break;
            case R.id.btnview:
                startActivity(new Intent(getApplicationContext(),ViewData.class));
                break;
            case R.id.del:
                startActivity(new Intent(getApplicationContext(),Delete.class));
                break;
            case R.id.btnupd:
                startActivity(new Intent(getApplicationContext(),Update.class));
                break;

        }


    }
}
