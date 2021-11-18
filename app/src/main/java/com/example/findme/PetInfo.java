package com.example.findme;

import android.location.Location;

import com.google.firebase.firestore.GeoPoint;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PetInfo {
    private String date;
    private ArrayList<String> img;
    private GeoPoint location;
    private String name;
    private String profile;


    public PetInfo(){
        super();
        this.img = new ArrayList<>(4);
        for(int i=0 ; i<4; i++){
            this.img.
                    add("https://firebasestorage.googleapis.com/v0/b/findme-a2f27.appspot.com/o/pet-info%2FGold%2Fgold_fail_casejpg.jpg?alt=media&token=b74d2b08-bddf-4b25-a241-c23f6237216a");
        }
    }

//    public PetInfo(PetInfo p){
//        this.date = p.getDate();
//        this.name = p.getName();
//        this.detail = p.getDetail();
//        this.location[0] = p.getLocation()[0];
//        this.location[1] = p.getLocation()[1];
//        for(int i=0 ; i<4; i++){
//            this.profile_images[i] = p.getImage()[i];
//        }
//    }
//
    public PetInfo( Date date, String[] profile_images,
                    GeoPoint location, String name, String profile){
        super();
        this.date = String.valueOf(date);
        this.name = name;
        this.profile = profile;
        this.location = new GeoPoint(location.getLatitude(), location.getLongitude());
        this.img = new ArrayList<>(4);
        for(int i=0 ; i<4; i++){
            this.img.add( profile_images[i]);
        }

    }

    public PetInfo sample_data(){
        Date test_date = new Date(2021, 10, 14, 12, 27, 31);
        String[] url = {
                "https://firebasestorage.googleapis.com/v0/b/findme-a2f27.appspot.com/o/pet-info%2FRudy%2FRudy_1.PNG?alt=media&token=55441885-a6f5-4057-a466-62f0c8d68713",
        "https://firebasestorage.googleapis.com/v0/b/findme-a2f27.appspot.com/o/pet-info%2FRudy%2FRudy_2.PNG?alt=media&token=1462d18d-129b-4004-889a-d32f7f62d899",
        "https://firebasestorage.googleapis.com/v0/b/findme-a2f27.appspot.com/o/pet-info%2FRudy%2FRudy_3.PNG?alt=media&token=fd9d959b-39c2-4f53-9405-305158f0fc66",
        "https://firebasestorage.googleapis.com/v0/b/findme-a2f27.appspot.com/o/pet-info%2FRudy%2FRudy_4.PNG?alt=media&token=58329336-5b9c-4341-88fb-f407e1f2b76f"
        };
        GeoPoint loc_arr = new GeoPoint(36.373611,127.358528);
        return new PetInfo(test_date, url, loc_arr,
                "Rudy","I lost her in front of E3. He is wearing a yellow lead. Please find herTT ");
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
//        Date tmp = format.format(date)
//        return format.format(date);
        return date;
    }

    public void setDate(Date date) {
        this.date = String.valueOf(date);
    }

    public String getProfile(){
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public GeoPoint getLocation(){
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = new GeoPoint(location.getLatitude(), location.getLongitude());
    }

    public ArrayList<String> getImage(){
        // image load library url을 바로 연결할 수 있음.
        return img;
    }

    public void setImg(String[] img) {
        for(int i = 0 ; i<4 ; i++) {
            this.img.add(img[i]);
        }
    }
}
