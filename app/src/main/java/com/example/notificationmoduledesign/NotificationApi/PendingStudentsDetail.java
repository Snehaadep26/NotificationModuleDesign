package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;

public class PendingStudentsDetail {
    public ArrayList<ItemN> itemNS;
    public MetaN metaN;
    public LinksN linksN;
    public SettingsN settingsN;

    public ArrayList<ItemN> getItems() {
        return itemNS;
    }

    public MetaN getMeta() {
        return metaN;
    }

    public LinksN getLinks() {
        return linksN;
    }

    public SettingsN getSettings() {
        return settingsN;
    }
}

