package com.hanes.jomarx.kpi4mechanics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview1);
        myWebView.loadUrl("http://192.168.143.220/table21small.php");
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_options_menu, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        WebView myWebView = (WebView) findViewById(R.id.webview1);

        switch (item.getItemId()) {

            case R.id.table21:
                myWebView.loadUrl("http://192.168.143.220/table21small.php");
                return true;

            case R.id.table2pp:
                myWebView.loadUrl("http://192.168.143.220/table2pp.php");
                return true;

            case R.id.table3pp:
                myWebView.loadUrl("http://192.168.143.220/table3pp.php");
                return true;

            case R.id.table5pp:
                myWebView.loadUrl("http://192.168.143.220/table5pp.php");
                return true;

            case R.id.table6pp:
                myWebView.loadUrl("http://192.168.143.220/table6pp.php");
                return true;

            case R.id.table8pp:
                myWebView.loadUrl("http://192.168.143.220/table8pp.php");
                return true;

            case R.id.table7pp:
                myWebView.loadUrl("http://192.168.143.220/table7pp.php");
                return true;

            case R.id.meeting:
                myWebView.loadUrl("http://192.168.143.220/meeting.php");
                return true;

            case R.id.externalSrc:
                myWebView.loadUrl("https://docs.google.com/spreadsheets/d/1PPcjduJ7Z6MkYvx41-oROBnio4LeftnN8BRHzX1arUA");
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
