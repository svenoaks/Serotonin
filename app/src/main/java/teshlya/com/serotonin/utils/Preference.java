package teshlya.com.serotonin.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import teshlya.com.serotonin.R;

public class Preference {
    public static ArrayList<String> starList;

    public static void saveStarToSharedPrefs(Context context) {
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(starList);
        prefsEditor.putString("starList", json);
        prefsEditor.commit();
    }

    public static void getStarFromSharedPrefs(Context context) {
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        Gson gson = new Gson();
        String json = appSharedPrefs.getString("starList", "");
        starList = gson.fromJson(json, new TypeToken<ArrayList<String>>(){}.getType());
        if (starList == null)
            starList = new ArrayList<>();
    }

    public static void savePopupMenuToSharedPrefs(Context context, int paramInt)
    {
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        prefsEditor.putInt("idCheckedButton", paramInt);
        prefsEditor.commit();
    }

    public static int getPopupmenuFromSharedPrefs(Context paramContext)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()).getInt("idCheckedButton", R.id.hot);
    }
}
