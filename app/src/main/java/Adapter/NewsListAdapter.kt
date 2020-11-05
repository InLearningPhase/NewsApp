package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import kotlinx.android.synthetic.main.item_news.view.*

class NewsListAdapter(private val item: ArrayList<String>) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        val currentItem = item[position]
        holder.titleView.text = currentItem

    }
}

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val titleView: TextView = itemView.findViewById(R.id.title)

}