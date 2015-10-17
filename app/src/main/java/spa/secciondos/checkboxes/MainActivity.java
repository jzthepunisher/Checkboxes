package spa.secciondos.checkboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 =(CheckBox)findViewById(R.id.chkPresidente1);
        CheckBox checkBox2 =(CheckBox)findViewById(R.id.chkPresidente2);
        CheckBox checkBox3 =(CheckBox)findViewById(R.id.chkPresidente3);
        CheckBox star1 =(CheckBox)findViewById(R.id.star1);
        CheckBox star2 =(CheckBox)findViewById(R.id.star2);
        CheckBox star3 =(CheckBox)findViewById(R.id.star3);

        checkBox1.setOnClickListener(chkListener);
        checkBox2.setOnClickListener(chkListener);
        checkBox3.setOnClickListener(chkListener);
        star1.setOnClickListener(chkListener);
        star2.setOnClickListener(chkListener);
        star3.setOnClickListener(chkListener);
    }

    private View.OnClickListener chkListener=new View.OnClickListener(){
        public void onClick(View v){
            if(((CheckBox)v).isChecked()){
                Toast.makeText(getBaseContext(), "Presidente : " + ((CheckBox) v).getText() + " es seleccionado", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(getBaseContext(),"Presidente : " + ((CheckBox)v).getText() + " es deseleccionado",Toast.LENGTH_SHORT).show();
            }
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
