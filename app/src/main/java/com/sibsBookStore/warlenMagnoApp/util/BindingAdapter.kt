package com.sibsBookStore.warlenMagnoApp.util

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.api.load
import com.bumptech.glide.Glide
import com.github.florent37.glidepalette.BitmapPalette
import com.github.florent37.glidepalette.GlidePalette
import com.sibsBookStore.warlenMagnoApp.R


@BindingAdapter("android:src", "palette")
fun bindingImage(imageView: ImageView, path: String?, palette: View?) {

    path?.let {
        Glide.with(imageView.context)
            .load(it)
            .error(ContextCompat.getDrawable(imageView.context, R.drawable.loading))
            .listener(
                palette?.let {
                    GlidePalette.with(path)
                        .use(BitmapPalette.Profile.VIBRANT)
                        .intoBackground(it)
                        .crossfade(true)
                }
            )
            .into(imageView)
    }
}

@BindingAdapter("loadImage")
fun loadImage(imageView: ImageView, url: String?) {
    url?.let {
        imageView.load(it) {
            placeholder(R.drawable.loading)
        }
    }
}

/**
 * binding for the rating bar, and divide it by 2 t
 */


@BindingAdapter("android:rating")
fun setRating(view: RatingBar?, rating: Double) {

    if (view != null) {
        val rate = rating.toFloat()
        view.rating = rate/2
    }
}


@BindingAdapter("time")
fun calculateTime(view:TextView,time: Int){
 val hours = time/60
    val min = time % 60
    view.text = "$hours h: $min m"
}


/** makes visible a view. */
fun View.visible() {
    visibility = View.VISIBLE
}

/** makes gone a view. */
fun View.gone() {
    visibility = View.GONE
}