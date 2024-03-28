package com.service.lottery.service

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.service.lottery.domain.LottoInfo

@DgsComponent
class LotteryServiceImpl:LotteryService {

    @DgsQuery
    override fun findLottoList(): LottoInfo {
        TODO("Not yet implemented")
    }
}
