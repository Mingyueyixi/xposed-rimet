package com.sky.xposed.rimet.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @Author: Lu
 * Date: 2022/04/07
 * Description:
 */
public class LogUtil {
    private static String TAG = ">>>";

    public static int v(Object... msg) {
        return Log.v(TAG, buildLog(msg));
    }

    public static int d(Object... msg) {
        return Log.d(TAG, buildLog(msg));
    }

    public static int i(Object... msg) {
        return Log.i(TAG, buildLog(msg));
    }

    public static int w(Object... msg) {
        return Log.w(TAG, buildLog(msg));
    }

    public static int e(Object... msg) {
        return Log.e(TAG, buildLog(msg));
    }


    public static String buildLog(Object... msgs) {
        if (msgs.length == 1) {
            if (msgs[0] instanceof Throwable) {
                return Log.getStackTraceString((Throwable) msgs[0]);
            } else {
                return msgs[0] + "";
            }
        }
        StringBuffer sb = new StringBuffer();
        for (Object msg : msgs) {
            if (msg instanceof Throwable) {
                sb.append(Log.getStackTraceString((Throwable) msg) + "\n");
            } else {
                sb.append("  " + msg);
            }
        }
        return String.valueOf(sb);
    }
}
