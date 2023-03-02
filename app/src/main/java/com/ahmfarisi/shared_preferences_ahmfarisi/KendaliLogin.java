package com.ahmfarisi.shared_preferences_ahmfarisi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class KendaliLogin {
    private Context ctx;
    private SharedPreferences pref;
    private SharedPreferences.Editor prefEditor;
    public static String keyPrefUsername = "61nPQLtX6NYRuiGufJzPrA==Username";
    public static String dataUsername1 = "ahmfarisi";
    public static String dataPassword1 = "terserah";
    public static String dataUsername2 = "ricky";
    public static String dataPassword2 = "milanforever";

    public KendaliLogin(Context ctx) {
        this.ctx = ctx;
    }

    public void setPref(String key, String value){
        pref  = PreferenceManager.getDefaultSharedPreferences(ctx);
        prefEditor = pref.edit();
        prefEditor.putString(key, value);
        prefEditor.commit();
    }

    public String getPref(String key){
        pref  = PreferenceManager.getDefaultSharedPreferences(ctx);
        return pref.getString(key, null);
    }

    public Boolean isLogin(String key){
        if(getPref(key) != null){
            return true;
        }
        else{
            return false;
        }
    }

}
