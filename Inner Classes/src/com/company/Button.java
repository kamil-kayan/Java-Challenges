package com.company;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

        //An interface that handles the onclick(S t) method
    public interface OnClickListener{
        public void onClick(String title);
    }

}
