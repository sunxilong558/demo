package com.itrip.biz.service.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 酒店的业务逻辑接口
 */
public interface HotelService {
    /**
     * 查询所有酒店
     * @return
     */
    List<Hotel> getHotels();
}
