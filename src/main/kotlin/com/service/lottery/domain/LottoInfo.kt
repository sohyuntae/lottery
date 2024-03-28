package com.service.lottery.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class LottoInfo(
    @Id
    var lKey: Long,
    @Column
    var lYear: Long,
    @Column
    var lDate: LocalDate,
    @Column
    var lNumber1: Long,
    @Column
    var lNumber2: Long,
    @Column
    var lNumber3: Long,
    @Column
    var lNumber4: Long,
    @Column
    var lNumber5: Long,
    @Column
    var lNumber6: Long,
    @Column
    var lNumberB: Long
)
