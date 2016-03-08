package less.alp.creativelesson;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        Intent intent=getIntent();
        if (intent!=null){
            webview.loadUrl(intent.getStringExtra(MainActivity.URL));
        }
        final ProgressDialog progress = ProgressDialog.show(this, "Channel" , "Loading.", true);
        progress.show();
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(), "Channel Loaded", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Something gone Wrong", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });
    }
}

