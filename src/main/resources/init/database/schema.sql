CREATE TABLE LOTTO_INFO
(
    L_KEY      INT PRIMARY KEY COMMENT '회차',
    L_YEAR     INT COMMENT '년도',
    L_DATE     DATE COMMENT '날짜',
    L_NUMBER_1 INT COMMENT '당첨 번호_1',
    L_NUMBER_2 INT COMMENT '당첨 번호_2',
    L_NUMBER_3 INT COMMENT '당첨 번호_3',
    L_NUMBER_4 INT COMMENT '당첨 번호_4',
    L_NUMBER_5 INT COMMENT '당첨 번호_5',
    L_NUMBER_6 INT COMMENT '당첨 번호_6',
    L_NUMBER_B INT COMMENT '당첨 번호_보너스'
);
