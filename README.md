# CDialog
AlertDialog 换了一点小样式
Preview
![cdilog](https://github.com/CSnowStack/CDIalog/blob/master/imgs/c.gif)
![cdilog](https://github.com/CSnowStack/CDIalog/blob/master/imgs/c1.gif)
![cdilog](https://github.com/CSnowStack/CDIalog/blob/master/imgs/c2.gif)
use
```java
      CDialog.Builder builder = new CDialog.Builder(this);
      builder.setTitle("标题").setMessage("具体内容")
              .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      Toast.makeText(MainActivity.this, "确认", Toast.LENGTH_SHORT).show();
                  }
              }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
          }
      }).show();


      CDialog.Builder builder = new CDialog.Builder(this);
      builder.setView(R.layout.dialog_edt).setOnPrepareViewListener(new CController.CParams.OnPrepareViewListener() {
          @Override
          public void onPrepareListView(View contentView) {
              EditText edt = (EditText) contentView.findViewById(R.id.edt);
              edt.setHint("请输入邮箱");
          }
      }).setPositiveButton("确认", false, new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              Toast.makeText(MainActivity.this, "确认", Toast.LENGTH_SHORT).show();
          }
      }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
          }
      }).show();



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
```
