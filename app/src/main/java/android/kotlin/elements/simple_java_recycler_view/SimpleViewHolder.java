package android.kotlin.elements.simple_java_recycler_view;

import android.kotlin.elements.R;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    TextView indexTV;
    TextView textTV;

    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);

        indexTV = itemView.findViewById(R.id.indexTextViewJavaItem);
        textTV = itemView.findViewById(R.id.textTextViewJavaItem);
    }

    //В данном методе только поле textTV т.к индекс инициализируется при создании ViewHolders в Адаптере непосредственно через обращение к полю
    public void bind(String text){
        this.textTV.setText(text);
    }
}
