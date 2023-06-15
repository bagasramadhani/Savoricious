package com.infinitelearning.savoricious;

public class makanan {
private String nama,description;
private Integer image,baeckground,button;

    public makanan(String nama, String description, Integer image, Integer baeckground, Integer button) {
        this.nama = nama;
        this.description = description;
        this.image = image;
        this.baeckground = baeckground;
        this.button = button;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getBaeckground() {
        return baeckground;
    }

    public void setBaeckground(Integer baeckground) {
        this.baeckground = baeckground;
    }

    public Integer getButton() {
        return button;
    }

    public void setButton(Integer button) {
        this.button = button;
    }
}
