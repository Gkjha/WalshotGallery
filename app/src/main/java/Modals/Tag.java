package Modals;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {
    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
