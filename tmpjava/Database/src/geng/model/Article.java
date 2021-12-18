package geng.model;

public class Article {
    String art_id;
    String art_user_id;
    String art_title;
    String art_type_id;
    String art_content;
    String art_comment_id;
    String art_cre_time;
    Integer art_view;
    Integer art_com_num;
    Integer art_hot_num;
    Integer art_like_num;
    public void setArt_id(String art_id){
        this.art_id=art_id;
    }
    public void setArt_user_id(String art_user_id){
        this.art_user_id=art_user_id;
    }
    public void setArt_title(String art_title){
        this.art_title=art_title;
    }
    public void setArt_type_id(String art_type_id){
        this.art_type_id=art_type_id;
    }
    public void setArt_content(String art_content){
        this.art_content=art_content;
    }
    public void setArt_cre_time(String art_cre_time){
        this.art_cre_time=art_cre_time;
    }
    public void setArt_view(Integer art_view){
        this.art_view=art_view;
    }
    public void setArt_com_num(Integer art_com_num){
        this.art_com_num=art_com_num;
    }
    public void setArt_hot_num(Integer art_hot_num){
        this.art_hot_num=art_hot_num;
    }
    public void setArt_like_num(Integer art_like_num){
        this.art_like_num=art_like_num;
    }
    public void setArt_comment_id(String art_comment_id){
        this.art_comment_id=art_comment_id;
    }

    public String getArt_id(){
        return art_id;
    }
    public String getArt_user_id(){
        return art_user_id;
    }
    public String getArt_title(){
        return art_title;
    }
    public String getArt_type_id(){
        return art_type_id;
    }
    public String getArt_content(){
        return art_content;
    }
    public String getArt_cre_time(){
        return art_cre_time;
    }
    public Integer getArt_view(){
        return art_view;
    }
    public Integer getArt_com_num(){
        return art_com_num;
    }
    public Integer getArt_hot_num(){
        return art_hot_num;
    }
    public Integer getArt_like_num(){
        return art_like_num;
    }
    public String getArt_comment_id(){
        return art_comment_id;
    }
}
