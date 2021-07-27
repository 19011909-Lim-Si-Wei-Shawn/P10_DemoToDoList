package sg.edu.rp.c346.id19011909.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    //Creating Variable,
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> PositionList;

    //Creating Class,
    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects)
    {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        PositionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Getting LayoutInflater Object,
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Inflating View for Each Row,
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtaining UI Components with Binding,
        TextView tvTitle = rowView.findViewById(R.id.TitleTV);
        TextView tvDate = rowView.findViewById(R.id.dateTV);

        //Obtaining Android Version Information using Position,
        ToDoItem Current = PositionList.get(position);

        //Setting Value to TextView with Information,
        tvTitle.setText(Current.getTitle());
        tvDate.setText(Current.toString());

        return rowView;
    }
}
