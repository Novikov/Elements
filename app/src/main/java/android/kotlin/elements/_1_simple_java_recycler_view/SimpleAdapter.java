package android.kotlin.elements._1_simple_java_recycler_view;

import android.content.Context;
import android.kotlin.elements.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {
    //Список элементов
    List<String> strings;

    //количество ViewVholders, которых будут переиспользоваться
    private static int viewHolderCount;
    private Context parent;

    public SimpleAdapter(List<String> strings, Context parent) {
        this.strings = strings;
        this.parent = parent;
        viewHolderCount = 0;
    }

    //Данынй метод будет вызываться меньше, чем число элементов.
    //Каждый раз при вызове данного метода - будет создаваться новый ViewHolder.
    //Затем они будут переиспользоваться.

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        //LayoutInflater - это класс который позволяет из xml создавать новые представления
        LayoutInflater inflater = LayoutInflater.from(context);

        //parent - родительский элемент. false - необяхательный параметр. Говорит нужно ли созданный элемент помещать внутрь родителя. У нас parent
        //это RecyclerView - он и сам это сделает
        View view = inflater.inflate(R.layout.simple_java_recycler_view_item, parent, false);

        SimpleViewHolder simpleViewHolder = new SimpleViewHolder(view);

        simpleViewHolder.indexTV.setText("ViewHolder indexTV: " + viewHolderCount);

        viewHolderCount++;

        return simpleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        holder.bind(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }
}
