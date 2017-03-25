package com.cyx.weatherapplication.ui.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.cyx.weatherapplication.R;
import com.cyx.weatherapplication.constants.ConstantUtils;
import java.io.IOException;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/*
    用来测试okhttp的简单使用
 */
public class SimpleOkHttpActivity extends AppCompatActivity {

    @BindView(R.id.login_view)
    Button mLoginView;
    @BindView(R.id.get_cookie_view)
    Button mCookieView;
    @BindView(R.id.cookie_show_view)
    TextView mCookieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_ok_http);
        ButterKnife.bind(this);
        getRequest();
    }

    @OnClick({R.id.login_view, R.id.get_cookie_view, R.id.cookie_show_view})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get_cookie_view:
                getRequest();
                break;
            case R.id.login_view:
                postRequest();
                break;
        }
    }

    /*
        发送一个get请求
     */
    private void getRequest() {
        final Request request = new Request.Builder()
                .url(ConstantUtils.THE_CURRENT_WEATHER_CONDITIONS_THINKPAGE_URL).build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        executeGetRequest(call);

    }

    private void executeGetRequest(Call call) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                Toast.makeText(SimpleOkHttpActivity.this,message,Toast.LENGTH_SHORT).show();
                Toast.makeText(SimpleOkHttpActivity.this,"get请求失败",Toast.LENGTH_SHORT).show();


                    }
                });
            }

            /**
             * 此时还在非UI线程中
             * @param call
             * @param response
             * @throws IOException
             */

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String res = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                Toast.makeText(SimpleOkHttpActivity.this,"get请求成功",Toast.LENGTH_SHORT).show();
                        mCookieTextView.setText(res);
                    }
                });
            }
        });
    }

    /**
     * 发送一个post请求
     */
    private void postRequest() {
        OkHttpClient client = new OkHttpClient();
        FormBody.Builder formBodyBuild = new FormBody.Builder();

        formBodyBuild.add("page", "1");
        formBodyBuild.add("code", "news");
        formBodyBuild.add("pageSize", "20");
        formBodyBuild.add("parentid", "0");
        formBodyBuild.add("type", "1");

        Request request = new Request.Builder().url(ConstantUtils.POST_URL).post(formBodyBuild.build()).build();
        Call call = client.newCall(request);
        executePostRequest(call);
    }

    private void executePostRequest(Call call) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SimpleOkHttpActivity.this,message,Toast.LENGTH_SHORT).show();
                        Toast.makeText(SimpleOkHttpActivity.this,"post请求失败",Toast.LENGTH_SHORT).show();
                    }
                });

            }
            //也是非UI线程
            @Override
            public void onResponse(Call call, final Response response) throws IOException {
               final String res = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                Toast.makeText(SimpleOkHttpActivity.this,"post请求成功",Toast.LENGTH_SHORT).show();
                        mCookieTextView.setText(decodeUnicodeToString(res));
                    }
                });
            }
        });
    }
    /**将Unicode编码解析成字符串形式（如汉字） */
    public static String decodeUnicodeToString(String uString) {
        StringBuilder sb = new StringBuilder();
        int i = -1, pos = 0;
        while ((i = uString.indexOf("\\u", pos)) != -1) {
            sb.append(uString.substring(pos, i));
            if (i + 5 < uString.length()) {
                pos = i + 6;
                sb.append((char) Integer.parseInt(uString.substring(i + 2, i + 6), 16));
            }
        }
        sb.append(uString.substring(pos));
        return sb.toString();
    }

}
