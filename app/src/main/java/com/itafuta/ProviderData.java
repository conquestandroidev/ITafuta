package com.itafuta;

/**
 * Created by victor on 9/19/16.
 */
public class ProviderData {


    private String  provLocation, provName, provDetails, provFavCount;
    int provImage;
    float provRate;

    //Empty constructor
    ProviderData(){
    }

    //int, int, int, string, string, string, string, float
    ProviderData(int  mImage, String mLocation, String mDetails, String mName, String mFavCount, float mProvRate){
        this.provImage = mImage;
        this.provLocation = mLocation;
        this.provDetails = mDetails;
        this.provName = mName;
        this.provFavCount= mFavCount;
        this.provRate = mProvRate;
    }

    public int getProvImage(){
        return provImage;
    }
    public String getProvLocation() {
        return provLocation;
    }
    public String getProvDetails(){
        return provDetails;
    }
    public String getProvFavCount(){
        return provFavCount;
    }
    public float getProvRate() {
        return provRate;
    }
    public String getProvName(){
        return  provName;
    }

    //SETTERS
    public void setProvImage(int image) {
        this.provImage = image;
    }
    public void setProvLocation(String provLocation) {
        this.provLocation = provLocation;
    }
    public void setProvDetails(String details){
        this.provDetails = details;
    }
    public void setProvFavCount(String favCount){
        this.provFavCount = favCount;
    }
    public void setProvName(String name){
        this.provName = name;
    }
    public void setProvRate(float provRate) {
        this.provRate = provRate;
    }
}
