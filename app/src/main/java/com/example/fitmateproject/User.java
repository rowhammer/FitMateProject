package com.example.fitmateproject;

public class User {
    private String mId, mName, mAge, mHeight, mWeight, mIdealWeight;

    public User() {

    }

    User(String mId, String mName, String mAge, String mHeight, String mWeight, String mIdealWeight ) {
        this.mId = mId;
        this.mName = mName;
        this.mAge = mAge;
        this.mHeight = mHeight;
        this.mWeight = mWeight;
        this.mIdealWeight = mIdealWeight;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId){
        this.mId = mId;
    }

    String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    String getmHeight() {
        return mHeight;
    }

    public void setmHeight(String mHeight) {
        this.mHeight = mHeight;
    }

    String getmWeight() {
        return mWeight;
    }

    public void setmWeight(String mWeight) {
        this.mWeight = mWeight;
    }

    String getmIdealWeight() {
        return mIdealWeight;
    }

    public void setmIdealWeight(String mDesc) {
        this.mIdealWeight = mIdealWeight;
    }
}
