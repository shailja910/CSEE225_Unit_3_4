package com.example.a;

public class P24Student
{
    int img;
    String mainTitle,subTitle;
    P24Student(int img,String mainTitle,String subTitle)
    {
        this.img=img;
        this.mainTitle=mainTitle;
        this.subTitle=subTitle;

    }
    public int getImg()
    {
        return  img;

    }

    public String getMainTitle() {
        return mainTitle;
    }
    public String getSubTitle()
    {
        return subTitle;
    }
}
