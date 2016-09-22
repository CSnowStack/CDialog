package cq.library.cdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CDialog.Builder builder = new CDialog.Builder(this);

        builder.setView(R.layout.dialog_listview).setOnPrepareViewListener(new CController.CParams.OnPrepareViewListener() {
            @Override
            public void onPrepareListView(View contentView) {
                List<String> datas=new ArrayList<String>();
                datas.add("李狗嗨");
                datas.add("在下坂本有何贵干");
                datas.add("天空之城");
                datas.add("千与千寻");
                ListView lst= (ListView) contentView.findViewById(R.id.lst);
                lst.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,datas));
            }
        }).show();



    }
}
