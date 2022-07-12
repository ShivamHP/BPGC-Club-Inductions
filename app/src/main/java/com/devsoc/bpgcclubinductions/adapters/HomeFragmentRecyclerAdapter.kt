package com.devsoc.bpgcclubinductions.adapters
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.devsoc.bpgcclubinductions.R
import com.devsoc.bpgcclubinductions.models.Club
import kotlinx.coroutines.launch

class EventsRecyclerAdapter(private val mList: List<Club>, private val context: Context, private val viewLifecycleOwner: LifecycleOwner) : RecyclerView.Adapter<EventsRecyclerAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_tile_club, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentPlayground = mList[position]

//        val playgroundNameTextView: TextView = holder.itemView.findViewById(R.id.playgroundName_tv_card_playground)
//        val imageView: ImageView = holder.itemView.findViewById(R.id.imageView_card_playground)
//        val expandButton: ImageButton = holder.itemView.findViewById(R.id.expandButton_card_playground)

//        playgroundNameTextView.setText(currentPlayground.name)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    }
}