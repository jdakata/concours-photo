package model;

import java.util.HashMap;

class User {
    public final Integer id;
    public final String username;

    public final HashMap<Setting, UserSetting> settings;

    public User() {
        this(null, new HashMap<>(), null);
    }

    public User(String username, HashMap<Setting, UserSetting> settings, Integer id) {
        this.id = id;
        this.username = username;
        this.settings = settings;
    }

    public User(String username, HashMap<Setting, UserSetting> settings) {
        this(username, settings, null);
    }

    public User getPublicProfile() {
        HashMap<Setting, UserSetting> publicSettings = new HashMap<>();
        
        this.settings.forEach((setting, userSetting) -> { 
            if (userSetting.isPublic)
                publicSettings.put(setting, userSetting);
        });

        return new User(this.username, publicSettings, this.id);
    }
}