package com.example.voltenprocductprice;

public class Single {
    private String S_Title;
    private String S_Category;
    private String S_Description;
    private int S_Thumbnail;

    public Single() {
    }

    public Single(String s_Title, String s_Category, String s_Description, int s_Thumbnail) {
        S_Title = s_Title;
        S_Category = s_Category;
        S_Description = s_Description;
        S_Thumbnail = s_Thumbnail;
    }

    public String getS_Title() {
        return S_Title;
    }

    public String getS_Category() {
        return S_Category;
    }

    public String getS_Description() {
        return S_Description;
    }

    public int getS_Thumbnail() {
        return S_Thumbnail;
    }

    public void setS_Title(String s_Title) {
        S_Title = s_Title;
    }

    public void setS_Category(String s_Category) {
        S_Category = s_Category;
    }

    public void setS_Description(String s_Description) {
        S_Description = s_Description;
    }

    public void setS_Thumbnail(int s_Thumbnail) {
        S_Thumbnail = s_Thumbnail;
    }
}
