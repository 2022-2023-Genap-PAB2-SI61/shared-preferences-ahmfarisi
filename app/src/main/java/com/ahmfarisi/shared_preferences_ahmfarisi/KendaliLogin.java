package com.ahmfarisi.shared_preferences_ahmfarisi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class KendaliLogin {
    private Context ctx;
    private SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(ctx);
    private SharedPreferences.Editor prefEditor;

    public KendaliLogin(Context ctx) {
        this.ctx = ctx;
    }

    public void setPref(String key, String value){
        prefEditor = pref.edit();
        prefEditor.putString(key, value);
        prefEditor.commit();
    }

    public String getPref(String key){
        return pref.getString(key, "Undefined Value!");
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
