package com.example.greekfreechat;

class cards {
    private  String userId;
    private  String name;
    private  String profileImageUrl;
    public  cards(String userId,String name,String profileImageUrl){
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }


    public  String GetUserId()
    {
        return  userId;
    }

    public  void setUserId(String userId)
    {
        this.userId=userId;
    }

    public  String GetNameId()
    {
        return  name;
    }

    public  void setName(String name)
    {
        this.name=name;
    }

    public  String GetProfileImageUrl()
    {
        return  profileImageUrl;
    }

    public  void setProfileImageUrl(String profileImageUrl)
    {
        this.profileImageUrl=profileImageUrl;
    }

}
