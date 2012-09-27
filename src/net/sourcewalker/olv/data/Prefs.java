package net.sourcewalker.olv.data;

import net.sourcewalker.olv.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * Provides access to the preferences of this application.
 * 
 * @author Robert &lt;xperimental@solidproject.de&gt;
 */
public class Prefs {

    private final SharedPreferences preferences;
    private final String keyDeviceAddress;

    public Prefs(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        keyDeviceAddress = context.getString(R.string.prefs_deviceaddress_key);
    }

    public String getDeviceAddress() {
        return preferences.getString("device.address", null);
    }
    
    public Boolean getmenushowfindmyphone()
    {
    	return preferences.getBoolean("menu.findmyphonevisible", false);
    }
    
    public Boolean getmenushownotifications()
    {
    	return preferences.getBoolean("menu.notificationsvisible", false);
    }
    
    public Boolean getmenushowmedianext()
    {
    	return preferences.getBoolean("menu.medianextvisible", false);
    }
    
    public Boolean getmenushowmediaplay()
    {
    	return preferences.getBoolean("menu.mediaplayvisible", false);
    }  
    
    public Boolean getmenushowmediaprevious()
    {
    	return preferences.getBoolean("menu.mediapreviousvisible", false);
    }    
    
    public Boolean getenabletimeout()
    {
    	return preferences.getBoolean("system.enabletimeout", false);
    }

    public Boolean getenablemediamenu()
    {
    	return preferences.getBoolean("media.enablemenu", false);
    }  
    
    public void setDeviceAddress(String address) {
        Editor editor = preferences.edit();
        editor.putString(keyDeviceAddress, address);
        editor.commit();
    }
}
