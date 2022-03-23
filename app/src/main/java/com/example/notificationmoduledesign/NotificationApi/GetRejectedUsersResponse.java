package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;

public class GetRejectedUsersResponse {
    public ArrayList<Item> items;
    public MetaRejectedU meta;
    public LinksRU links;
    public SettingsRU settings;

    public GetRejectedUsersResponse(ArrayList<Item> items, MetaRejectedU meta, LinksRU links, SettingsRU settings) {
        this.items = items;
        this.meta = meta;
        this.links = links;
        this.settings = settings;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public MetaRejectedU getMeta() {
        return meta;
    }

    public LinksRU getLinks() {
        return links;
    }

    public SettingsRU getSettings() {
        return settings;
    }
}


