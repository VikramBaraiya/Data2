package e.y.data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update extends AppCompatActivity {

    EditText i,n,e;
    Button updateData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        i=findViewById(R.id.txtid);
        n=findViewById(R.id.txtname);
        e=findViewById(R.id.txtemail);
        updateData=findViewById(R.id.btnupdate);
        updateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(i.getText().toString());
                String name=n.getText().toString();
                String email=e.getText().toString();
                UserTable ut=new UserTable();
                ut.setId(id);
                ut.setName(name);
                ut.setEmail(email);
                MainActivity.db.daobj().UpdateUserData(ut);
                n.setText("");
                i.setText("");
                e.setText("");
                Toast.makeText(getApplicationContext(),"User Updated Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
