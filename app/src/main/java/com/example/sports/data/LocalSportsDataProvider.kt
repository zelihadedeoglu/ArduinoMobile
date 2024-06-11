//LocalSportsDataProvider.kt

package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sport

object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.led,
                subtitleResourceId = R.string.ledgenel,
                playerCount = 9 ,
                olympic = true,
                imageResourceId = R.drawable.led,
                sportsImageBanner = R.drawable.ledbuyuk,
                sportDetails = R.string.ledgenel
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.buton,
                subtitleResourceId = R.string.butongenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.buton,
                sportsImageBanner = R.drawable.butonbuyuk,
                sportDetails = R.string.butongenel
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.potas,
                subtitleResourceId = R.string.potasgenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.potas,
                sportsImageBanner = R.drawable.potasbuyuk,
                sportDetails = R.string.potasgenel
            ),Sport(
                id = 4,
                titleResourceId = R.string.servo,
                subtitleResourceId = R.string.servogenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.servo,
                sportsImageBanner = R.drawable.servobuyuk,
                sportDetails = R.string.servogenel
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.mb,
                subtitleResourceId = R.string.mbgenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.mb,
                sportsImageBanner = R.drawable.mbbuyuk,
                sportDetails = R.string.mbgenel
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.lcd,
                subtitleResourceId = R.string.lcdgenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.lcd,
                sportsImageBanner = R.drawable.lcdbuyuk,
                sportDetails = R.string.lcdgenel
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.segment,
                subtitleResourceId = R.string.segmentgenel,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.segment,
                sportsImageBanner = R.drawable.segmentbuyuk,
                sportDetails = R.string.segmentgenel
            ),


        )
    }
}