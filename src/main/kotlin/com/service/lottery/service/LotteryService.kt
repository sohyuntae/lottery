package com.service.lottery.service

import com.service.lottery.domain.LottoInfo

interface LotteryService {
    fun findLottoList(): LottoInfo
}
