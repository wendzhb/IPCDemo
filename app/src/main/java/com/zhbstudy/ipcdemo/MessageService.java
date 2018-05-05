package com.zhbstudy.ipcdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

/**
 * Created by mtf on 2017/4/11.
 */

public class MessageService extends Service {


//     mBinder 的实例
    private final UserAidl.Stub mBinder = new UserAidl.Stub() {
        @Override
        public String getUserName() throws RemoteException {
            return "test";
        }

        @Override
        public String getUserPwd() throws RemoteException {
            return "123456";
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
