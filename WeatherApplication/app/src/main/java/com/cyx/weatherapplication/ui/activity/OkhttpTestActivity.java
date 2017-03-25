package com.cyx.weatherapplication.ui.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.cyx.weatherapplication.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 1.拿到okHttpClient对象
 * 2.构造Request
 * 2.1 构造requestBody
 * 2.2 包装requestBody
 * 3.call -> execute
 */
public class OkhttpTestActivity extends AppCompatActivity {

    @BindView(R.id.get_button)
    Button getButton;
    @BindView(R.id.post_button)
    Button postButton;
    @BindView(R.id.post_string_button)
    Button postStringButton;
    @BindView(R.id.show_TextView)
    TextView showTextView;
    @BindView(R.id.post_file_button)
    Button postFileButton;
    @BindView(R.id.doUpload_button)
    Button doUploadButton;
    @BindView(R.id.doDownload_button)
    Button doDownloadButton;
    @BindView(R.id.show_ImageView)
    ImageView showImageView;
    @BindView(R.id.doDownloadImg_button)
    Button doDownloadImgButton;

    private String mBaseUrl = "http://192.168.10.107:8080/Imooc_okhttp/";//天平架ip
    //    private String mBaseUrl = "http://192.168.31.57:8080/Imooc_okhttp/";//嘉禾望岗ip
//    OkHttpClient client = new OkHttpClient();
    OkHttpClient client = new OkHttpClient.Builder().cookieJar(new CookieJar() {
        private final HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap<>();

        @Override
        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
            cookieStore.put(url, cookies);
        }

        @Override
        public List<Cookie> loadForRequest(HttpUrl url) {
            List<Cookie> cookies = cookieStore.get(url);
            return cookies != null ? cookies : new ArrayList<Cookie>();
        }
    }).build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.get_button, R.id.post_button, R.id.post_string_button, R.id.post_file_button, R.id.doUpload_button, R.id.doDownload_button, R.id.doDownloadImg_button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get_button:
                getRequest();
                break;
            case R.id.post_button:
                postRequest();
                break;
            case R.id.post_string_button:
                postStringRequest();
                break;
            case R.id.post_file_button:
                postFileRequest();
                break;
            case R.id.doUpload_button:
                doUploadRequest();
                break;
            case R.id.doDownload_button:
                doDownloadRequest();
                break;
            case R.id.doDownloadImg_button:
                doDownloadImgRequest();
                break;
        }
    }


    private void getRequest() {
        final Request request = new Request.Builder().url(mBaseUrl + "login?username=cyx623823&password=623823").build();
        executeRequest(request);
    }

    private void postRequest() {
        FormBody.Builder formBodyBuild = new FormBody.Builder();
        formBodyBuild.add("username", "xiong");
        formBodyBuild.add("password", "hahaha");
        Request request = new Request.Builder().url(mBaseUrl + "login").post(formBodyBuild.build()).build();

        executeRequest(request);
    }

    private void postStringRequest() {
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain;chaset=utf-8"), "{username:hyman,password:123}");
        Request.Builder builder = new Request.Builder();
        Request request = builder.url(mBaseUrl + "postString").post(requestBody).build();
        executeRequest(request);
    }

    private void postFileRequest() {//从手机内存卡上传图片文件到服务器

        File file = new File(Environment.getExternalStorageDirectory(), "banner2.jpg");
        if (!file.exists()) {
            Log.d("jpg", "postFileRequest() called" + file.getAbsolutePath() + " not exist!");
            return;
        }
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
        Request.Builder builder = new Request.Builder();
        Request request = builder.url(mBaseUrl + "postFile").post(requestBody).build();
        executeRequest(request);
    }

    private void doUploadRequest() {
        File file = new File(Environment.getExternalStorageDirectory(), "banner2.jpg");
        if (!file.exists()) {
            Log.d("jpg", "doUploadRequest() called" + file.getAbsolutePath() + " not exist!");
            return;
        }
        final MultipartBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("username", "hyman")
                .addFormDataPart("password", "123")
                .addFormDataPart("mPhoto", "hyman.jpg", RequestBody.create(MediaType.parse("application/octet-stream"), file)).build();

        CountingRequestBody countingRequestBody = new CountingRequestBody(body, new CountingRequestBody.Listener() {
            @Override
            public void onRequestProgress(final long bytesWrittem , final long contentLength) {
                Log.d("上传进度",bytesWrittem + " / " + contentLength);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                showTextView.setText(bytesWrittem + " / " + contentLength);
                    }
                });
            }
        });

        //mime type
        Request.Builder builder = new Request.Builder();
        Request request = builder.url(mBaseUrl + "uploadInfo").post(countingRequestBody).build();
//        executeRequest(request);
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(OkhttpTestActivity.this, message, Toast.LENGTH_SHORT).show();
                        Toast.makeText(OkhttpTestActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
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
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(OkhttpTestActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void doDownloadRequest() {
        final Request request = new Request.Builder()
                .url(mBaseUrl + "files/hyman.jpg").build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(OkhttpTestActivity.this, message, Toast.LENGTH_SHORT).show();
                        Toast.makeText(OkhttpTestActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
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
                final long total = response.body().contentLength();//文件总长度
                long sum = 0L;
                InputStream is = response.body().byteStream();
                int len = 0;
                File file = new File(Environment.getExternalStorageDirectory(), "hyman12306.jpg");
                byte[] buf = new byte[128];
                FileOutputStream fos = new FileOutputStream(file);
                while ((len = is.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                    sum += len ;
                    Log.d("下载进度",sum + " / " + total);
                    final long finalSum = sum;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            showTextView.setText(finalSum + " / " + total);
                        }
                    });
                }
                fos.flush();
                is.close();
                fos.close();
                Log.d("download", "onResponse() called with: call = [" + call + "], response = [" + response + "]" + "download succuss!");
            }
        });
    }

    private void doDownloadImgRequest() {
        final Request request = new Request.Builder()
                .url(mBaseUrl + "files/hyman.jpg").build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(OkhttpTestActivity.this, message, Toast.LENGTH_SHORT).show();
                        Toast.makeText(OkhttpTestActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
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
                InputStream is = response.body().byteStream();
                final Bitmap bitmap = BitmapFactory.decodeStream(is);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        showImageView.setImageBitmap(bitmap);
                    }
                });
                Log.d("downloadImg", "onResponse() called with: call = [" + call + "], response = [" + response + "]" + "downloadImg succuss!");
            }
        });
    }

    private void executeRequest(Request request) {
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final String message = e.toString();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(OkhttpTestActivity.this, message, Toast.LENGTH_SHORT).show();
                        Toast.makeText(OkhttpTestActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(OkhttpTestActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                        showTextView.setText(res);
                    }
                });
            }
        });
    }
}
