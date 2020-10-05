package com.fatdevs.list.adaptor
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fatdevs.list.Affirmation
import com.fatdevs.list.R
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false))
    }// layout inflater converts xml layout file into View
    override fun getItemCount(): Int { // takes the size
        return dataset.size
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item = dataset[position]
       holder.textView.text = context.resources.getString(item.stringResourceId)
    }
}