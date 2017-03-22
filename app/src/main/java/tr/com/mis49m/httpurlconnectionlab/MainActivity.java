package tr.com.mis49m.httpurlconnectionlab;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView tvContent;
    EditText etUrl;
    ImageView imageView;
    Button btnImage, btnUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        tvContent = (TextView) findViewById(R.id.tv_content);
        etUrl = (EditText) findViewById(R.id.et_url);
        imageView = (ImageView) findViewById(R.id.image);
        btnImage = (Button) findViewById(R.id.btn_image);
        btnUrl = (Button) findViewById(R.id.btn_url);

        etUrl.setText("http://www.mis.boun.edu.tr/");

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}
