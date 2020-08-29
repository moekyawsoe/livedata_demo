package dev.mks.viewmodeldemo;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MyRandomNumberGenerator extends ViewModel {
    private String TAG = this.getClass().getSimpleName();
    private String myRandomData;

    public String getNumber(){
        if (myRandomData == null){
            createNumber();
        }
        return myRandomData;
    }

    private void createNumber() {
        Random random = new Random();
        myRandomData = "Number : " + (random.nextInt(10-1)+1);
    }
}
