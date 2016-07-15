package com.zgl.personal.zglmvp.bean;

/**
 * Created by 小立子 on 2016/7/14.
 *
 * 实体类
 */

public class AvatarBean
{
    private int avatarDrawable;
    private String avatarName;

    public AvatarBean(int avatarDrawable, String avatarName)
    {
        this.avatarDrawable = avatarDrawable;
        this.avatarName = avatarName;
    }

    public int getAvatarDrawable()
    {
        return avatarDrawable;
    }

    public String getAvatarName()
    {
        return avatarName;
    }


    public void setAvatarDrawable(int avatarDrawable)
    {
        this.avatarDrawable = avatarDrawable;
    }

    public void setAvatarName(String avatarName)
    {
        this.avatarName = avatarName;
    }
}
