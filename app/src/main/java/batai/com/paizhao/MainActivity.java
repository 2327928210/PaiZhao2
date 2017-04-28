package batai.com.paizhao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button);

    }

    public void onClick(View view){

        Intent intent=new Intent(this,SecondActivity.class);

        startActivity(intent);


    }


}
