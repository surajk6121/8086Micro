package com.udemy.suraj.micro;
        import android.content.Intent;
        import android.graphics.Color;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.CardView;
        import android.view.MenuItem;
        import android.view.View;
        import android.view.animation.AnimationUtils;
        import android.widget.GridLayout;
        import android.widget.GridView;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    public void mainact(){
        Intent intent = new Intent(MainActivity.this,ActivityOne.class);
       // intent.putExtra("info","This is activity from card item index  "+finalI);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(MainActivity.this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0){
                    Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                    intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);}
                    if(finalI==1){
                        Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==2){
                        Intent intent = new Intent(MainActivity.this,ActivityThree.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}
                    if(finalI==3){
                        Intent intent = new Intent(MainActivity.this,ActivityFour.class);
                        intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);}

                }
            });
        }
    }
}

