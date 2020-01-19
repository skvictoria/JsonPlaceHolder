package ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newproject0112.R
import com.example.newproject0112.databinding.ItemPhotoBinding
import model.Photo

class PhotoAdapter: RecyclerView.Adapter<PhotoAdapter.PhotoViewholder>() {
    private lateinit var photoList: List<Photo>

    override fun getItemCount(): Int {
        return photoList.size
    }

    override fun onBindViewHolder(holder: PhotoViewholder, position: Int) {
        holder.bind(photoList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewholder =
        PhotoViewholder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_photo,
                parent,
                false
            )
        )
//        val binding: ItemPhotoBinding = DataBindingUtil.inflate(
//            LayoutInflater.from(parent.context),
//            R.layout.item_photo,
//            parent,
//            false
//        )
//        return PhotoViewholder(binding)


/*
    fun updatePhotoList(photoList:List<Photo>){
        this.photoList = photoList
        notifyDataSetChanged()
    }*/

    class PhotoViewholder(view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(photo: Photo) {
            photo.let{
                this.itemView.findViewById<TextView>(R.id.title)?.text = photo.title
            }
        }
    }
    /* RecyclerView.ViewHolder(binding.root){
        private val viewModel = PhotoViewModel()
        fun bind(photo:Photo){
            viewModel.bind(photo)
            binding.viewModel = viewModel
        }
    }*/
}

