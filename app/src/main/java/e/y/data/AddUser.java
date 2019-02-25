package e.y.data;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddUser extends AppCompatActivity implements View.OnClickListener {

    UserTable ut;
    Databaseclass db;

    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        save=findViewById(R.id.btnsave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });



    }
    public void addData(){
        EditText id,name,email;
        ut=new UserTable();
       // db=Room.databaseBuilder(getApplicationContext(),Databaseclass.class,"DB").build();
        id=findViewById(R.id.txtid);
        name=findViewById(R.id.txtname);
        email=findViewById(R.id.txtemail);
        int sid;
        String sname,semail;
        sid=Integer.parseInt(id.getText().toString());
        sname=name.getText().toString();
        semail=email.getText().toString();
        ut.setEmail(semail);
        ut.setId(sid);
        ut.setName(sname);
        MainActivity.db.daobj().adduser(ut);
        id.setText("");
        name.setText("");
        email.setText("");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnadd:
                addData();
                break;
        }

    }
}
