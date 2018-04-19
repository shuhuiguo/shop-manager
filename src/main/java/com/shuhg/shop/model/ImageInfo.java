package com.shuhg.shop.model;

/**
 * 图片信息
 * Created by 大舒 on 2018/3/13.
 */
public class ImageInfo {
    /**
     * 图片url
     */
    private String url;
    /**
     * 宽度
     */
    private int width;
    /**
     * 高度
     */
    private int height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
