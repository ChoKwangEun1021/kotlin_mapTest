package com.jaewook.android_kakaomap

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import net.daum.mf.map.api.CalloutBalloonAdapter
import net.daum.mf.map.api.MapPOIItem

class CustomBalloonAdapter(inflater: LayoutInflater): CalloutBalloonAdapter {
    val mCalloutBalloon: View = inflater.inflate(R.layout.balloon_layout, null)
    val name: TextView = mCalloutBalloon.findViewById(R.id.ball_tv_name)
    val address: TextView = mCalloutBalloon.findViewById(R.id.ball_tv_address)

    override fun getCalloutBalloon(poiItem: MapPOIItem?): View {
        // 마커 클릭 시 나오는 말풍선
        name.text = poiItem?.itemName   // 해당 마커의 정보 이용 가능
        address.text = "getCalloutBalloon"
        return mCalloutBalloon
    }

    override fun getPressedCalloutBalloon(poiItem: MapPOIItem?): View {
        // 말풍선 클릭 시
        address.text = "getPressedCalloutBalloon"
        return mCalloutBalloon
    }
}