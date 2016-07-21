package aleisamo.github.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    public void sendMessage (View view){
        Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
        return;


    }
}
