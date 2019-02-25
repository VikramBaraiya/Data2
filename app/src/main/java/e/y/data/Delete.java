package e.y.data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete extends AppCompatActivity implements View.OnClickListener {

    EditText d;
    Button delete;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        d=findViewById(R.id.txtdel);
        delete=findViewById(R.id.btndelete);
       // i=Integer.parseInt(d.getText().toString());

        delete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.btndelete:
                i=Integer.parseInt(d.getText().toString());
                UserTable u=new UserTable();
                u.setId(i);
                MainActivity.db.daobj().DeleteData(u);
                Toast.makeText(getApplicationContext(),"record successfully deleted",Toast.LENGTH_SHORT).show();;
                break;
        }

    }
}
