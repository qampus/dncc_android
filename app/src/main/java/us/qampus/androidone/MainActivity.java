package us.qampus.androidone;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ButtonA;
    Button ButtonB;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViews();
        //memanggil method INitViews
    }

    private void InitViews(){
        ButtonA = (Button)findViewById(R.id.ButtonA);
        ButtonB = (Button)findViewById(R.id.ButtonB);
        ButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ini Be", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ClickButtonA(View view){
        Toast.makeText(this, "Fragment A", Toast.LENGTH_SHORT).show();
    }

}
