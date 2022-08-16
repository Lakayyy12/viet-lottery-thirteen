package com.application.vietlotterythirteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_guides_page.*

class GuidesPage : AppCompatActivity() {

    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myModelList2: ArrayList<MyModel2>
    private lateinit var Adapter: Adapter
    private lateinit var Adapter2: Adapter2

    private var btnG1 : TextView? = null
    private var btnG2 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guides_page)

        btnG1 = findViewById(R.id.btnG1)
        btnG1?.setOnClickListener {
            val intent = Intent(this, PolicyPage::class.java)
            startActivity(intent)}

            btnG2 = findViewById(R.id.btnG2)
            btnG2?.setOnClickListener {
                val intent = Intent(this, TermsPage::class.java)
                startActivity(intent)}

            //init actionbar
            loadCards()
            //add page change listener
            viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    //change title of actionbar
                    var title = myModelList[position].title
                }

                override fun onPageSelected(position: Int) {
                }

                override fun onPageScrollStateChanged(state: Int) {
                }
            })
        }

    private fun loadCards() {
        myModelList = ArrayList()
        myModelList2 = ArrayList()

        myModelList.add(MyModel(
            "1. Kiểm tra Thống kê",
            R.string.g1,
            R.drawable.lottto
        ))

        myModelList.add(MyModel(
            "2. Sử dụng thuật số học",
            R.string.g2,
            R.drawable.lottto
        ))

        myModelList.add(MyModel(
            "3. Sử dụng các con số may mắn",
            R.string.g3,
            R.drawable.lottto
        ))

        myModelList.add(MyModel(
            "4. Các số ngẫu nhiên",
            R.string.g4,
            R.drawable.lottto
        ))

        myModelList.add(MyModel(
            "5. Chọn số trên 31",
            R.string.g5,
            R.drawable.lottto
        ))

        myModelList.add(MyModel(
            "6. Tạo khuôn mẫu khi chọn số",
            R.string.g6,
            R.drawable.lottto
        ))

        myModelList2.add(MyModel2(
            "Mẹo 1",
            R.string.t1
        ))

        myModelList2.add(MyModel2(
            "Mẹo 2",
            R.string.t2
        ))

        myModelList2.add(MyModel2(
            "Mẹo 3",
            R.string.t3
        ))

        myModelList2.add(MyModel2(
            "Mẹo 4",
            R.string.t4
        ))

        Adapter = Adapter(this, myModelList)
        Adapter2 = Adapter2(this, myModelList2)

        viewPager.adapter = Adapter
        viewPager20.adapter = Adapter2

        viewPager.setPadding(100, 0, 100, 0)
    }
}
