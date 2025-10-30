package in.raj.webviewOne;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import in.raj.R;

public class WebViewAcitivity extends AppCompatActivity {

    WebView webViewOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_web_view_acitivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        webViewOne = (WebView) findViewById(R.id.webViewOne);
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Page Loading...");
        progressDialog.setMessage("Page is loading please wait...");
        progressDialog.setCancelable(false);


        webViewOne.getSettings().setPluginState(WebSettings.PluginState.ON);
        webViewOne.getSettings().setJavaScriptEnabled(true);
        webViewOne.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webViewOne.getSettings().setSupportMultipleWindows(true);
        webViewOne.getSettings().setSupportZoom(true);
        webViewOne.getSettings().setBuiltInZoomControls(true);
        webViewOne.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(WebViewAcitivity.this, "Error : "+description, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressDialog.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
            }
        });
        webViewOne.loadUrl("http://13.49.102.254:8115/");
    }
}