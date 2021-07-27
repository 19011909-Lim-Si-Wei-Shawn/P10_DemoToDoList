package sg.edu.rp.c346.id19011909.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        lvToDo = findViewById(R.id.ListViewToDo);

        //Setting Action,
        alToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for Movie", date1);
        ToDoItem item2 = new ToDoItem("Go for Haircut", date2);

        alToDoList.add(item1);
        alToDoList.add(item2);

        caToDo = new CustomAdapter(this, R.layout.row, alToDoList);
        lvToDo.setAdapter(caToDo);
    }
}