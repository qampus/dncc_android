package us.qampus.androidone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentAdapter extends AppCompatActivity {

    //TODO tambah 2 line di bawah
    Fragment fragment = null;
    FragmentTransaction fragmentTransaction;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_adapter);
    }

    public void setFragment(){
        if(fragment == null){
            fragment = new BerandaFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment, null);
            fragmentTransaction.commit();
        }
        else if(fragment != null){
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment, null);
            fragmentTransaction.commit();
        }
    }

}
