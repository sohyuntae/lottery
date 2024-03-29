package com.service.lottery.service

import com.netflix.dgs.codegen.generated.types.Lottery
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery

@DgsComponent
class LotteryServiceImpl() :LotteryService {

    @DgsQuery
    override fun findLottoList(): Lottery {
        TODO("Not yet implemented")
    }
}
