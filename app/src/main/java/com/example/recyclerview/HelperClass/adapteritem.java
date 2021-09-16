package com.example.recyclerview.HelperClass;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.RelativeLayout;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import com.example.recyclerview.R;
        import java.util.ArrayList;

public class adapteritem extends RecyclerView.Adapter<adapteritem.ItemViewHold>  {

    ArrayList<itemHelper> itemLocations;
    final private ListItemClickListener mOnClickListener;
    
    public adapteritem(ArrayList<itemHelper> itemLocations, ListItemClickListener listener) {
        this.itemLocations = itemLocations;
        mOnClickListener = listener;
    }

    @NonNull

    @Override
    public ItemViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new ItemViewHold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHold holder, int position) {


        itemHelper itemhelper = itemLocations.get(position);
        holder.image.setImageResource(itemhelper.getImage());
        holder.title.setText(itemhelper.getTitle());
        holder.price.setText(itemhelper.getPrice());
        holder.quantity.setText(itemhelper.getQuantity());
    }

    @Override
    public int getItemCount() {
        return itemLocations.size();

    }

    public interface ListItemClickListener {
        void onphoneListClick(int clickedItemIndex);
    }

    public class ItemViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {


        ImageView image;
        TextView title;
        TextView quantity;
        TextView price;
        //LinearLayout linearLayout;


        public ItemViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            //hooks

            image = itemView.findViewById(R.id.item_image);
            title = itemView.findViewById(R.id.item_title);
            quantity=itemView.findViewById(R.id.item_numbers_avilable);
            price=itemView.findViewById(R.id.item_price);
            //linearLayout = itemView.findViewById(R.id.background_color);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onphoneListClick(clickedPosition);
        }
    }

}

