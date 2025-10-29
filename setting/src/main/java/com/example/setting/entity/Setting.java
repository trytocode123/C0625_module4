package com.example.setting.entity;

public class Setting {
    private String language;
    private int size;
    private boolean spamFilter;
    private String signature;

    public Setting() {
    }

    public Setting(String signature, boolean spamFilter, int size, String language) {
        this.signature = signature;
        this.spamFilter = spamFilter;
        this.size = size;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
