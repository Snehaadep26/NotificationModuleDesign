package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;

public class GetPendingUsersResponse {
    public ArrayList<Object> items;
    public Meta meta;
    public Links links;
    public SettingsPendingUser settings;

    public GetPendingUsersResponse(ArrayList<Object> items, Meta meta, Links links, SettingsPendingUser settings) {
        this.items = items;
        this.meta = meta;
        this.links = links;
        this.settings = settings;
    }

    public ArrayList<Object> getItems() {
        return items;
    }

    public Meta getMeta() {
        return meta;
    }

    public Links getLinks() {
        return links;
    }

    public SettingsPendingUser getSettings() {
        return settings;
    }
}

