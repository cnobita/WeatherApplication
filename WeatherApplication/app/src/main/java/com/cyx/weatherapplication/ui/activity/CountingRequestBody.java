package com.cyx.weatherapplication.ui.activity;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/**
 * Created by cyx623823 on 2017/3/25.
 */

public class CountingRequestBody extends RequestBody{

    public CountingRequestBody(RequestBody delegate , Listener listener){
        this.delegate = delegate;
        this.listener = listener;
    }

    @Override
    public MediaType contentType() {
        return delegate.contentType();
    }

    @Override
    public void writeTo(BufferedSink sink) throws IOException {
        countingSink = new CountingSink(sink);
        BufferedSink bufferedSink = Okio.buffer(countingSink);
        delegate.writeTo(bufferedSink);
        bufferedSink.flush();
    }

    @Override
    public long contentLength(){
        try {
            return delegate.contentLength();
        } catch (IOException e) {
            return -1;
        }
    }

    protected final class CountingSink extends ForwardingSink{
        private long bytesWrittem;
        public CountingSink(Sink delegate){
            super(delegate);
        }

        @Override
        public void write(Buffer source, long byteCount) throws IOException {
            super.write(source, byteCount);
            bytesWrittem += byteCount;
            listener.onRequestProgress(bytesWrittem,contentLength());
        }
    }

    protected RequestBody delegate;
    private Listener listener;
    private CountingSink countingSink;
    public static interface Listener{
        void onRequestProgress(long bytesWrittem , long contentLength);//byteWrited为已写入的字节数
    }
}
