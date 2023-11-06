package pe.edu.idat.apprecyclerviewimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

import pe.edu.idat.apprecyclerviewimage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AndroidAdapter androidAdapter = new AndroidAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvandroid.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvandroid.setAdapter(androidAdapter);
        androidAdapter.setData(getData());

    }

    private ArrayList<Android> getData(){
        ArrayList<Android> list = new ArrayList<>();
        list.add(new Android(list.size() + 1,
                R.drawable.image1,
                "Angel cake",
                        "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image2,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image3,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image4,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image5,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image6,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image7,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() + 1,
                R.drawable.image8,
                "Angel cake",
                "Android 1.0"));
        return list;
    }
}