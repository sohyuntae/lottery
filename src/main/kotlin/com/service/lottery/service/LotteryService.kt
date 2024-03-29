package com.service.lottery.service

import com.netflix.dgs.codegen.generated.types.Lottery

interface LotteryService {
    fun findLottoList(): Lottery
}
