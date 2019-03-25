package br.com.bestbrewer.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.bestbrewer.R

class WordListAdapter internal constructor(context: Context) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    //private var words = emptyList<WordEntity>()

    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val wordItemView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListAdapter.WordViewHolder {
        //     val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        //     return WordViewHolder(itemView)
        return WordViewHolder(inflater.inflate(R.layout.recyclerview_item, parent, false))
    }

    override fun onBindViewHolder(holder: WordListAdapter.WordViewHolder, position: Int) {
        //val current = words[position]
        //holder.wordItemView.text = current.word
    }

    internal fun setWords(wordEntities: ArrayList<String>) {
        //this.words = wordEntities
        notifyDataSetChanged()
    }

    override fun getItemCount() = 0 //words.size

}