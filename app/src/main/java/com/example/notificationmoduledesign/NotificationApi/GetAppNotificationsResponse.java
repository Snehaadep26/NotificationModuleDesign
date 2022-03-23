package com.example.notificationmoduledesign.NotificationApi;

import java.util.ArrayList;

public class GetAppNotificationsResponse {
    public ArrayList<Today> today;
    public ArrayList<Yesterday> yesterday;
    public ArrayList<Week> week;
    public ArrayList<Month> month;
    public int count;
    public int annoucementCount;
    public int assignmentCount;
    public int registrationRequest;
    public int testCount;
    public int pendingCount;
    public int rejectedCount;
    public int feeCount;
    public int othersCount;
    public ArrayList<String> categories;
    public Settings settings;

    public GetAppNotificationsResponse(ArrayList<Today> today, ArrayList<Yesterday> yesterday, ArrayList<Week> week, ArrayList<Month> month, int count, int annoucementCount, int assignmentCount, int registrationRequest, int testCount, int pendingCount, int rejectedCount, int feeCount, int othersCount, ArrayList<String> categories, Settings settings) {
        this.today = today;
        this.yesterday = yesterday;
        this.week = week;
        this.month = month;
        this.count = count;
        this.annoucementCount = annoucementCount;
        this.assignmentCount = assignmentCount;
        this.registrationRequest = registrationRequest;
        this.testCount = testCount;
        this.pendingCount = pendingCount;
        this.rejectedCount = rejectedCount;
        this.feeCount = feeCount;
        this.othersCount = othersCount;
        this.categories = categories;
        this.settings = settings;
    }

    public ArrayList<Today> getToday() {
        return today;
    }

    public ArrayList<Yesterday> getYesterday() {
        return yesterday;
    }

    public ArrayList<Week> getWeek() {
        return week;
    }

    public ArrayList<Month> getMonth() {
        return month;
    }

    public int getCount() {
        return count;
    }

    public int getAnnoucementCount() {
        return annoucementCount;
    }

    public int getAssignmentCount() {
        return assignmentCount;
    }

    public int getRegistrationRequest() {
        return registrationRequest;
    }

    public int getTestCount() {
        return testCount;
    }

    public int getPendingCount() {
        return pendingCount;
    }

    public int getRejectedCount() {
        return rejectedCount;
    }

    public int getFeeCount() {
        return feeCount;
    }

    public int getOthersCount() {
        return othersCount;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public Settings getSettings() {
        return settings;
    }
}

