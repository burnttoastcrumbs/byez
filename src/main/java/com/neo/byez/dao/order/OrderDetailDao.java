package com.neo.byez.dao.order;


import com.neo.byez.domain.ReviewDto;
import com.neo.byez.domain.order.OrderDetailDto;

import java.util.List;
import java.util.Map;

public  interface OrderDetailDao {
    int count(String ord_num) throws Exception;
    int countAll() throws Exception;
    int insert(OrderDetailDto orderDetailDto) throws Exception;
    List<OrderDetailDto> select(String ord_num) throws Exception;
    List<OrderDetailDto> selectAll(String id) throws Exception;
    int update(OrderDetailDto orderDetailDto) throws Exception;
    int delete(String ord_num) throws Exception;
    int deleteAll() throws Exception;

     int getCount() throws Exception;
     List<OrderDetailDto> selectByOrdNum(String ord_num) throws Exception;
     List<OrderDetailDto> selectAllEtc(String id) throws Exception;
    //옵션변경
     int updateOption(OrderDetailDto OrderDetailDto  ) throws Exception;
     OrderDetailDto selectNumAndSeq(String ord_num, Integer seq) throws Exception;
     int updateOrdState(OrderDetailDto OrderDetailDto) throws Exception;
    //부분교환시 사용되는 주문상태 업데이트 dao
     int updateEachOrdState(OrderDetailDto OrderDetailDto);
    List<OrderDetailDto> selectPage(Map map) throws Exception;
    //찬빈 추가
    List<OrderDetailDto> selectById(String id);
    OrderDetailDto selectOrdItem(String ord_num,String item_num,String id);
    int updateReviewState(ReviewDto reviewDto);
}
