package phonetweakers.alc4phase1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void aboutWebview(View view) {
        Intent intent = new Intent(MainActivity.this, WebviewActivity.class);
        startActivity(intent);

    }
    public void myProfile(View view)  {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    }
