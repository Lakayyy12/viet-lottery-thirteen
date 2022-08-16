package com.application.vietlotterythirteen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_layout_guide.view.*
import kotlinx.android.synthetic.main.card_layout_tips.view.*
import kotlinx.android.synthetic.main.card_layout_tips.view.content2
import kotlinx.android.synthetic.main.card_layout_tips.view.title2

class Adapter (private val context: Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter(){
    override fun getCount(): Int {
        return  myModelArrayList.size
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
     return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.card_layout_guide, container, false)

        val model = myModelArrayList[position]
        val title = model.title
        val description = context.resources.getString(model.description)
        val image = model.image

        view.banner.setImageResource(image)
        view.title.text = title
        view.content.text = description

        view.setOnClickListener{
            Navigator.showContent(context, "$title \n $description")
        }
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}

class Adapter2(private val context: Context, private val myModelArrayList2: ArrayList<MyModel2>): PagerAdapter() {
    override fun getCount(): Int {
        return myModelArrayList2.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.card_layout_tips, container, false)

        val model = myModelArrayList2[position]
        val title = model.title
        val description = context.resources.getString(model.description)

        view.title2.text = title
        view.content2.text = description

        view.setOnClickListener{
            Navigator.showContent2(context, "$title \n $description")
        }
        container.addView(view)
        return view
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}