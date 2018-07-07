package com.weightogo;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    private SharedPreferences sharedPref;
    private Context context;

//    public SharedPreference(Context context){
//        this.context = context;
//        sharedPref = context.getSharedPreferences(context.getResources().getString(R.string.login_preferences, Context.MODE_PRIVATE));
//    }

//    public void writeLoginStatus (boolean status){
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putBoolean(context.getResources().getString(R.string.login_status_preferences, status));
//        editor.commit();
//    }

    public boolean readLoginStatus(){
        boolean status = false;
        status = sharedPref.getBoolean(context.getResources().getString(R.string.login_status_preferences), false);
        return status;
    }

}
