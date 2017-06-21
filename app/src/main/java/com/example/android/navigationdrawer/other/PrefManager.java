package com.example.android.navigationdrawer.other;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ParcelUuid;

/**
 * Created by zengzhi on 2017/6/21.
 */

public class PrefManager {



    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;


    int PRIVATE_MODE = 0;


    private static final String PREF_NAME = "androidhive-welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";



    public PrefManager(Context context) {

        this.context = context;

        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);

        editor = pref.edit();
    }


    /**
     * 第一次启动
     * @param isFirstTime
     */
    public void setFirstTimeLauch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);

        editor.commit();
    }

    public boolean isFirstTimeLaunch() {


        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
