package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 拼多多图片上传
 * Created by 大舒 on 2018/4/17.
 */
public class ImageUploadRequest {

    private String type = "pdd.goods.image.upload";
    /**
     * 图片base64
     */
    private String image;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
